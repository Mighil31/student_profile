package student_profile.java.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import student_profile.java.model.Feed;
import student_profile.java.model.Student;

public class FeedsDAO {
	
	private String jdbcURL = "jdbc:mysql://localhost:3306/student_profile?useSSL=false";
	private String jdbcUsername = "root";
	private String jdbcPassword = "root";
	
	private static final String INSERT_NEW_FEED = "INSERT INTO feeds" + "  (userID, feedTime, feedDescription, mediaURL) VALUES "
			+ " (?, ?, ?, ?);";
	private static final String GET_FEED_ITEMS = "select * from student, feeds where student.userID = feeds.userID;";
	
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

	
	public List<Feed> getFeedItems() {

		// using try-with-resources to avoid closing resources (boiler plate code)
		List<Feed> feed_items = new ArrayList<>();
		// Step 1: Establishing a Connection
		try (Connection connection = getConnection();

				// Step 2:Create a statement using connection object
			PreparedStatement preparedStatement = connection.prepareStatement(GET_FEED_ITEMS);) {
			System.out.println(preparedStatement);
			// Step 3: Execute the query or update query
			ResultSet rs = preparedStatement.executeQuery();

			// Step 4: Process the ResultSet object.
			while (rs.next()) {
				int id = rs.getInt("userID");
				String name = rs.getString("userName");
				String feedDescription = rs.getString("feedDescription");
				String mediaURL = rs.getString("mediaURL");
				String headline = rs.getString("headline");
				String feedTime = rs.getString("feedTime");
				String dp = "https://randomuser.me/api/portraits/men/"+id+".jpg";
				feed_items.add(new Feed(id, name, feedDescription, mediaURL, feedTime, headline, dp));
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		return feed_items;
	}
	
	public void insertFeedItem(Feed feed) throws SQLException {
		System.out.println(INSERT_NEW_FEED);
		// try-with-resource statement will auto close the connection.
		try (Connection connection = getConnection();
				PreparedStatement preparedStatement = connection.prepareStatement(INSERT_NEW_FEED)) {
//			preparedStatement.setInt(1, student.getPersonID());
			preparedStatement.setInt(1, feed.getUserID());
			preparedStatement.setString(2, feed.getFeedTime());
			preparedStatement.setString(3, feed.getFeedDescription());
			preparedStatement.setString(4, feed.getMediaURL());
			System.out.println(preparedStatement);
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
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
