package student_profile.java.model;

public class Student {
	
	private int userID;
	private String userName;
	private String password;
	private String address;
	private String aboutUser;
	private String phoneNumber;
	private String email;
	private String githubURL;
	private String linkedinURL;
	private String facebookURL;
	private String twitterURL;
	private String location;
	private String headline;
	private String dp;
	
	public Student(int userID, String userName, String password, String address, String aboutUser, String phoneNumber,
			String email, String githubURL, String linkedinURL, String facebookURL, String twitterURL,
			String location) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.aboutUser = aboutUser;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.githubURL = githubURL;
		this.linkedinURL = linkedinURL;
		this.facebookURL = facebookURL;
		this.twitterURL = twitterURL;
		this.location = location;
	}

	public Student(int userID, String userName, String aboutUser, String phoneNumber, String email, String githubURL,
			String linkedinURL, String facebookURL, String twitterURL, String location, String headline) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.aboutUser = aboutUser;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.githubURL = githubURL;
		this.linkedinURL = linkedinURL;
		this.facebookURL = facebookURL;
		this.twitterURL = twitterURL;
		this.location = location;
		this.headline = headline;
	}

	public Student(int userID,String email,  String userName, String phoneNumber,
			String githubURL, String linkedinURL, String facebookURL, String twitterURL) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.githubURL = githubURL;
		this.linkedinURL = linkedinURL;
		this.facebookURL = facebookURL;
		this.twitterURL = twitterURL;
	}
	
	
	public Student() {
		super();
	}

	public Student(String userName, String password, String email, String location) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.location = location;
		this.userID = -1;
	}

	public Student(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
		this.userID = -1;
	}
	
	

	public Student(int userID, String userName, String headline, String dp, String location) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.headline = headline;
		this.dp = dp;
		this.location = location;
	}
	
	
	public String getDp() {
		return dp;
	}

	public void setDp(String dp) {
		this.dp = dp;
	}

	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAboutUser() {
		return aboutUser;
	}
	public void setAboutUser(String aboutUser) {
		this.aboutUser = aboutUser;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	
	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public String getGithubURL() {
		return githubURL;
	}
	public void setGithubURL(String githubURL) {
		this.githubURL = githubURL;
	}
	public String getLinkedinURL() {
		return linkedinURL;
	}
	public void setLinkedinURL(String linkedinURL) {
		this.linkedinURL = linkedinURL;
	}
	public String getFacebookURL() {
		return facebookURL;
	}
	public void setFacebookURL(String facebookURL) {
		this.facebookURL = facebookURL;
	}
	public String getTwitterURL() {
		return twitterURL;
	}
	public void setTwitterURL(String twitterURL) {
		this.twitterURL = twitterURL;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
	
	
}
