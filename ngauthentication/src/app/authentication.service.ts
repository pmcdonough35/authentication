import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AuthenticationService {

  constructor(private http: HttpClient) { }

  public loginUser(user: User):Observable<any> {
    return this.http.post<any>("http://localhost:8080/login", user)  
  }

  public isUserLoggedIn() {
    let emailId = sessionStorage.getItem('emailId')
    console.log(!(emailId === null))
    return !(emailId === null)
  }

  logOut() {
    sessionStorage.removeItem('emailId')
  }

  public registerUser(user: User):Observable<any> {
    return this.http.post<any>("http://localhost:8080/registeruser", user)  
  }
}
