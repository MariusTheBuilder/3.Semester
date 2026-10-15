import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { Observable } from 'rxjs';

// Opgave til eleverne: Lav en ExercisesController i backenden med endpoints,
// der matcher præcis de 6 kald herunder (metode og URL).
// Alle endpoints returnerer kun én simpel værdi: String, int, double eller boolean.
// Frontend læser alle svar som tekst, så den skal ikke ændres.
@Injectable({ providedIn: 'root' })
export class ExercisesService {
  private http = inject(HttpClient);

  private readonly baseUrl = 'http://localhost:8080/api/exercises';

  // ---------- GET ----------

  // Backend returnerer en String
  getHello(): Observable<string> {
    return this.http.get(`${this.baseUrl}/hello`, { responseType: 'text' });
  }

  // Backend returnerer en int
  getRandomNumber(): Observable<string> {
    return this.http.get(`${this.baseUrl}/random-number`, { responseType: 'text' });
  }

  // Backend returnerer en boolean
  getIsOnline(): Observable<string> {
    return this.http.get(`${this.baseUrl}/is-online`, { responseType: 'text' });
  }

  // ---------- POST ----------

  // Beskeden ligger i URL'en -> backend returnerer samme besked som en String
  postEcho(message: string): Observable<string> {
    return this.http.post(`${this.baseUrl}/echo/${encodeURIComponent(message)}`, null, { responseType: 'text' });
  }

  // a og b ligger i URL'en -> backend returnerer summen som en int
  postAdd(a: number, b: number): Observable<string> {
    return this.http.post(`${this.baseUrl}/add/${a}/${b}`, null, { responseType: 'text' });
  }

  // a og b ligger i URL'en -> backend returnerer a / b som en double
  postDivide(a: number, b: number): Observable<string> {
    return this.http.post(`${this.baseUrl}/divide/${a}/${b}`, null, { responseType: 'text' });
  }
}
