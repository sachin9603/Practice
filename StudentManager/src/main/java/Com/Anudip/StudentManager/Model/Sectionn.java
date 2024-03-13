package Com.Anudip.StudentManager.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Sectionn {
	@Id
	private int sectionId;

	private String sectionname;

	@OneToMany(mappedBy = "sectionn", cascade = CascadeType.ALL)
	private Set<Student> Studentsset = new HashSet<Student>();

	public int getSectionId() {
		return sectionId;
	}

	public void setSectionId(int sectionId) {
		this.sectionId = sectionId;
	}

	public String getSectionname() {
		return sectionname;
	}

	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}

	


	public Set<Student> getStudentsset() {
		return Studentsset;
	}

	public void setStudentsset(Set<Student> studentsset) {
		Studentsset = studentsset;
	}

	public Sectionn(int sectionId, String sectionname) {
		super();
		this.sectionId = sectionId;
		this.sectionname = sectionname;
	
	}

	public Sectionn() {
		super();
	}

	
	
	
}
