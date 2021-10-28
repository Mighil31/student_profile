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

import student_profile.java.dao.StudentDAO;
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
			
			case "/login":
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
//					System.out.println("***************************************************************");	
					showRegisterForm(request, response);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					break;
			
			case "/register":
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
			case "/home":
				home(request, response);
				break;
			default:
				break;
		}
	}
	
	private void showLoginForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/signin.jsp");
		dispatcher.forward(request, response);
	}
	
	private void showRegisterForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/signup.jsp");
		dispatcher.forward(request, response);
	}
	
	private void home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/home.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
				
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
		if(!cnfpassword.equals(password))
			response.sendRedirect("signup");
		else if(!studentDAO.signInUser(newStudent))
		{
			
			studentDAO.signUpUser(newStudent);
			response.sendRedirect("/student_profile/feed");
		}
		else
			response.sendRedirect("signin");
	}
	
	private void login(HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException {
		System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println(request.getParameter("userName"));
		System.out.println(request.getParameter("password"));
//		int personID = Integer.parseInt(request.getParameter("personID"));
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		Student newStudent = new Student(userName, password);
		if(studentDAO.signInUser(newStudent))
			response.sendRedirect("/student_profile/feed");
		else
			response.sendRedirect("signin");
	}
//	private void home(HttpServletRequest request, HttpServletResponse response)
//			throws SQLException, IOException, ServletException {
//
//		RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
//		dispatcher.forward(request, response);
//	}

}