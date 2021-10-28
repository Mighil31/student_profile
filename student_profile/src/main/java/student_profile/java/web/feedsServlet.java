package student_profile.java.web;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import student_profile.java.dao.FeedsDAO;
import student_profile.java.model.Feed;
import student_profile.java.model.Student;

/**
 * Servlet implementation class feedsServlet
 */
@WebServlet({"/feed", "/feed/new_feed", "/feed/add_feed"})
public class feedsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      private FeedsDAO feedsDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public feedsServlet() {
        this.feedsDAO = new FeedsDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
		System.out.println(action);
		switch (action) {
			case "/feed":
				showFeedsPage(request, response);
				break;
			case "/feed/new_feed":
				showNewFeedForm(request, response);
				break;
				
			case "/feed/add_feed":
				System.out.println("p");
				try {
					addFeed(request, response);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			default:
				System.out.println("popopo");
				break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	private void showNewFeedForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("77777777777777777777777");
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/addFeed.jsp");
		dispatcher.forward(request, response);
	}
	
	private void showFeedsPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Feed> feedList = feedsDAO.getFeedItems();
		request.setAttribute("feedList", feedList);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/feeds.jsp");
		dispatcher.forward(request, response);
	}
	
	private void addFeed(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(request.getParameter("feedDescription"));
		System.out.println(request.getParameter("mediaURL"));
		System.out.println(request.getParameter("userID"));

//		int personID = Integer.parseInt(request.getParameter("personID"));
		String feedDescription = request.getParameter("feedDescription");
		int userID = Integer.parseInt(request.getParameter("userID"));
		String mediaURL = request.getParameter("mediaURL");
		
		Feed newFeedItem = new Feed(userID, feedDescription, mediaURL);
		feedsDAO.insertFeedItem(newFeedItem);
		response.sendRedirect("/student_profile/feed");
	}
	
	

}
