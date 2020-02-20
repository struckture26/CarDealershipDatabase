package com.user;

import java.util.ArrayList;
import com.user.Vehicle;

public class DisplayInventoryGenerator 
{
	

public static ArrayList<Vehicle> displayNewVehicles(ArrayList<Vehicle> vehicles)
{
	/* 
	 * This method loops through the vehicles ArrayList and creates a new ArrayList
	 * for all vehicle that are New
	 */
	
	Vehicle vehicle = new Vehicle();
	ArrayList<Vehicle> displayVehicles = new ArrayList<>();
	for(int i = 0; i < vehicles.size(); i++)
	{
		vehicle = vehicles.get(i);
		
		if(vehicle.isNewVehicle() == true)
		{
			displayVehicles.add(vehicle);
			System.out.println("inside method" + vehicle);
			
			
		}
		
	}
	
	return displayVehicles;
}
	
	
	
public static ArrayList<Vehicle> displayUsedVehicles(ArrayList<Vehicle> vehicles)
{
	
	/* 
	 * This method loops through the vehicles ArrayList and creates a new ArrayList
	 * for all vehicle that are Used
	 */
	
	Vehicle vehicle = new Vehicle();
	ArrayList<Vehicle> displayVehicles = new ArrayList<>();
	for(int i = 0; i < vehicles.size(); i++)
	{
		vehicle = vehicles.get(i);
		
		if(vehicle.isNewVehicle() == false)
		{
			displayVehicles.add(vehicle);
		
		}
		
	}
	
	return displayVehicles;
}

public static ArrayList<Vehicle> displaySearchedVehicle(ArrayList<Vehicle> vehicles, String searchText)
{
	
	/* 
	 * This method loops through the one of the newly created ArrayLists
	 * above (displayNewVehicle or displayUsedVehicle) based on the user's input
	 * of the radio buttons on the searchInventory.jsp
	 * If the All radio button was chosen, then the ArrayList of vehicles that is
	 * created by reading from the text file is passed directly to this method.
	 */
	
	Vehicle vehicle = new Vehicle();
	ArrayList<Vehicle> displayVehicles = new ArrayList<>();
	for(int i = 0; i < vehicles.size(); i++)
	{
		vehicle = vehicles.get(i);
		
		String temp = vehicle.toString(); //converting the vehicle object to all text so that it can be searched from the text entered by the user. 
		
		if(temp.contains(searchText))
		{
			displayVehicles.add(vehicle);
		
		}
		
	}
	
	return displayVehicles;
}
}
