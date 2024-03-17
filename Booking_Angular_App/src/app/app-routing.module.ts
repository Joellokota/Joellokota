import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {CustomersComponent} from "./ui/customers/customers.component";
import {EstablishmentsComponent} from "./ui/establishments/establishments.component";
import {BookingsComponent} from "./ui/bookings/bookings.component";
import {AuthGuard} from "./guard/auth.guard";

const routes: Routes = [
  {path : "customers", component : CustomersComponent, canActivate: [AuthGuard], data: {roles : ['USER']}},
  {path : "establishments", component: EstablishmentsComponent},
  {path : "bookings", component : BookingsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
