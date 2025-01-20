package studentManagementSystem.model;

public class Standard {
//    ClassID INT PRIMARY KEY,
//    className VARCHAR(225),
//    section VARCHAR(225)
	
	
	private int  classID  ;
	private String className ; 
	private String section ;
	
	
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public Standard(int classID, String className, String section) {
		super();
		this.classID = classID;
		this.className = className;
		this.section = section;
	}
	
	public Standard() {} ;
	
	
	
	

}
