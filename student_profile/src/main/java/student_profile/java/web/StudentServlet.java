package student_profile.java.web;

import java.io.IOException;
import java.sql.SQLException;
//import java.util.List;
import java.util.List;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.commons.lang.StringUtils;

import com.mysql.cj.util.StringUtils;

import student_profile.java.dao.StudentDAO;
import student_profile.java.model.Feed;
import student_profile.java.model.Student;
import student_profile.java.model.StudentDetails;
import student_profile.java.model.Certification;
import student_profile.java.model.Education;
import student_profile.java.model.Skills;
/**
 * Servlet implementation class StudentServlet
 */
@WebServlet({ "/", "/user" })
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

	public static Integer tryParse(String text) {
		try {
			return Integer.parseInt(text);
		} catch (NumberFormatException e) {
			return -1;
		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getServletPath();
//		System.out.println(request.getParameter("id"));
		System.out.println(action.substring(1, 4));
		int id = -1;
		if (action.length() > 5 && action.substring(1, 5).equals("user")) {
			id = tryParse(action.substring(6, action.length()));
			action = "/user";
		}

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
//		case "/del":
//			if(id != -1) {
////				System.out.println("ID TO DELETER " + id);
//				
//			}
//			break;
		case "/user":
			if (id != -1) {
				home(request, response, id);
			}
			break;
		case "/signup":
			try {
//					System.out.println("***************************************************************");	
				showRegisterForm(request, response);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		
		case "/friends":
			showFriends(request, response);
			
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
//			case "/dashboard":
//				home(request, response);
//				break;
		case "/edit":
			showEditProfile(request, response);
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

	private void showLoginForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		
		HttpSession session = request.getSession(false);
		System.out.print("login ");
		System.out.println(session);
		if (session != null && session.getAttribute("logged") != null) {
			System.out.println("poop");
			response.sendRedirect("/student_profile/feed");
			return;
//			request.getRequestDispatcher("/student_profile/feed").include(request, response);  

		} else {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/signin.jsp");
			dispatcher.forward(request, response);
		}
	}
	

	
	private void showFriends(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		
		HttpSession session = request.getSession(false);  
		System.out.println("showFriend " + session);
		if(session == null || session.getAttribute("logged") == null)
			response.sendRedirect("/student_profile/signin");
		else
		 {
			int id = (Integer) session.getAttribute("userID");
			List<Student> friends = studentDAO.getFriends(id);
			request.setAttribute("friends", friends);
			request.setAttribute("userName", session.getAttribute("userName"));
			request.setAttribute("userDp", session.getAttribute("dp"));
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/friends.jsp");
			dispatcher.forward(request, response);
		}
	}

	private void showRegisterForm(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		System.out.print("login ");
		System.out.println(session);
		if (session != null && session.getAttribute("logged") != null) {
			System.out.println("poop");
			response.sendRedirect("/student_profile/feed");
			return;
//			request.getRequestDispatcher("/student_profile/feed").include(request, response);  

		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/signup.jsp");
			dispatcher.forward(request, response);
		}
	}

	private void home(HttpServletRequest request, HttpServletResponse response, int id)
			throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		System.out.print("login ");
		System.out.println(session);
		if (session == null || session.getAttribute("logged") == null) {
			response.sendRedirect("/student_profile/signin");
//			request.getRequestDispatcher("/student_profile/feed").include(request, response);  
		} else {
//			System.out.println();
			StudentDetails studentDetails = studentDAO.getStudentDetails(id);
//			System.out.println(studentDetails.student.getAboutUser());
			request.setAttribute("aboutUser", studentDetails.student.getAboutUser());
			List<Certification> certificates = studentDetails.certifications;	
			request.setAttribute("certification", certificates);
			
			List<Education> educations = studentDetails.educations;	
//			educations.stream().forEach(a->System.out.println(a.institution));
//			request.setAttribute("educations", educations);
			
			List<Skills> skills = studentDetails.skills;
			request.setAttribute("skills", skills);
			request.setAttribute("userID", session.getAttribute("userID"));
			List<String> education=new ArrayList<String>();
			System.out.println(studentDetails.student.getDp());
			request.setAttribute("userName",session.getAttribute("userName"));
			request.setAttribute("displayUserName",studentDetails.student.getUserName());
			request.setAttribute("displayUserDP","https://randomuser.me/api/portraits/men/"+studentDetails.student.getUserID()+".jpg");
			for(int i = 0;i < educations.size();i++)
			{
				education.add(educations.get(i).institution+"#"+educations.get(i).qualification+"#"+educations.get(i).period);
//				System.out.println("insi :"+educations.get(i).institution+"  "+educations.get(i).qualification+" "+educations.get(i).period);
			}
			request.setAttribute("educations", education);
			request.setAttribute("dp",session.getAttribute("dp"));
			System.out.println(id+" id : uid "+Integer.parseInt(session.getAttribute("userID").toString()));
			if(id==Integer.parseInt(session.getAttribute("userID").toString()))
			{
				System.out.println("equal");
				RequestDispatcher dispatcher1 =request.getRequestDispatcher("/jsp/dashboard.jsp");
				dispatcher1.forward(request, response);
				return;
			}
			else
			{
				System.out.println("not equal");
				RequestDispatcher dispatcher =request.getRequestDispatcher("/jsp/dashboardSecondary.jsp");
				dispatcher.forward(request, response);
				return;
			}
			
			
		}
	}

	private void showEditProfile(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		System.out.println("showFeedsPage " + session);
		if (session == null || session.getAttribute("logged") == null)
			response.sendRedirect("/student_profile/signin");
		else {
			int userID = (Integer) session.getAttribute("userID");
			Student student = studentDAO.getStudent(userID);
			request.setAttribute("student", student);
			request.setAttribute("userID", userID);
			request.setAttribute("dp",session.getAttribute("dp"));
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/edituserprofile.jsp");
			dispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		String action = request.getServletPath();
//		System.out.println(request.getParameter("id"));
		System.out.println("post action = " + action);
		int id = -1;
		if (action.length() > 3 && action.substring(1,4).equals("del"))
		{
			id = tryParse(action.substring(5, action.length()));
			System.out.println(id);
			action = "/del";
		}
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
		case "/del":
			try {
				deleteFriend(request, response, id);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
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
				updateStudent(request, response);
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
	private void register(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
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
		if (!cnfpassword.equals(password)) {
//			response.sendRedirect("signup");
//			out.println("enter valid password");
			try {
				request.setAttribute("errMessage", "The password and confirm password should be same");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/signup.jsp");
				dispatcher.forward(request, response);
			} catch (Exception e) {

			}
		} else if (student.getUserID() == -1) {
			studentDAO.signUpUser(newStudent);
			HttpSession session = request.getSession();
			session.setAttribute("userID", student.getUserID());
			session.setAttribute("userName", student.getUserName());
			session.setAttribute("logged", true);
			session.setAttribute("dp", "https://randomuser.me/api/portraits/men/"+student.getUserID()+".jpg");
			System.out.println(session);
			response.sendRedirect("/student_profile/feed");
		} else
			try {
				request.setAttribute("errMessage", "Account already exists. Please Log in.");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/signin.jsp");
				dispatcher.forward(request, response);
				response.sendRedirect("signin");
			} catch (Exception e) {
			}

	}

	private void login(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
//		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(request.getParameter("userName"));
		System.out.println(request.getParameter("password"));
//		int personID = Integer.parseInt(request.getParameter("personID"));
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");

		Student newStudent = new Student(userName, password);
		Student student = studentDAO.signInUser(newStudent);
		System.out.println(student.getUserID());
		if (student.getUserID() != -1) {
			HttpSession session = request.getSession();
			session.setAttribute("userID", student.getUserID());
			session.setAttribute("userName", student.getUserName());
			session.setAttribute("logged", true);
			String img = "https://randomuser.me/api/portraits/men/"+student.getUserID()+".jpg";
			session.setAttribute("dp", img);
			System.out.println(img);
			System.out.println(session);
			response.sendRedirect("/student_profile/feed");
			return;

		} else {

			try {
				request.setAttribute("errMessage", "Enter valid username and password");
				RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/signin.jsp");
				dispatcher.forward(request, response);
				response.sendRedirect("signin");
			} catch (Exception e) {

			}
		}

	}

	private void updateStudent(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException {

		System.out.println("updating new details.....");

		HttpSession session = request.getSession(false);

		String userName = request.getParameter("userName");
		String phoneNumber = request.getParameter("phoneNumber");
		String email = request.getParameter("email");
		int userID = (Integer) session.getAttribute("userID");
		System.out.println("edit " + userID);
		String aboutUser = request.getParameter("aboutUser");
		String facebookURL = request.getParameter("facebookURL");
		String linkedinURL = request.getParameter("linkedinURL");
		String githubURL = request.getParameter("githubURL");
		String twitterURL = request.getParameter("twitterURL");
		String location = request.getParameter("location");
		String headline = request.getParameter("headline");
		Student newDetails = new Student(userID, userName, aboutUser, phoneNumber, email, githubURL, linkedinURL,
				facebookURL, twitterURL, location, headline);
//		System.out.println("call DAO function");
		studentDAO.editUser(newDetails);
//		System.out.println("called DAO function");
		response.sendRedirect("/student_profile/feed");

	}
	
	private void deleteFriend(HttpServletRequest request, HttpServletResponse response, int friendID)
			throws SQLException, IOException {

		System.out.println("deleting friend.....");

		HttpSession session = request.getSession(false);


		int userID = (Integer) session.getAttribute("userID");

//		System.out.println("call DAO function");
		studentDAO.deleteFriend(userID, friendID);
//		System.out.println("called DAO function");
		response.sendRedirect("/student_profile/friends");

	}

//	private void home(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
//		dispatcher.forward(request, response);
//	}

}
