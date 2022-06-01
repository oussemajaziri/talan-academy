import { Component, OnInit } from '@angular/core';
import { FaceSnap } from '../Models/faceSnap.model';
import { FaceSnapService } from '../services/face-snaps.service';

@Component({
  selector: 'app-face-snap-list',
  templateUrl: './face-snap-list.component.html',
  styleUrls: ['./face-snap-list.component.scss']
})
export class FaceSnapListComponent implements OnInit {
  facesnapstbl !:FaceSnap[];

  constructor(private facesnapservice: FaceSnapService) { }

  ngOnInit(): void {

    this.facesnapstbl =this.facesnapservice. getAllFaceSnaps();
  }

}
