package people;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee extends Person {
	public double salary;
	public Employee(String name, Date birthday, double salary){
		super(name, birthday);
		this.salary=salary;
	}
	public String toString()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return "Name : " + name + ", Birthday : " + format.format(birthday) + ", Salary : "+ salary;
	}
}