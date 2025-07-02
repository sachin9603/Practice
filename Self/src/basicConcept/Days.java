package basicConcept;
//"Enums can also have fields, constructors, and methods.
//Let’s say you want to associate working hours with each day."
public enum Days {
   
	
	 MONDAY(8), TUESDAY(8), WEDNESDAY(8),
	    THURSDAY(8), FRIDAY(6), SATURDAY(0), SUNDAY(0);
	
	
	  private int workingHours;

	    Days(int hours) {
	        this.workingHours = hours;
	    }
    
	    public int getWorkingHours() {
	        return workingHours;
	    }
    

}
