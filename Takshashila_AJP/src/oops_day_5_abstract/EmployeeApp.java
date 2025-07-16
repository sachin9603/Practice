package oops_day_5_abstract;


public interface EmployeeApp {
	// public abstract 
      void login() ;

	public void logout() ;
	

	public void updateDetails() ;
	

	public void dowloadSalarySlip() ;
	
	
	public static void  appLogo() {
		System.out.println("haathi ka baccha");
	}
	
	
	default void save() {
		
		System.out.println("saving details ");
	}

	private void run() {
		System.out.println("all are runnign");
	}



}
