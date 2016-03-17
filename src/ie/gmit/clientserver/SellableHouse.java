//Package
package ie.gmit.clientserver;

//Imports
import java.io.Serializable;

@SuppressWarnings("serial")
//Class that holds sellable house information is serializable and sellable
public class SellableHouse extends House implements Serializable, Sellable 
{
	//Instance Variable
	private double cost = 0;
	
	//Getters and Setters
	@Override
	public void setCost(double cost) 
	{
		this.cost = cost;
	}

	@Override
	public double getCost()
	{
		return this.cost;
	}
	
}
