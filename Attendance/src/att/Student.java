package att;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class Student {
	private static HashMap<Student, String> studentsLastNames = new HashMap<Student, String>();
	private static HashMap<String, Student> studentsLastNames2 = new HashMap<String, Student>();
	private String firstName, lastName;
	private HashMap<Date, Boolean> attendance;
	
	public Student(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		studentsLastNames.put(this, lastName);
		attendance = new HashMap<Date, Boolean>();
	}
	
	public void markPresent(Date d)
	{
		Date newDate = getDateObject(d);
		attendance.put(newDate, true);
	}
	
	public void markAbsent(Date d)
	{
		Date newDate = getDateObject(d);
		attendance.put(newDate, false);
	}
	public static Student findStudentObject(String lastname)
	{
		return studentsLastNames2.get(lastname);
	}
	
	private Date getDateObject(Date d)
	{
		return Date.getDateObject(d);
	}
}
