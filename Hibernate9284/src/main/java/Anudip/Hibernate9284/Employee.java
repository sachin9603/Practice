package Anudip.Hibernate9284;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "CompanyEmployee")
//@NamedQuery(query  = "select e from Employee e where e.id = :id" , name = "find_emp_by id")


@NamedNativeQuery(
	name  = "Employee.findAllEmployee" ,
	
	query  = "select * from CompanyEmployee" , resultClass  = Employee.class
)
@Getter
@Setter

@AllArgsConstructor
@ToString
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) /// agr ye aap laga rahe ho toh khud se primary nahi dena hai 
	
	private int  eid  ; 
	
	@NotNull(message = "Name cannot be null")
    @Size(min = 2, max = 50, message = "Name must be between 2 and 50 characters")
	@Column(name  = "EmpName")
	private String  ename  ;
	
	@Transient
	private String dep  ;
	
	@Temporal(TemporalType.DATE )
	 Date myObj = new Date(); ; // Create a date object
	 
	 
	    // System.out.println(myObj); // Display the current date
	
	
	//  GenerationType.auto --- khud ki table  table banayega  hibernate sequence
	//  GenerationType.IDENTITY)  -----> data base increment freature use karega ( GenerationType.IDENTITY))
	//                 .Table mai ek table bangeaa 
	//GenerationType.SEQUENCE  -- it uses sequence feature of data base 
	
	
	
	public Employee( String ename)  {
		
	
		this.ename = ename;
		
	}
	
	public Employee()  {
		
		
		
		
	}
	
	
	
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", dep=" + dep + "]";
	} ;
	
	
	

}
