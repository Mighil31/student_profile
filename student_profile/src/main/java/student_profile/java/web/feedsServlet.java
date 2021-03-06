package student_profile.java.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import student_profile.java.dao.FeedsDAO;
import student_profile.java.model.Feed;
import student_profile.java.model.Student;
import student_profile.java.error.postReturn;

/**
 * Servlet implementation class feedsServlet
 */
@WebServlet({"/feed", "/feed/new_feed", "/feed/add_feed", "/feed/poop"})
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
//			case "/feed":
////				System.out.println("pooooooooooooooooooooooooooooondsa");
//				List<Feed> feedList = feedsDAO.getFeedItems();
////				Student s1 = new Student("mighil", "poop");
//				String json = new Gson().toJson(feedList);
//			    response.setContentType("application/json");
//			    response.setCharacterEncoding("UTF-8");
//			    response.getWriter().write(json);
//			    
//			    break;
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
		String action = request.getServletPath();
		System.out.println("post " + action);
		switch (action) {
				
			case "/feed":
				
				try {
					addFeed(request, response);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				postReturn ret = new postReturn(false, "success");
				
				String json = new Gson().toJson(ret);
			    response.setContentType("application/json");
			    response.setCharacterEncoding("UTF-8");
			    response.getWriter().write(json);
//				try {
//					addFeed(request, response);
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
				break;
			default:
				System.out.println("popopo");
				break;
		}
	}

	private void showNewFeedForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("77777777777777777777777");
		HttpSession session = request.getSession(false);  
//		System.out.println("newFeed " + session.getAttribute("userID"));
		if(session == null || session.getAttribute("logged") == null)
			response.sendRedirect("/student_profile/signin");
		else
		{
	        int userID=(Integer)session.getAttribute("userID");
	        System.out.println("newFeed " + userID);
	        request.setAttribute("userID",userID);
	        request.setAttribute("dp",session.getAttribute("dp"));
	        request.setAttribute("userName",session.getAttribute("userName"));
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/addFeed.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	private void showFeedsPage(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);  
		System.out.println("showFeedsPage " + session);
		if(session == null || session.getAttribute("logged") == null)
			response.sendRedirect("/student_profile/signin");
		else
		{
			List<Feed> feedList = feedsDAO.getFeedItems();
			request.setAttribute("feedList", feedList);
			request.setAttribute("userID", session.getAttribute("userID"));
			request.setAttribute("userName",session.getAttribute("userName"));
			System.out.println(feedList.get(0).getDp());
			request.setAttribute("dp",session.getAttribute("dp"));
//			request.setAttribute("link1","https://randomuser.me/api/portraits/men/");
//			request.setAttribute("link2",".jpg");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/feeds.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	private void addFeed(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(request.getParameter("feedDescription"));
		System.out.println(request.getParameter("mediaURL"));
		System.out.println(request.getParameter("userID"));

//		int personID = Integer.parseInt(request.getParameter("personID"));
		
		String feedDescription = request.getParameter("feedDescription");
		HttpSession session=request.getSession(false); 
		if(session == null)
			response.sendRedirect("/student_profile/signin");
		else
		{
	        int userID=(Integer)session.getAttribute("userID");
	        System.out.println("addFeed " + userID);
			
			String mediaURL = request.getParameter("mediaURL");
			
			Feed newFeedItem = new Feed(userID, feedDescription, mediaURL);
			feedsDAO.insertFeedItem(newFeedItem);
			response.sendRedirect("/student_profile/feed");
		}
	}
	
	

}
