import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginsuccessfulComponent } from './loginsuccessful.component';

describe('LoginsuccessfulComponent', () => {
  let component: LoginsuccessfulComponent;
  let fixture: ComponentFixture<LoginsuccessfulComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginsuccessfulComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginsuccessfulComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
