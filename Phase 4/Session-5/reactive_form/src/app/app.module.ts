import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {ReactiveFormsModule} from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { PipesComponent } from './pipes/pipes.component';
import { ProductlistComponent } from './productlist/productlist.component';
import { ProductService } from './product.service';
import { ChangeColorDirective } from './ChangeColorDirective';
import { HighLightDirective } from './HighLightDirective';
import { CustomPipe } from './CustomPipe';
import { SwitchdemoComponent } from './switchdemo/switchdemo.component';
@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    ProductlistComponent,
    ChangeColorDirective,
    HighLightDirective,
    PipesComponent,
    CustomPipe,
    SwitchdemoComponent,
    
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule
  ],
  providers: [ProductService],
  bootstrap: [AppComponent]
})
export class AppModule { }
