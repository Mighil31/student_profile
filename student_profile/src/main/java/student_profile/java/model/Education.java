package student_profile.java.model;

public class Education {
	public int userID;
	public String institution;
	public String qualification;
	public String period;
	public String imageURL;
	
	public Education(int userID, String institution, String qualification, String period, String imageURL) {
		super();
		this.userID = userID;
		this.institution = institution;
		this.qualification = qualification;
		this.period = period;
		this.imageURL = imageURL;
	}
	
	
}
