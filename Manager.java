import java.text.SimpleDateFormat;
import java.util.Date;
import people.Employee;

public class Manager extends Employee {
			private Employee assitant;
			public Manager(String name, Date birthday, double salary) {
				super(name, birthday, salary);
			}

			

			public void setAssitant(Employee assitant) {
				this.assitant = assitant;
			}

			public String toString()
			{
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				return "Name : " + name + ", Birthday : " + format.format(birthday) + ", Salary : "+ salary;
			}
			
		}
