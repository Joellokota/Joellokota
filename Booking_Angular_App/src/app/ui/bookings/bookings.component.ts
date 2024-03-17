import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {error} from "@angular/compiler-cli/src/transformers/util";

@Component({
  selector: 'app-bookings',
  templateUrl: './bookings.component.html',
  styleUrl: './bookings.component.css'
})
export class BookingsComponent implements OnInit{
  public listBookings : any;
  constructor(private httpClient : HttpClient) {
  }
  ngOnInit() {
    this.httpClient.get("http://localhost:9090/RESERVATION-SERVICE/bookings").subscribe(
      {
        next :data => {
          this.listBookings = data;
        }, error: err => {
          console.log(err);
        }
      }
    )
  }
}
