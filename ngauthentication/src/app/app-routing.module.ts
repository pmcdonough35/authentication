import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent} from './login/login.component';
import { LoginsuccessfulComponent} from './loginsuccessful/loginsuccessful.component';
import { RegistrationComponent } from './registration/registration.component';
import { LogoutComponent } from './logout/logout.component';
import { AuthGuardService } from './auth-guard.service';

const routes: Routes = [
  {path: '',component:LoginComponent},
  {path: 'loginsuccessful',component:LoginsuccessfulComponent, canActivate:[AuthGuardService]},
  {path: 'registration',component:RegistrationComponent},
  {path: 'login',component:LoginComponent},
  {path: 'logout', component:LogoutComponent, canActivate:[AuthGuardService]}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
