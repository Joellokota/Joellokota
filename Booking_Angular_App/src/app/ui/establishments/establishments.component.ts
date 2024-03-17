import {Component, OnInit} from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Component({
  selector: 'app-establishments',
  templateUrl: './establishments.component.html',
  styleUrl: './establishments.component.css'
})
export class EstablishmentsComponent implements OnInit{

  public listEtablishments : any;
  constructor(private httpClient : HttpClient) {
  }
  ngOnInit() {
    this.httpClient.get("http://localhost:9090/ETABLISSEMENT-SERVICE/etablishments")
      .subscribe(
        {
          next: data => {
            this.listEtablishments = data;
          }, error: err => {
            console.log(err);
          }
        }
      )
  }
}
