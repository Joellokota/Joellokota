import {Component, OnInit} from '@angular/core';
import {KeycloakService} from "keycloak-angular";
import {KeycloakProfile} from "keycloak-js";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{
  title = 'booking_angular_app';
  public profile! : KeycloakProfile;

  constructor(public keycloservice : KeycloakService) {
  }
  ngOnInit() {
    if (this.keycloservice.isLoggedIn()){
      this.keycloservice.loadUserProfile().then(
        data => {
          this.profile = data;
        }
      )
    }
  }

  async handleLogin() {
    await this.keycloservice.login(
      {
        redirectUri: window.location.origin
      }
    )
  }

  handleLogout() {
    this.keycloservice.logout(window.location.origin)
  }
}
