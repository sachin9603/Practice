package Anudip.EmployeeApp9284Hibernate.model;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int employeeId  ;
	
	@Size(min = 5, max = 200, message 
		      = "name must be between 5 and 200 characters")
	   @NotBlank(message = "Name is mandatory")
	private String employeeName;
	   
	   
	   @NotBlank(message = "Email is mandatory")
	    @Email(message = "Email should be valid")
	private String employeeUsername ;
	
	
		
	
	

}
