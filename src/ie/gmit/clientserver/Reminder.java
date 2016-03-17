package ie.gmit.clientserver;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Reminder implements Serializable
{
	private int reminderID = 0;
	private String subject = "";
	private String desc = "";
	private String date = "";
	private String time = "";
	
	public int getReminderID() 
	{
		return reminderID;
	}
	
	public void setReminderID(int reminderID) 
	{
		this.reminderID = reminderID;
	}
	
	public String getSubject() 
	{
		return subject;
	}
	
	public void setSubject(String subject) 
	{
		this.subject = subject;
	}
	
	public String getDesc() 
	{
		return desc;
	}
	
	public void setDesc(String desc) 
	{
		this.desc = desc;
	}
	
	public String getDate()
	{
		return date;
	}
	
	public void setDate(String date) 
	{
		this.date = date;
	}
	
	public String getTime()
	{
		return time;
	}
	
	public void setTime(String time)
	{
		this.time = time;
	}
}//end Reminder class
