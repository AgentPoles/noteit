package com.mycompany.myapp;
import java.util.Date;
import java.text.SimpleDateFormat;
public class Lists
{
	String title;
	Date date;
	boolean secured;
	public String getTitle(){
		return title;
	}
	public Date getDate(){
		return date;
	}
	public boolean getSecurityState(){
		return secured;
	}
	
	public Lists(String list, Date datre, boolean secureed){
		title = list;
		date = datre;
		secured = secureed;
	}
	public Lists(String liset, boolean secureed){
		this(liset,new Date(java.lang.System.currentTimeMillis()),secureed);
	}

	@Override
	public String toString()
	{
		// TODO: Implement this method
		SimpleDateFormat forat = new SimpleDateFormat("dd/MM/yy");
		String dateString = forat.format(date);
		
		return "("+dateString+")"+title;
	}
	
}
