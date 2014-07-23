package people;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Person {
	protected String name;
	protected Date birthday;
	protected Person(String name, Date birthday){
		this.name=name;
		this.birthday=birthday;
	}

	public String getname(){
		return name;
	}

	public String toString()
	{
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		return "Name : " + name + ", Birthday : " + format.format(birthday);
	}
}
