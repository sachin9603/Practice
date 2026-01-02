package oops_concept.abstraction;

public class PNB extends Bank{
	
	public PNB() {
		super() ;// parent k cons. call 
	}

	@Override
	public void intrest() {
		// TODO Auto-generated method stub
		
		System.out.println("intreset rate of 7 %");
		
	}
	
	public static void main(String[] args) {
		
		Bank b = new PNB()  ;
		
		//Bank b2  = new Bank() ; you can not create  object of this Bank Class 
		b.bankLogo();
		b.intrest();
		
		// 
		
		
	}

}
