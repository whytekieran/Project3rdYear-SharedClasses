//Package
package ie.gmit.clientserver;

//Imports
import java.io.Serializable;

@SuppressWarnings("serial")
//Class that holds person information and is serializable
public class Person implements Serializable
{
	//Instance Variables
	private String firstName = "";
	private String lastName = "";
	private String address = "";
	
	//Getters and Setters
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
	public String getAddress() 
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
}
