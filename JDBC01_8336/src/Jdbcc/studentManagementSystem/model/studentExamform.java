package studentManagementSystem.model;

public class studentExamform {

	 private Integer formid  ;
	 private Integer   studentID  ;
	  private Double   formPrice  ;
	  
	public Integer getFormid() {
		return formid;
	}
	public void setFormid(Integer formid) {
		this.formid = formid;
	}
	public Integer getStudentID() {
		return studentID;
	}
	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}
	public Double getFormPrice() {
		return formPrice;
	}
	public void setFormPrice(Double formPrice) {
		this.formPrice = formPrice;
	}
	public studentExamform(Integer formid, Integer studentID, Double formPrice) {
		super();
		this.formid = formid;
		this.studentID = studentID;
		this.formPrice = formPrice;
	}
	  
	public studentExamform()  {}  ;
	
	  
}
