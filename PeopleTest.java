import java.util.Date;
import java.util.*;
import  java.text.SimpleDateFormat;
import people.Employee;
import people.Person;

class PeopleTest {
	public static void main(String[] args) {
		Person[] pe = new Person[3];
		Employee newbie = new Employee("newbie", new Date("2/10/1989"), 1000000);
		Manager boss = new Manager("boss", new Date("2/23/1986"), 4000000);
		boss.setAssitant(newbie);
		Manager biggerBoss = new Manager("bigboss", new Date("3/12/1969"), 10000000);
		biggerBoss.setAssitant(boss);
		for(int i=0; i<3; i++){
			pe[0]=newbie;
			pe[1]=boss;
			pe[2]=biggerBoss;
			System.out.println(pe[i].toString());
		}
//		System.out.println(newbie);
//		System.out.println(boss);
//		System.out.println(biggerBoss);
	}
}
