import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { LinesComponent } from './lines.component';

import { MatGridListModule, MatIconModule, MatBadgeModule, MatTabsModule } from '@angular/material';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { User } from '../model/User';
import { Network } from '../model/Network';

describe('LinesComponent', () => {
  let component: LinesComponent;
  let fixture: ComponentFixture<LinesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ LinesComponent ],
      imports: [
        HttpClientTestingModule,
        MatTabsModule,
        MatGridListModule,
        MatIconModule,
        MatBadgeModule,
      ],
      providers: [
        User,
        Network
      ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(LinesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
