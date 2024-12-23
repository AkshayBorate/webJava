package example.servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.bean.Restaurant;
import example.dao.DaoInterface;
import example.dao.RestaurantDao;

/**
 * Servlet implementation class RestaurantSearchServlet
 */
@WebServlet("/search")
public class RestaurantSearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RestaurantSearchServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//    @WebServlet("/search")
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
//	@WebServlet("/search")
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String id = request.getParameter("r_id");
		int restaurentId = Integer.parseInt(id);

		
		DaoInterface<Restaurant, Integer> daoRef = new RestaurantDao();

		Restaurant foundRest = daoRef.retriveOne(restaurentId);

		if (foundRest == null) {
			// obtain request dispatcher for search _restarant.htmll
			// Display appropriatte message and divert to control to that html

			RequestDispatcher dispature = request.getRequestDispatcher("search_restaurant.html");
			out.println("<h2>Restaurant with given id is not found,try again");
			dispature.include(request, response);
		} else {
			// obtain request dispatcher for nextServlet:display
			// Attach the retaurant to the next servlet
			// Forward the request to hte next servlet
			RequestDispatcher dispature = request.getRequestDispatcher("dispaly");
			request.setAttribute("searchedRestaurat", foundRest);
			dispature.forward(request, response);
//			out.println(foundRest);
			
		}
	}

}
