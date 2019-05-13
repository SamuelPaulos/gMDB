import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from '@angular/forms';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  loginform: FormGroup;
  constructor(private formbuilder: FormBuilder) { }

  ngOnInit() {
    this.loginform = this.formbuilder.group({
      email:['', Validators.email],
      password:['']

    })
  }

  login(){
      
  }

}
