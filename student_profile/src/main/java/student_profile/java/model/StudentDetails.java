package student_profile.java.model;

import java.util.ArrayList;
import java.util.List;

public class StudentDetails {
	
	public Student student;
	public List<Certification> certifications;
	public List<Skills> skills;
	public List<Education> educations;
	
	public StudentDetails(Student student) {
		super();
		this.student = student;
		certifications = new ArrayList<>();
		skills = new ArrayList<>();
		educations = new ArrayList<>();
	} 


	
}
