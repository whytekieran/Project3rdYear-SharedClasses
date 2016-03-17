//Package
package ie.gmit.clientserver;

//Imports
import java.io.Serializable;

@SuppressWarnings("serial")
//Class that holds staff member information is a person and is serializable
public class StaffMember extends Person implements Serializable
{
	//Instance Variables
	private int id;
	private String pps = "";
	private double salary;
	private char staffType;
	
	//Getters and Setters
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getPps()
	{
		return pps;
	}
	
	public void setPps(String pps)
	{
		this.pps = pps;
	}
	
	public double getSalary() 
	{
		return salary;
	}
	
	public void setSalary(double salary) 
	{
		this.salary = salary;
	}
	
	public char getStaffType()
	{
		return staffType;
	}
	
	public void setStaffType(char staffType) 
	{
		this.staffType = staffType;
	}
}
