package Anudip.BasicCrud.Relation12M;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.Email;








@Entity
public class Phoneuser {
	
	
	@Id
	private int id  ;
	
	@Email(message = "Email should be valid")
	private String email  ;
	 
	private String name  ;
	
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name  = "USERID")
	private List<Phone>  phoneTables ;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Phone> getPhoneTables() {
		return phoneTables;
	}


	public void setPhoneTables(List<Phone> phoneTables) {
		this.phoneTables = phoneTables;
	}
	public Phoneuser() {};
	
		

	public Phoneuser(int id, @Email(message = "Email should be valid") String email, String name,
			List<Phone> phoneTables) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.phoneTables = phoneTables;
	}


	@Override
	public String toString() {
		return "Phoneuser [id=" + id + ", email=" + email + ", name=" + name + ", phoneTables=" + phoneTables + "]";
	}
	
	
	
	
	

}
