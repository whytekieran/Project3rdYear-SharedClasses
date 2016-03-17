//Package
package ie.gmit.clientserver;

//Imports
import java.io.Serializable;

@SuppressWarnings("serial")
//Class that holds house information and is serializable
public class House implements Serializable
{
	//Instance Variables
	private int id = 0;
	private Address address = new Address(); 
	private char rentOrSale;
	
	//Getters and Setters
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public void setStreet(String street)
	{
		address.setStreet(street);
	}
	
	public String getStreet()
	{
		return address.getStreet();
	}
	
	public void setTown(String town)
	{
		address.setTown(town);
	}
	
	public String getTown()
	{
		return address.getTown();
	}
	
	public void setCounty(String county)
	{
		address.setCounty(county);
	}
	
	public String getCounty()
	{
		return address.getCounty();
	}
	
	public char getRentOrSale() 
	{
		return rentOrSale;
	}
	
	public void setRentOrSale(char rentOrSale) 
	{
		this.rentOrSale = rentOrSale;
	}
}
