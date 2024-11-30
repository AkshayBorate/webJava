package example.display;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import example.bean.Restaurant;

/**
 * Servlet implementation class RestaurantDisplayServlet
 */
@WebServlet("/dispaly")
public class RestaurantDisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestaurantDisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Object obj =request.getAttribute("searchedRestaurat");
		Restaurant currentRest = (Restaurant)obj;
		 String name= currentRest.getName();
         String cuisine = currentRest.getCuisine();
         int bracnchcount = currentRest.getBranchocunt();
         
         out.println("<h1>Restaurent Details</h1>");
         out.println("<h2>Name:"+name+"</h2>");
         out.println("<h2>cuisine:"+cuisine+"</h2>");
         out.println("<h2>bracnchcount:"+bracnchcount+"</h2>");
         
	}

}
