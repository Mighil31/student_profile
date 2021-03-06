package student_profile.java.model;

import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;

public class Feed {
	
	private int userID;
	private int feedID;
	private String feedTitle;
	private String feedDescription;
	private String feedTime;
	private int likeCount;
	private String mediaType;
	private String mediaURL;
	private String userName;
	private String headline;
	private String dp;
	
	public Feed(int userID, int feedID, String feedTitle, String feedDescription, int likeCount, String mediaType,
			String mediaURL) {
		super();
		this.userID = userID;
		this.feedID = feedID;
		this.feedTitle = feedTitle;
		this.feedDescription = feedDescription;
		this.likeCount = likeCount;
		this.mediaType = mediaType;
		this.mediaURL = mediaURL;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    LocalDateTime now = LocalDateTime.now(); 
		this.feedTime = dtf.format(now);
	}
	
	

	public Feed(int userID, String userName, String feedDescription, String mediaURL) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.likeCount = 0;
		this.feedDescription = feedDescription;
		this.mediaURL = mediaURL;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    LocalDateTime now = LocalDateTime.now(); 
		this.feedTime = dtf.format(now);
//		this.dp = dp;
	}
	
	public Feed(int userID, String feedDescription, String mediaURL) {
		super();
		this.userID = userID;
		this.likeCount = 0;
		this.feedDescription = feedDescription;
		this.mediaURL = mediaURL;
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
	    LocalDateTime now = LocalDateTime.now(); 
		this.feedTime = dtf.format(now);
	}
	public Feed(int userID, String userName, String feedDescription, String mediaURL,String feedTime,  String headline, String dp) {
		super();
		this.userID = userID;
		this.likeCount = 0;
		this.userName = userName;
		this.feedDescription = feedDescription;
		this.mediaURL = mediaURL;
		this.headline = headline;
		this.feedTime = feedTime;
		this.dp = dp;
	}
		
	public String getFeedTime() {
		return feedTime;
	}

	public void setFeedTime(String feedDate) {
		this.feedTime = feedDate;
	}

	public int getUserID() {
		return userID;
	}

	public String getDp() {
		return dp;
	}

	public void setDp(String dp) {
		this.dp = dp;
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

	public int getFeedID() {
		return feedID;
	}

	public void setFeedID(int feedID) {
		this.feedID = feedID;
	}

	public String getFeedTitle() {
		return feedTitle;
	}

	public void setFeedTitle(String feedTitle) {
		this.feedTitle = feedTitle;
	}

	public String getFeedDescription() {
		return feedDescription;
	}

	public void setFeedDescription(String feedDescription) {
		this.feedDescription = feedDescription;
	}

	public int getLikeCount() {
		return likeCount;
	}

	public void setLikeCount(int likeCount) {
		this.likeCount = likeCount;
	}

	public String getMediaType() {
		return mediaType;
	}

	public void setMediaType(String mediaType) {
		this.mediaType = mediaType;
	}
	
	public String getHeadline() {
		return headline;
	}

	public void setHeadline(String headline) {
		this.headline = headline;
	}



	public String getMediaURL() {
		return mediaURL;
	}

	public void setMediaURL(String mediaURL) {
		this.mediaURL = mediaURL;
	}
	
	
}
