//Package
package ie.gmit.clientserver;

//Interface to be used with rentable objects
public interface Rentable
{
	public void setToDate(String toDate);
	public String getToDate();
	public void setFromDate(String fromDate);
	public String getFromDate();
	public void setRate(double rate);
	public double getRate();
}
