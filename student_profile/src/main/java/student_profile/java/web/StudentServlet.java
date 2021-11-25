package student_profile.java.web;

import java.io.IOException;
import java.sql.SQLException;
//import java.util.List;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import student_profile.java.dao.StudentDAO;
import student_profile.java.model.Feed;
import student_profile.java.model.Student;

/**
 * Servlet implementation class StudentServlet
 */
@WebServlet("/")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private StudentDAO studentDAO;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentServlet() {
        
    	this.studentDAO = new StudentDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
//		System.out.println(request.getParameter("id"));
		System.out.println(action);
		switch (action) {
			case "/signin":
				try {
//					System.out.println("***************************************************************");	
					showLoginForm(request, response);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
					
			
//			case "/login":
//				try {
//					login(request, response);
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				break;
				
			case "/signup":
				try {
//					System.out.println("***************************************************************");	
					showRegisterForm(request, response);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
					
			case "/signout":
				
				HttpSession session = request.getSession(false);  
				session.invalidate();
				System.out.print("logout ");
				System.out.println(session);
//				request.getRequestDispatcher("/student_profile/signin").include(request, response);  
				response.sendRedirect("/student_profile/signin");
				break;
			
//			case "/register":
//				try {
//					register(request, response);
//				} catch (SQLException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//				break;
			case "/home":
				home(request, response);
				break;
			case "/edit":
				showEditProfile(request,response);
				break;
//			case "/editprofile":
//					try {
//						updateStudent(request,response);
//					} catch (IOException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					} catch (SQLException e) {
//						// TODO Auto-generated catch block
//						e.printStackTrace();
//					}
//				break;
			default:
				break;
		}
	}
	
	private void showLoginForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
		HttpSession session = request.getSession(false);
		System.out.print("login ");
		System.out.println(session);
		if(session != null && session.getAttribute("logged") != null)
		{
			System.out.println("poop");
			response.sendRedirect("/student_profile/feed");
			return;
//			request.getRequestDispatcher("/student_profile/feed").include(request, response);  
			
		}
		else
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/signin.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	private void showRegisterForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		System.out.print("login ");
		System.out.println(session);
		if(session != null && session.getAttribute("logged") != null)
		{
			System.out.println("poop");
			response.sendRedirect("/student_profile/feed");
			return;
//			request.getRequestDispatcher("/student_profile/feed").include(request, response);  
			
		}
		else
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/signup.jsp");
			dispatcher.forward(request, response);
		}
	}
	
	private void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/home.jsp");
		dispatcher.forward(request, response);
	}
	
	private void showEditProfile(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);  
		System.out.println("showFeedsPage " + session);
		if(session == null || session.getAttribute("logged") == null)
			response.sendRedirect("/student_profile/signin");
		else
		{
			int userID = (Integer) session.getAttribute("userID");
			System.out.println(userID);
			Student student = studentDAO.getStudent(userID);
			request.setAttribute("student", student);
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/edituserprofile.jsp");
			dispatcher.forward(request, response);
		}
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String action = request.getServletPath();
//		System.out.println(request.getParameter("id"));
		System.out.println("post action = " + action);
		switch (action) {
			case "/signin":
				try {
					login(request, response);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case "/signup":
				try {
					register(request, response);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			case "/edit":
				try {
					updateStudent(request,response);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			break;
				

				
			default:
				break;
			
		}
				
	}
	
//	private void listUser(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//		List<Student> listUser = studentDAO.selectAllUsers();
//		request.setAttribute("listUser", listUser);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/user-list.jsp");
//		dispatcher.forward(request, response);
//	}
//	
	private void register(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
//		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(request.getParameter("userName"));
		System.out.println(request.getParameter("password"));
		System.out.println(request.getParameter("cnfpassword"));
		System.out.println(request.getParameter("email"));
		System.out.println(request.getParameter("location"));
//		int personID = Integer.parseInt(request.getParameter("personID"));
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		String cnfpassword = request.getParameter("cnfpassword");
		String email = request.getParameter("email");
		String location = request.getParameter("location");
		
		Student newStudent = new Student(userName, password, email, location);
		Student student = studentDAO.signInUser(newStudent);
		if(!cnfpassword.equals(password))
			response.sendRedirect("signup");
		else if(student.getUserID() == -1)
		{
			
			studentDAO.signUpUser(newStudent);
			HttpSession session = request.getSession();  
			session.setAttribute("userID", student.getUserID()); 
			session.setAttribute("userName", student.getUserName()); 
			session.setAttribute("logged", true); 
			System.out.println(session);
			response.sendRedirect("/student_profile/feed");
		}
		else
			response.sendRedirect("signin");
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
//		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(request.getParameter("userName"));
		System.out.println(request.getParameter("password"));
//		int personID = Integer.parseInt(request.getParameter("personID"));
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		Student newStudent = new Student(userName, password);
		Student student = studentDAO.signInUser(newStudent);
		System.out.println(student.getUserID());
		if(student.getUserID() != -1)
		{
			HttpSession session = request.getSession();  
			session.setAttribute("userID", student.getUserID()); 
			session.setAttribute("userName", student.getUserName()); 
			session.setAttribute("logged", true); 
			System.out.println(session);
			response.sendRedirect("/student_profile/feed");
			return;
			
		}
		else
			response.sendRedirect("signin");
	}
		
	private void updateStudent(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException 
	{	
    	
		System.out.println("updating new details.....");
		
		HttpSession session = request.getSession(false);  
		
		String userName = request.getParameter("userName");
		String phoneNumber=request.getParameter("phoneNumber");
		String email=request.getParameter("email");
		int userID= (Integer) session.getAttribute("userID");
		System.out.println("edit " + userID);
		String aboutUser = request.getParameter("aboutUser");
		String facebookURL=request.getParameter("facebookURL");
		String linkedinURL=request.getParameter("linkedinURL");
		String githubURL=request.getParameter("githubURL");
		String twitterURL=request.getParameter("twitterURL");
		String location=request.getParameter("location");
		String headline=request.getParameter("headline");
		Student newDetails = new Student(userID,userName, aboutUser,
		phoneNumber,email, githubURL,linkedinURL,facebookURL, twitterURL, location, headline);
//		System.out.println("call DAO function");
		studentDAO.editUser(newDetails);
//		System.out.println("called DAO function");
		response.sendRedirect("/student_profile/feed");
		
	}
	
//	private void home(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
//		dispatcher.forward(request, response);
//	}

}
