import { Component, OnInit } from '@angular/core';
import { NgForm} from '@angular/forms';
import { Router } from '@angular/router';
import { AuthenticationService } from '../authentication.service';
import { User } from '../user';
@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  user = new User();
  message = '';
  constructor(private service: AuthenticationService, private router: Router) { }

  ngOnInit(): void {
  }

  registerUser() {
    this.service.registerUser(this.user).subscribe(
      data => { 
        console.log("response recieved");
        this.router.navigate(['/login']);
        this.message = "Registration successful";
      },
      error => {
        console.log("exception occured");
        this.message = "User with email already exists";
        
      }        
    )  
  }

}
