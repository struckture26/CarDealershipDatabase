package com.servlet;

import java.io.*;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.user.Vehicle;

/**
 * Servlet implementation class AddInventoryServlet
 */
@WebServlet("/AddInventoryServlet")
public class AddInventoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddInventoryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession(true);
		
		  @SuppressWarnings("unchecked")
		ArrayList<Vehicle> vehicles =
		  (ArrayList<Vehicle>)session.getAttribute("vehicles");
		  
		  if (vehicles == null) { vehicles = new ArrayList<>(); } //If the session does not already have an ArrayList of vehicles, this will create a new one for use.
		 
		
		
		Vehicle vehicle = new Vehicle();
		
		String isUsed = request.getParameter("usedVehicle"); //This brings in the value of the Used Checkbox on the addNewVehicleForm.jsp.
		
		if (isUsed != null) // If the Used Checkbox on the addNewVEehicleForm is not selected, then it has a null value, which sets the boolean newVehicle to true.
		{
			vehicle.setNewVehicle(false);
		}
		else
		{
			vehicle.setNewVehicle(true);
		}
		
		
		vehicle.setYear(Integer.parseInt(request.getParameter("year"))); //Since the year is needed as an integer, this code is used to convert it from String to Integer.
		vehicle.setMake(request.getParameter("make"));
		vehicle.setModel(request.getParameter("model"));
		vehicle.setSalePrice(Double.parseDouble(request.getParameter("salePrice"))); // Since the price is a double, this code is used to convert it from String to Double.
		vehicle.setVinNumber(request.getParameter("vinNumber"));
		vehicle.setDescriptionOfVehicle(request.getParameter("descriptionOfVehicle"));
		
		
		vehicle.saveToFile();
		
		vehicles.add(vehicle);
		
		session.setAttribute("vehicles", vehicles);
		
		RequestDispatcher rs = request.getRequestDispatcher("confirmAddInventory.jsp");
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
