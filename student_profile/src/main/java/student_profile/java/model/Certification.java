package student_profile.java.model;

public class Certification {
	public int userID;
	public String title;
	public String description;
	public String period;
	public String imageURL;
	
	public Certification(int userID, String title, String description, String period, String imageURL) {
		super();
		this.userID = userID;
		this.title = title;
		this.description = description;
		this.period = period;
		this.imageURL = imageURL;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getImageURL() {
		return imageURL;
	}

	public void setImageURL(String imageURL) {
		this.imageURL = imageURL;
	}
	
	
	
}
