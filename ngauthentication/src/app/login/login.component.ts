import { Component, OnInit } from '@angular/core';
import { NgForm} from '@angular/forms';
import { AuthenticationService } from '../authentication.service';
import { User } from '../user';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  user = new User();
  message = '';

  constructor(private service: AuthenticationService, private router: Router) { }

  ngOnInit(): void {
  }

  loginUser(){
    this.service.loginUser(this.user).subscribe(
      data => { 
        console.log("response recieved");
        sessionStorage.setItem("emailId", this.user.emailId);
        this.router.navigate(['/loginsuccessful']);
      },
      error => {
        console.log("exception occured");
        this.message = "Invalid credentials, enter valid id and password";
      }
    )
  }
}
