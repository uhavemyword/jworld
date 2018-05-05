import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { NgBusyModule } from 'ng-busy';
import { UsersComponent } from './users.component';
import { AdminRoutingModule } from './admin-routing.module';
import { UserDetailComponent } from './user-detail.component';

@NgModule({
  imports: [
    CommonModule,
    NgBusyModule,
    AdminRoutingModule
  ],
  declarations: [UsersComponent, UserDetailComponent]
})
export class AdminModule { }
