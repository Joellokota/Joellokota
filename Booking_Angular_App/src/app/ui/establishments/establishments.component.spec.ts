import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EstablishmentsComponent } from './establishments.component';

describe('EstablishmentsComponent', () => {
  let component: EstablishmentsComponent;
  let fixture: ComponentFixture<EstablishmentsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [EstablishmentsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(EstablishmentsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
