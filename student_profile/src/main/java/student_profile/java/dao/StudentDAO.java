package student_profile.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

import student_profile.java.model.Certification;
import student_profile.java.model.Feed;
import student_profile.java.model.Student;
import student_profile.java.model.StudentDetails;
import student_profile.java.model.Skills;
import student_profile.java.model.Education;

public class StudentDAO {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/student_profile?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";
	
	private static final String INSERT_USERS_SQL = "INSERT INTO student" + "  (userName, password, email, location) VALUES "
			+ " (?, ?, ?, ?);";
	private static final String VERIFY_USER_CREDENTIALS = "select * from student where userName =? and password=?;";
	private static final String UPDATE_USERS_SQL ="UPDATE student SET userName = ?, aboutUser=?, phoneNumber= ?, email=?, facebookURL=?, "
			+ "	githubURL=?, linkedinURL=?, twitterURL=?, location=?, headline=? WHERE userID = ?;";
	
	private static final String GET_STUDENT = "SELECT * FROM student WHERE userID=?;";
	
	private static final String GET_STUDENT_SKILLS = "SELECT * FROM skills WHERE userID=?;";
	
	private static final String GET_STUDENT_CERTIFICATIONS = "SELECT * FROM certifications WHERE userID=?;";
	
	private static final String GET_STUDENT_EDUCATION = "SELECT * FROM education WHERE userID=?;";
	
	private static final String GET_FRIENDS = "SELECT * FROM student S LEFT JOIN friends F ON S.userID = F.friendID WHERE F.userID = ? "
			+ "UNION SELECT * FROM student S LEFT JOIN friends F ON S.userID = F.userID WHERE F.friendID = ?;";
	
	private static final String DELETE_FRIEND = "delete from friends where (userID = ? and friendID = ?) or (userID = ? and friendID = ?);";
	
	
//	private static final String SELECT_ALL_USERS = "select * from persons";
//	private static final String DELETE_USERS_SQL = "delete from users where id = ?;";
//	private static final String UPDATE_USERS_SQL = "update users set personID = ?,= ?, country =? where id = ?;";
	
	protected Connection getConnection() {
		Connection connection = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}
	
	public Student signUpUser(Student student) throws SQLException {
		System.out.println(INSERT_USERS_SQL);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
			PreparedStatement preparedStatement1 = connection.prepareStatement(INSERT_USERS_SQL);
			PreparedStatement preparedStatement2 = connection.prepareStatement(VERIFY_USER_CREDENTIALS);) {
//			preparedStatement.setInt(1, student.getPersonID());
			preparedStatement1.setString(1, student.getUserName());
			preparedStatement1.setString(2, student.getPassword());
			preparedStatement1.setString(3, student.getEmail());
			preparedStatement1.setString(4, student.getLocation());
//			preparedStatement.setString(3, student.getCountry());
			System.out.println("statement 1 " + preparedStatement1);
			preparedStatement1.executeUpdate();
			
			preparedStatement2.setString(1, student.getUserName());
			preparedStatement2.setString(2, student.getPassword());

//			preparedStatement.setString(3, student.getCountry());
			
			System.out.println(preparedStatement2);
			
			ResultSet rs = preparedStatement2.executeQuery();
			if(rs.next())
			{
				
				student.setUserID(rs.getInt("userID"));
			//	System.out.println("ada poda" + rs.getInt("userID"));
				return student;
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return student;
	}
	
	public Student signInUser(Student student) throws SQLException {
//		System.out.println(INSERT_USERS_SQL);
		
		// try-with-resource statement will auto close the connection.
//		ResultSet rs = null;
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(VERIFY_USER_CREDENTIALS)) {
//			preparedStatement.setInt(1, student.getPersonID());
			System.out.println("asdasd" + student.getUserName());
			preparedStatement.setString(1, student.getUserName());
			preparedStatement.setString(2, student.getPassword());

//			preparedStatement.setString(3, student.getCountry());
			
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();

			if(rs.next())
			{
				
				student.setUserID(rs.getInt("userID"));
//				System.out.println("ada poda" + rs.getInt("userID"));
				return student;
			}
			else
				return student;

//			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
		return student;
	}
	
	public void editUser(Student student) throws SQLException{
		try (Connection connection = getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
				
//			preparedStatement.setInt(1, student.getPersonID());
			preparedStatement.setString(1, student.getUserName());
			preparedStatement.setString(2, student.getAboutUser());
			preparedStatement.setString(3, student.getPhoneNumber());
			preparedStatement.setString(4, student.getEmail());
			preparedStatement.setString(5, student.getFacebookURL());
			preparedStatement.setString(6, student.getGithubURL());
			preparedStatement.setString(7, student.getLinkedinURL());
			preparedStatement.setString(8, student.getTwitterURL());
			preparedStatement.setString(9, student.getLocation());
			preparedStatement.setString(10, student.getHeadline());
			preparedStatement.setInt(11, student.getUserID());
			//pass studentID to update
			
			System.out.println(preparedStatement);	
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
	}
	
	
//	public List<Student> selectAllUsers() {
//
//		// using try-with-resources to avoid closing resources (boiler plate code)
//		List<Student> users = new ArrayList<>();
//		// Step 1: Establishing a Connection
//		try (Connection connection = getConnection();
//
//				// Step 2:Create a statement using connection object
//			PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
//			System.out.println(preparedStatement);
//			// Step 3: Execute the query or update query
//			ResultSet rs = preparedStatement.executeQuery();
//
//			// Step 4: Process the ResultSet object.
//			while (rs.next()) {
//				int id = rs.getInt("personID");
//				String firstName = rs.getString("firstName");
//				String address = rs.getString("address");
//				System.out.println(id +" " + firstName + " " + address);
//				users.add(new Student(firstName, address));
//			}
//		} catch (SQLException e) {
//			printSQLException(e);
//		}
//		return users;
//	}
	
	public Student getStudent(int userID)
	{
		Student student = new Student();
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(GET_STUDENT)) {
//			preparedStatement.setInt(1, student.getPersonID());
			preparedStatement.setString(1, String.valueOf(userID));

//			preparedStatement.setString(3, student.getCountry());
			
			System.out.println(preparedStatement);
			ResultSet rs = preparedStatement.executeQuery();
			
			if(rs.next())
			{
				student.setUserID(rs.getInt("userID"));
				student.setUserName(rs.getString("userName"));
				student.setAboutUser(rs.getString("aboutUser"));
				student.setPhoneNumber(rs.getString("phoneNumber"));
				student.setEmail(rs.getString("email"));
				student.setGithubURL(rs.getString("githubURL"));
				student.setLinkedinURL(rs.getString("linkedinURL"));
				student.setFacebookURL(rs.getString("facebookURL"));
				student.setTwitterURL(rs.getString("twitterURL"));
				student.setLocation(rs.getString("location"));
				student.setHeadline(rs.getString("headline"));
				
//				System.out.println("ada poda" + rs.getInt("userID"));
				return student;
			}
			else
				return student;

//			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
			return student;
		}
		
	}
	
	public void deleteFriend(int userID, int friendID)
	{
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(DELETE_FRIEND)) {
					
//				preparedStatement.setInt(1, student.getPersonID());
				preparedStatement.setString(1, String.valueOf(userID));
				preparedStatement.setString(2, String.valueOf(friendID));
				preparedStatement.setString(3, String.valueOf(friendID));
				preparedStatement.setString(4, String.valueOf(userID));
	
				//pass studentID to update
				
				System.out.println(preparedStatement);	
				preparedStatement.executeUpdate();
			} catch (SQLException e) {
				printSQLException(e);
			}
	}
	
