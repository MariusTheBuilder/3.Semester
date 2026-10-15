import { ChangeDetectorRef, Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Observable, Subscription } from 'rxjs';
import { ExercisesService } from '../../shared/services/exercisesService';

interface ExerciseInput {
  label: string;
  type: 'text' | 'number';
  value: string;
}

interface ExerciseRequest {
  method: 'GET' | 'POST';
  path: string;
  description: string;
  expected: string;
  inputs: ExerciseInput[];
  send: (values: string[]) => Observable<unknown>;
  subscription?: Subscription;
  response: string;
}

@Component({
  imports: [FormsModule],
  selector: 'Exercises',
  styleUrl: './exercises.css',
  templateUrl: './exercises.html',
})
export class Exercises {

  public requests: ExerciseRequest[];

  constructor(private exercisesService: ExercisesService, private changeDetector: ChangeDetectorRef) {
    this.requests = [
      this.createRequest('GET', '/api/exercises/hello',
        'Lav et GET-endpoint på /api/exercises/hello, der returnerer en String.',
        'Status 200 og en String, fx: Hello from Exercises',
        [],
        () => this.exercisesService.getHello()),

      this.createRequest('GET', '/api/exercises/random-number',
        'Lav et GET-endpoint på /api/exercises/random-number, der returnerer et tilfældigt heltal (int) mellem 1 og 100.',
        'Status 200 og en int, fx: 42',
        [],
        () => this.exercisesService.getRandomNumber()),

      this.createRequest('GET', '/api/exercises/is-online',
        'Lav et GET-endpoint på /api/exercises/is-online, der returnerer en boolean. Den skal altid returnere true.',
        'Status 200 og en boolean: true',
        [],
        () => this.exercisesService.getIsOnline()),

      this.createRequest('POST', '/api/exercises/echo/{message}',
        'Lav et POST-endpoint på /api/exercises/echo/{message}. Beskeden kommer fra URL\'en (@PathVariable) og skal returneres som en String.',
        'Kald med Hej fra frontend giver status 200 og en String: Hej fra frontend',
        [{ label: 'message', type: 'text', value: 'Hej fra frontend' }],
        ([message]) => this.exercisesService.postEcho(message)),

      this.createRequest('POST', '/api/exercises/add/{a}/{b}',
        'Lav et POST-endpoint på /api/exercises/add/{a}/{b}. a og b er heltal fra URL\'en (@PathVariable). Returnér summen som en int.',
        'Kald med 2 og 3 giver status 200 og en int: 5',
        [
          { label: 'a', type: 'number', value: '2' },
          { label: 'b', type: 'number', value: '3' },
        ],
        ([a, b]) => this.exercisesService.postAdd(Number(a), Number(b))),

      this.createRequest('POST', '/api/exercises/divide/{a}/{b}',
        'Lav et POST-endpoint på /api/exercises/divide/{a}/{b}. a og b er heltal fra URL\'en (@PathVariable). Returnér a divideret med b som en double. Husk at undgå heltalsdivision.',
        'Kald med 7 og 2 giver status 200 og en double: 3.5',
        [
          { label: 'a', type: 'number', value: '7' },
          { label: 'b', type: 'number', value: '2' },
        ],
        ([a, b]) => this.exercisesService.postDivide(Number(a), Number(b))),
    ];
  }

  // Sender alle 6 requests til backenden
  public send() {
    for (const request of this.requests) {
      request.subscription?.unsubscribe();
      request.response = '';

      request.subscription = request.send(request.inputs.map(input => input.value)).subscribe({
        next: value => {
          request.response = typeof value === 'string' ? value : JSON.stringify(value, null, 2);
          // Komponenten er OnPush, så vi skal selv fortælle Angular at UI'et skal opdateres
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

  private createRequest(
    method: 'GET' | 'POST',
    path: string,
    description: string,
    expected: string,
    inputs: ExerciseInput[],
    send: (values: string[]) => Observable<unknown>
  ): ExerciseRequest {
    return { method, path, description, expected, inputs, send, response: '' };
  }
}
