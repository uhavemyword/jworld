import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, ParamMap } from '@angular/router';
import { Location } from '@angular/common';
import { Subscription } from 'rxjs';
import 'rxjs/add/operator/switchMap';

import { UserService } from '../../services';
import { UserModel } from 'app/models';

@Component({
  templateUrl: './user-detail.component.html',
  styleUrls: ['./user-detail.component.scss']
})
export class UserDetailComponent implements OnInit {

  busy: Subscription;
  user: UserModel;

  constructor(
    private userService: UserService,
    private route: ActivatedRoute,
    private location: Location
  ) { }

  ngOnInit(): void {
    this.route.paramMap
      .switchMap((params: ParamMap) => this.userService.getById(+params.get('id')))
      .subscribe(u => {
        this.user = u;
      });
  }

  goBack(): void {
    this.location.back();
  }
}