	public List<Student> getFriends(int id)
	{
		List<Student> friends = new ArrayList<>();
		
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(GET_FRIENDS);) {
			preparedStatement.setString(1, String.valueOf(id));
			preparedStatement.setString(2, String.valueOf(id));
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int userID = rs.getInt("userID");
				String name = rs.getString("userName");
				String headline = rs.getString("headline");
				String dp = "https://randomuser.me/api/portraits/men/"+userID+".jpg";
				String location = rs.getString("location");
				friends.add(new Student(userID, name, headline, dp, location));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		
		return friends;
	}
	
	public StudentDetails getStudentDetails(int id)
	{
		Student student = getStudent(id);
		StudentDetails studentDetails = new StudentDetails(student);
		
		try (Connection connection = getConnection();
				PreparedStatement skills = connection.prepareStatement(GET_STUDENT_SKILLS);
				PreparedStatement certifications = connection.prepareStatement(GET_STUDENT_CERTIFICATIONS);
				PreparedStatement educations = connection.prepareStatement(GET_STUDENT_EDUCATION);) {
//				preparedStatement.setInt(1, student.getPersonID());
				skills.setString(1, String.valueOf(id));
				certifications.setString(1, String.valueOf(id));
				educations.setString(1, String.valueOf(id));
				System.out.println(skills);
				System.out.println(certifications);
				System.out.println(educations);
				ResultSet rs = skills.executeQuery();
				
				while (rs.next()) {
					String skillTitle = rs.getString("skillTitle");
					studentDetails.skills.add(new Skills(id, skillTitle));
				}
				
				rs = certifications.executeQuery();
				
				while (rs.next()) {
					String title = rs.getString("title");
					String description = rs.getString("description");
					String period = rs.getString("period");
					String imageURL = rs.getString("imageURL");
					studentDetails.certifications.add(new Certification(id,title, description, period, imageURL));
				}
				
				rs = educations.executeQuery();
	
				while (rs.next()) {
					String institution = rs.getString("institution");
					String qualification = rs.getString("qualification");
					String period = rs.getString("period");
					String imageURL = rs.getString("imageURL");
					studentDetails.educations.add(new Education(id,institution, qualification, period, imageURL));
				}
//				preparedStatement.setString(3, student.getCountry());
				
				return studentDetails;
			} catch (SQLException e) {
				printSQLException(e);
			}
		
		return studentDetails;
	}

	
	private void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}
