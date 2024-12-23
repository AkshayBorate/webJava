package example.servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.bean.User;
import example.bean.UserValidator;

/**
 * Servlet implementation class UserValidationServlet
 */
@WebServlet("/doValidate")
public class UserValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
       response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		//Capturing values of 2 request parameters: uid and pwd
		
		String userId = request.getParameter("uid");
		String password=request.getParameter("pwd");
		
		User currentuser = new User(userId,password);
		boolean valid = UserValidator.isValid(currentuser);
		String successResponse  = "<h1 style='color:green'>Congratulations!! you are In</h1>";
		
		String FailureResponse  = "<h1 style='color:red'>Sorry!! access denied due to xyz</h1>";
		
		if(valid) { 
		out.println(successResponse);
		}
		else {
			out.println(FailureResponse);
		}
		
		
		//Passing user object to uservalidator's isvalid() ofr checking 
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
