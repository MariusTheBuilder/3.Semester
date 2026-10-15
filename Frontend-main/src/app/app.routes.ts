import { Routes } from '@angular/router';
import { Demo } from './components/demo/demo';
import { Exercises } from './components/exercises/exercises';

export const routes: Routes = [
  { path: '', component: Demo },
  { path: 'exercises', component: Exercises },
];
