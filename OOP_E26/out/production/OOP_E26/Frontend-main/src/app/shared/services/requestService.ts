import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class RequestService {
  private http = inject(HttpClient);

  // Kalder Spring direkte på localhost:8080 (kræver CORS i backenden)
  private readonly url = 'http://localhost:8080/api/example/greeting';

  getGreeting(): Observable<string> {
    // Backend returnerer ren tekst (String), ikke JSON
    return this.http.get(this.url, { responseType: 'text' });
  }

  getIndex() {
    return this.http.get('http://localhost:8080/api/example', {responseType: "text"})
  }

  postName(name: string) {
    return this.http.post(`http://localhost:8080/api/example/submit-name/${encodeURIComponent(name)}`, null, { responseType: 'text' });
  }
}
