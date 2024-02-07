package dec26;

public class Box {
	
 int l ;
 int b ;
 int h  ;
 
 // defalut constructor 
 // automatically  present rahega
 public Box() {} ;
  
 
 // when you will create parameterize 
 // the default cons...  that jvm was giving  that will not be provided 
 //now you need defalut also if you need 
 
 public Box(int l  , int b , int h) {
	 
	 this.l = l  ;
	 this.b = b  ;
	 this.h = h  ;
	 
 }
 
 public Box( int size  ) {
	
	 this.l  = size ;
	 this.b  = size ;
	 this.h  = size ;
	 
	 
	 
 }
 
 public int volume() {
	 
	 return l*b*h ;
 }
 
 
 
 
 
   
}
