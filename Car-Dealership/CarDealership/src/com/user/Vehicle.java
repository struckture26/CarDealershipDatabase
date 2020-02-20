package com.user;

import java.util.*;
import java.io.*;

public class Vehicle 
{


	private boolean newVehicle = true;
	private int year;
	private String make;
	private String model;
	private double salePrice;
	private String vinNumber;

	private String descriptionOfVehicle;

	private static final String path = "C:\\Users\\struc\\OneDrive\\Desktop\\Streams\\cardealership\\inventory.txt";

	public Vehicle()
	{}


	public Vehicle(boolean newVehicle, String vinNumber, int year, String make, String model, 
			double salePrice, String descriptionOfVehicle)

	{


		this.newVehicle = newVehicle;
		this.year = year;
		this.make = make;
		this.model = model;
		this.salePrice = salePrice;
		this.descriptionOfVehicle = descriptionOfVehicle;


	}

	public void saveToFile() //This is the method used to write the array list of vehicles into a text file
	{
		String fileName = path;

		try
		{
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));
			bw.write(formatData());
			bw.close();

		}
		catch(IOException e)
		{
			System.out.println("Error writing to file");
		}
	}

	public String formatData()
	{
		/* Using % to separate each parameter, since the last parameter takes multiple String
		 * inputs, if a comma was used to separate each parameter, then when the method is
		 * called to read the text file and turn it back into an ArrayList, then the last
		 * parameter (descriptionOfVehicle) would not store properly. 
		 */
		
		return this.newVehicle + "%" + this.vinNumber + "%" + this.year + "%" + this.make + "%" + this.model
				+ "%" + this.salePrice + "%" + this.descriptionOfVehicle + "\n";
	}

	
	//The method below reads from a text file and then separates out each vehicle object
	//into an ArrayList of vehicle objects. 
	public static ArrayList<Vehicle> readFromFile() throws IOException
	{
		String fileName = path;
		ArrayList<Vehicle> newList = new ArrayList<>(); //This is a temp arrayList that is created to convert all the vehicle objects in a text file into a temp array list, to then be passed back to the method which called it

		try {

			Scanner scanner = new Scanner(new File(fileName));

	
			while (scanner.hasNextLine())
			{
				String parsedLine = scanner.nextLine();
				String[] addObj = parsedLine.split("%");  //Separates each parameter of a vehicle object
					
					String condString = addObj[0];
					boolean condition = Boolean.parseBoolean(condString); //Converting the String "true/false" to the boolean true/false
					String vin = addObj[1];
					String yearString = addObj[2];
					int year = Integer.parseInt(yearString);//Converts the String year into an Integer
					String make = addObj[3];
					String model = addObj[4];
					String priceString = addObj[5];	
					double price = Double.parseDouble(priceString); //Converts the String price into a double
					String desc = addObj[6];

					Vehicle vehicle = new Vehicle();

					vehicle.setNewVehicle(condition);
					vehicle.setVinNumber(vin);				
					vehicle.setYear(year);					
					vehicle.setMake(make);					
					vehicle.setModel(model);
					vehicle.setSalePrice(price);
					vehicle.setDescriptionOfVehicle(desc);

					newList.add(vehicle); //adds the vehicle object into a temp ArrayList		
					}


		}
		catch(FileNotFoundException e)
		{
			System.out.println("Error --- No Such File Exists");
		}

		
		return newList;
	}
	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public double getSalePrice() {
		return salePrice;
	}


	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}


	public String getVinNumber() {
		return vinNumber;
	}


	public void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}


	public String getDescriptionOfVehicle() {
		return descriptionOfVehicle;
	}


	public void setDescriptionOfVehicle(String descriptionOfVehicle) {
		this.descriptionOfVehicle = descriptionOfVehicle;
	}


	@Override
	public String toString() {
		return  this.newVehicle + "%" + this.vinNumber + "%" + this.year + "%" + this.make + "%" + this.model
				+ "%" + this.salePrice + "%" + this.descriptionOfVehicle;}

	public String toString1() {
		
		//This additional toString method is used to display New for true and Used for false
		String isNew;

		if(newVehicle == true)
		{
			isNew = "New";
		}
		else
		{
			isNew = "Used";
		}
		return isNew;
	}

	public boolean isNewVehicle() {
		return newVehicle;
	}


	public void setNewVehicle(boolean newVehicle) {
		this.newVehicle = newVehicle;
	}


	public static String getPath() {
		return path;
	}

}

