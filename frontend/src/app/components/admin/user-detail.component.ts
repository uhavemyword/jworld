import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router, ParamMap } from '@angular/router';
import { Location } from '@angular/common';
import { Subscription } from 'rxjs';
import 'rxjs/add/operator/switchMap';

import { UserService, DialogService } from '../../services';
import { UserModel } from 'app/models';

@Component({
  templateUrl: './user-detail.component.html',
  styleUrls: ['./user-detail.component.scss']
})
export class UserDetailComponent implements OnInit {

  busy: Subscription;
  model: UserModel;

  constructor(
    private userService: UserService,
    private activatedRoute: ActivatedRoute,
    private router: Router,
    private location: Location,
    private dialogService: DialogService
  ) { }

  ngOnInit(): void {
    this.activatedRoute.paramMap
      .switchMap((params: ParamMap) => this.userService.getById(+params.get('id')))
      .subscribe(u => {
        this.model = u;
      });
  }

  update() {
    this.userService
      .update(this.model)
      .subscribe(() => {
        this.dialogService.success(
          'User has been updated.',
          'Success',
          () => {
            this.router.navigate(['/admin/users/']);
          }
        );
      });
  }

  goBack(): void {
    this.location.back();
  }
}
