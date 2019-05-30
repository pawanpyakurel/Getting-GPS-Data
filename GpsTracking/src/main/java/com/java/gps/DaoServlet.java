package com.java.gps;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dao")
public class DaoServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String vno = request.getParameter("Vehicle_no");
		double lat =Double.parseDouble(request.getParameter("Latitude"));
		double lon =Double.parseDouble(request.getParameter("Longitude"));
		String time = request.getParameter("Time");
		float speed =Float.parseFloat(request.getParameter("Speed"));
		
		DB_Connection dbc = new DB_Connection();
		
		int i = 0;
		try {
			i= dbc.DB_Connection(vno, lat, lon, time, speed);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i<=0) {
			RequestDispatcher r = request.getRequestDispatcher("Unsucess.jsp");
			r.forward(request, response);
		}
		if(i>0) {
			RequestDispatcher r = request.getRequestDispatcher("show.jsp");
			r.forward(request, response);
		}
		/*try {
			int i = dbc.DB_Connection(vno,lat,lon,time,speed);
			PrintWriter out = response.getWriter();
//			out.println("<input type='submit' value='Save To Database' name='response.sendRedirect ('show.jsp');'/>");
//			response.sendRedirect("show.jsp");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		*/
		
	}

	
	

}
