import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-customers',
  templateUrl: './customers.component.html',
  styleUrl: './customers.component.css'
})
export class CustomersComponent implements OnInit{

  public customers : any;

  constructor(private httpClient : HttpClient) {
  }
  ngOnInit() {
    this.httpClient.get("http://localhost:9090/CLIENT-SERVICE/customers").subscribe(
      {
        next : data => {
          this.customers = data;
        }, error : err => {
          console.log(err);
        }
      }
    )
  }
}
