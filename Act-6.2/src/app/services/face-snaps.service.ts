import { Injectable } from "@angular/core";
import { FaceSnap } from "../Models/faceSnap.model";

@Injectable({providedIn :'root'})
export class FaceSnapService{

    facesnapstbl : FaceSnap[]=[
      
        {
          title: 'Annonce',
         description :'Annonce annimaux',
         createdDate:new Date(),
         snaps: 50,
         imageUrl:'https://images-wixmp-530a50041672c69d335ba4cf.wixmp.com/templates/image/9416351a3e3241259b6dd53761b5caf6.jpg ',
         location:'Nabeul'
       },
  
       {
        title: 'Annonce',
       description :'Annonce annimaux',
       createdDate:new Date(),
       snaps: 0,
       imageUrl:'https://fr.cdn.v5.futura-sciences.com/buildsv6/images/wide1920/e/6/0/e601e57ecf_109735_11-863.jpg ',
       location:'Hamamet'
     },
  
     
  {
    title: 'Annonce',
   description :'Annonce annimaux',
   createdDate:new Date(),
   snaps: 0,
   imageUrl:'https://images-wixmp-530a50041672c69d335ba4cf.wixmp.com/templates/image/9416351a3e3241259b6dd53761b5caf6.jpg ',
   
  },
  
  {
    title: 'Annonce',
   description :'Annonce annimaux',
   createdDate:new Date(),
   snaps: 0,
   imageUrl:'https://images-wixmp-530a50041672c69d335ba4cf.wixmp.com/templates/image/9416351a3e3241259b6dd53761b5caf6.jpg ',
   
  }
  
  
  
  
      ];

      getAllFaceSnaps():FaceSnap[]{
          return this.facesnapstbl
      }

}