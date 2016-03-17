//Package
package ie.gmit.clientserver;

//Imports
import java.io.Serializable;

@SuppressWarnings("serial")
//Class that holds rentable house information is serializable and rentable
public class RentableHouse extends House implements Serializable, Rentable
{
	//Instance Variables
	private String toDate = "";
	private String fromDate = "";
	private double rate;
	
	//Getters and Setters
	@Override
	public String getToDate() 
	{
		return this.toDate;
	}
	
	@Override
	public void setToDate(String toDate) 
	{
		this.toDate = toDate;
	}

	@Override
	public String getFromDate() 
	{
		return this.fromDate;
	}
	
	@Override
	public void setFromDate(String fromDate) 
	{
		this.fromDate = fromDate;
	}

	@Override
	public double getRate() 
	{
		return this.rate;
	}
	
	@Override
	public void setRate(double rate) 
	{
		this.rate = rate;
	}
}
