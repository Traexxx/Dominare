import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HeaderOnComponent } from './header-on.component';

describe('HeaderOnComponent', () => {
  let component: HeaderOnComponent;
  let fixture: ComponentFixture<HeaderOnComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [HeaderOnComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(HeaderOnComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
