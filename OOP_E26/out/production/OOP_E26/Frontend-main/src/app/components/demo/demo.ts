import { ChangeDetectorRef, Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Observable } from 'rxjs';
import { RequestService } from '../../shared/services/requestService';

interface DemoInput {
  label: string;
  type: 'text' | 'number';
  value: string;
}

interface DemoRequest {
  method: 'GET' | 'POST';
  path: string;
  inputs: DemoInput[];
  send: (values: string[]) => Observable<unknown>;
  response: string;
}

@Component({
  imports: [FormsModule],
  selector: 'Demo',
  styleUrl: './demo.css',
  templateUrl: './demo.html',
})
export class Demo {

  public requests: DemoRequest[];

  constructor(private requestService: RequestService, private changeDetector: ChangeDetectorRef) {
    this.requests = [
      {
        method: 'GET',
        path: '/api/example/greeting',
        inputs: [],
        send: () => this.requestService.getGreeting(),
        response: ''
      },
      {
        method: 'POST',
        path: '/api/example/submit-name/{name}',
        inputs: [{ label: 'name', type: 'text', value: 'Mads' }],
        send: ([name]) => this.requestService.postName(name),
        response: ''
      },
    ];
  }

  // Sender alle requests til backenden
  public send() {
    for (const request of this.requests) {
      request.response = '';

      request.send(request.inputs.map(input => input.value)).subscribe({
        next: value => {
          request.response = typeof value === 'string' ? value : JSON.stringify(value, null, 2);
          // Komponenten er OnPush, så vi skal selv fortælle Angular at UI'et skal opdateres
          console.log(value);
          this.changeDetector.markForCheck();
        },
        error: err => {
          request.response = `${err.status} ${err.statusText}`;
          this.changeDetector.markForCheck();
          console.log('Error on', request.method, request.path, err);
        }
      });
    }
  }

  // Opdaterer kun UI'et - sender ingen requests og rører ikke responses eller inputs
  public refresh() {
    this.changeDetector.detectChanges();
  }
}
