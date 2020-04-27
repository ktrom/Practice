package att;

import java.util.HashMap;
import java.util.HashSet;

public class Date {
	static Date currentDate;
	static HashMap<Integer, String> monthNames = new HashMap<Integer, String>();
	static HashMap<Integer, Integer> monthDays = new HashMap<Integer, Integer>();
	static HashMap<String, Date> datesByString = new HashMap<String, Date>(); 
	private int month, day, year;
	
	public Date(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
		datesByString.put(toString(), this);
	}
	@Override
	public String toString()
	{
		return monthNames.get(month) + " " + day + " " + year;
	}
	private void initializeDateClass()
	{
		monthNames.put(1, "January");
		monthDays.put(1, 31);
		monthNames.put(2, "February");
		monthDays.put(2, 29);
		monthNames.put(3, "March");
		monthDays.put(3, 31);
		monthNames.put(4, "April");
		monthDays.put(4, 30);
		monthNames.put(5, "May");
		monthDays.put(5, 31);
		monthNames.put(6, "June");
		monthDays.put(6, 30);
		monthNames.put(7, "July");
		monthDays.put(7, 31);
		monthNames.put(8, "August");
		monthDays.put(8, 31);
		monthNames.put(9, "September");
		monthDays.put(9, 30);
		monthNames.put(10, "October");
		monthDays.put(10, 31);
		monthNames.put(11, "November");
		monthDays.put(11, 30);
		monthNames.put(12, "December");
		monthDays.put(12, 31);
	}

	public static Date getDateObject(Date o)
	{
		return datesByString.get(o.toString());
	}
	@Override
	public boolean equals(Object o)
	{
		if(o == null || !(getClass().equals(o.getClass())))
			return false;
		Date d = (Date) o;
		return (month == d.month && day == d.day && year == d.year);
	}
}
