package oops_concept.encapsulation;

//har class ki ek prenet class hoti hi hai vo hai object class  
public class Student {
 /// sare variable private
 /// getter setter 
 /// toString 
 /// Default construtor 
 /// parameterize construcator 
 /// 
	 private int sid;
	 private   String sname ;
	 private  String sub  ;
	
	
	// accessmodifiers  ---- public protected default private 
	//private ---- you can access in ony same class 
	//default  ----- you can access in same class and same pakage  
	//protected   --- same class or different package by child cass 
	// pulbic ----entire project 
	 
	 
	 // its method to access this private variable
	 
	 
	 // getter and setter 
	 
	 // setter 
	 public void setSid(int id) {
		 this.sid  = id  ;
		 
	 }
	 
	 
	 // getter 
	 
	 public int getSid()  {
		 return sid ;
		 
	 }


	 public String getSname() {
		 return sname;
	 }


	 public void setSname(String sname) {
		 this.sname = sname;
	 }


	 public String getSub() {
		 return sub;
	 }


	 public void setSub(String sub) {
		 this.sub = sub;
	 }
	 
	 // constructor  ;
	 
	 
	 
	 /// this are the special method which return object of that class 
	
	 
	 // but internally this method are returnin object of this studnet class
	 // default construtor
	  public  Student () {
		  super() ;
	  }


	
	  // parameterize contructor then you need to create a default also 
	 
	  public Student(int sid, String sname, String sub) {
		     super() ; // this super() is calling parent class contructor 
			this.sid = sid;
			this.sname = sname;
			this.sub = sub;
		 }


	 
		 
		 
	// display method banadu 
		 
		// toString --- ek special method jo ki kisi bhi object ka string representation katri hai 
	  @Override // kyuki ye method pehle bhi  declare  huyi hai or jaha declare huyi hai vo is student ki parent classs hai 
	  public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sub=" + sub + "]";
	  }  ;
		  
		 
		 
		 
		 
	
	
	
	
	
}
