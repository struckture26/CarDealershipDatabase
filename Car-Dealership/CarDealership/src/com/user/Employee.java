package com.user;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee 
{

	
	private int employeeID = generateEmployeeID();
	private String firstName;
	private String lastName;
	
	private static final String path = "C:\\Users\\struc\\OneDrive\\Desktop\\Streams\\cardealership\\employee.txt";
	
	
	
public Employee()
{}

public Employee(int employeeID, String firstName, String lastName)
{
	
	this.employeeID = employeeID;
	this.firstName = firstName;
	this.lastName = lastName;
	
}

public void saveToFile()
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
	return this.employeeID + "|" + this.firstName + "|" + this.lastName + "/";
}

public static Employee readFromFile(String path)
{
	String fileName = path;
	ArrayList<Employee> employee = new ArrayList<>();
	
	try
	{
		Scanner scanner = new Scanner(new File(fileName));
		String line = scanner.next();
		String[] parsedList = line.split("/");
		String employeeID = parsedList[0];
		String firstName = parsedList[1];
		String lastName = parsedList[3];
		

		for(int i = 0; i < employee.size(); i++)
		{
			employee.add(e;
		}
	}
	catch (FileNotFoundException e)
	{
		System.out.println("Error -- No Such File Exists");
	}

	
	
}

public int getEmployeeID() {
	return employeeID;
}

public void setEmployeeID(int employeeID) {
	this.employeeID = employeeID;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

@Override
public String toString() {
	return firstName + "\'s Employee ID:  " + employeeID;
}
	
public int generateEmployeeID()
{
	int tempNumber = (int)(Math.random()*1000);
	
	return tempNumber;
}
}
