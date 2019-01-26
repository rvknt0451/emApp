import { Component, OnInit } from '@angular/core';
import { contact } from '../models/contact-us.model';


@Component({
  templateUrl: './contact.component.html',
  styleUrls: ['./contact.component.css']
})
export class ContactComponent implements OnInit {
contact: contact = {
  name: "Ravikant kumar",
  mobile: "8147194102",
  address:"Aunta Hissatar Mokama",
  email:"erravikant@gmail.com"
}
  constructor() { }

  ngOnInit() {
  }

}
