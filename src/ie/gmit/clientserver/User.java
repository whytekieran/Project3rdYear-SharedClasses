//Package
package ie.gmit.clientserver;

//Imports
import java.io.Serializable;

@SuppressWarnings("serial")
//Class that user information and is serializable
public class User implements Serializable
{
	//Instance Variables
	private int staffID;
	private String username = "";
	private String password = "";
	private char staffType;

	//Getters and Setters
	public int getStaffID() 
	{
		return staffID;
	}

	public void setStaffID(int staffID)
	{
		this.staffID = staffID;
	}
	
	public char getStaffType()
	{
		return staffType;
	}

	public void setStaffType(char staffType)
	{
		this.staffType = staffType;
	}
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username) 
	{
		this.username = username;
	}
	
	public String getPassword() 
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
}
