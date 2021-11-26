package student_profile.java.model;

public class Skills {
	public int userID;
	public String skillTitle;
	
	public Skills(int userID, String skillTitle) {
		super();
		this.userID = userID;
		this.skillTitle = skillTitle;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

	public String getSkillTitle() {
		return skillTitle;
	}

	public void setSkillTitle(String skillTitle) {
		this.skillTitle = skillTitle;
	}
	
	
}