import { Component,OnInit,Input} from '@angular/core';
import { FaceSnap } from '../Models/faceSnap.model';

@Component({
  selector: 'app-face-snap',
  templateUrl: './face-snap.component.html',
  styleUrls: ['./face-snap.component.scss']
})
export class FaceSnapComponent implements OnInit {
@Input() facesnap!:FaceSnap;


  buttonText!:String;

  ngOnInit(): void {

       this.buttonText='Oh Snap'

  }

  OnAddsnap(){
    
    if(this.buttonText==='Oh Snap'){
      this.buttonText='oups unsnap'
      this.facesnap.snaps++
    }
    else{
      this.buttonText='Oh Snap'
      
    }
  }

}


