package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.DisplayInventoryGenerator;
import com.user.Vehicle;

/**
 * Servlet implementation class ShowInventoryServlet
 */
@WebServlet("/ShowInventoryServlet")
public class ShowInventoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowInventoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * This method in the servlet gets the session from the browser, then
		 * reads the vehicle objects from a text file and converts it into an
		 * ArrayList of vehicles.  
		 */
		HttpSession session = request.getSession(true);
		ArrayList<Vehicle> vehicles = Vehicle.readFromFile();
		
		String newORused = request.getParameter("newORused");  //This is the "New" or "Used" radio button value being passed
		
		
		//Below, the siwtch method directs how to re-create the ArrayList (either: New, Used or All) based on the selection by the user
		switch (newORused)
		{
			case "All":
			{
				break;
			}
			case "Used":
			{
				ArrayList<Vehicle> temp = DisplayInventoryGenerator.displayUsedVehicles(vehicles);
				vehicles = temp;
				break;
			}
			case "New":
			{
				
				ArrayList<Vehicle> temp = DisplayInventoryGenerator.displayNewVehicles(vehicles);
				vehicles = temp;
				break;
			}
		}
		
		String searchText = request.getParameter("searchInput");
		
		if(searchText != "" && searchText != null)
		{
			ArrayList<Vehicle> temp = DisplayInventoryGenerator.displaySearchedVehicle(vehicles, searchText);
			vehicles = temp;
		}
	
		
		session.setAttribute("vehicles", vehicles);
		
		RequestDispatcher rs = request.getRequestDispatcher("showInventorySearchResults.jsp");
		rs.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
