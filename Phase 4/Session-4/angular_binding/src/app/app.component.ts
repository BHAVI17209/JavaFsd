import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'angular_binding';//default title
  mytitle='Angular binding';
  fname:string='Bhavitha';

  imgurl:string="./assets/images/test_img.jpg";
  h=250;
  w=250;
  flag:boolean=false;
  show(){
    this.flag=!this.flag;
  }

  red:string="red";
  we:number=700;
// Array object: 
  products=[
    {name:"pencil",available:"08-03-2022",price:10.00,rating:4.5},
    {name:"Eraser",available:"09-03-2022",price:4.00,rating:4.0},
    {name:"Scale",available:"07-03-2022",price:20.00,rating:4.3},
    {name:"Pen",available:"04-03-2022",price:5.00,rating:3.5},
  ]
}
