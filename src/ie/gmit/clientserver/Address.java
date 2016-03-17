//Package
package ie.gmit.clientserver;

//Imports
import java.io.Serializable;

@SuppressWarnings("serial")
//Class that holds address information and is serializable
public class Address implements Serializable
{
	//Instance Variables
	private int id;
	private String street = "";
	private String town = "";
	private String county = "";
	
	//Getters and Setters
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getStreet() 
	{
		return street;
	}
	
	public void setStreet(String street) 
	{
		this.street = street;
	}
	
	public String getTown() 
	{
		return town;
	}
	
	public void setTown(String town) 
	{
		this.town = town;
	}
	
	public String getCounty() 
	{
		return county;
	}
	
	public void setCounty(String county) 
	{
		this.county = county;
	}
}
