package example.servelet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class GreetingServlet
 */
@WebServlet("/greet")
public class GreetingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	@Override
	public void init() {
		System.out.println("Inside Init()");
	}
	@Override
	public void destroy() {
		System.out.println("Inside Destroy()");
	}
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Inside Doget");
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String responseText = "<h1 style='color:red'>Welcome to servelet </h1>";
		
		out.println(responseText);
		
		
	}

}
