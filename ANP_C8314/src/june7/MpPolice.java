package june7;

public class MpPolice {

   String  name    ;
   
   double salary   ;
   
     
   public MpPolice(String name , double salary  ) {
	   
	   this.name  = name  ;
	   this.salary = salary ;
	   
	   
   }
   
   public MpPolice (MpPolice p) {
	   
	   this.name = p.name ;
	   this.salary = p.salary ;
	   
	   
   }
    
    
   public static void main(String[] args) {
	   
	   
	   MpPolice p  = new MpPolice("rahul" , 55000) ; 
	   
	   
	   
	   MpPolice pp = new MpPolice(p) ;
	   
	   
	   System.out.println(pp.name);
	   
}
	
	   

}
