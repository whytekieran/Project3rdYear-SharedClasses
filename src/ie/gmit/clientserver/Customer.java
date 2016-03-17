//Package 
package ie.gmit.clientserver;

//Imports
import java.io.Serializable;

@SuppressWarnings("serial")
//Class that holds customer information and is serializable
public class Customer implements Serializable
{
	//Instance Variables
	private int custID;
	private String fName;
	private String lName;
	private String address;
	
	//Getters and Setters
	public int getCustID() 
	{
		return custID;
	}
	
	public void setCustID(int custID) 
	{
		this.custID = custID;
	}
	
	public String getfName()
	{
		return fName;
	}
	
	public void setfName(String fName) 
	{
		this.fName = fName;
	}
	
	public String getlName()
	{
		return lName;
	}
	
	public void setlName(String lName)
	{
		this.lName = lName;
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
