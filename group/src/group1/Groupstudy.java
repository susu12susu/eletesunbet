package group1;

import java.util.Scanner;

public class Groupstudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name= "susunios" ;
 int	age=23;	
double salary=5000;

Scanner susunios=new Scanner(System.in);

System.out.println("Enter your name");
name=susunios.nextLine();
System.out.println("Enter your age");
age=susunios.nextInt();




System.out.println("your name:" + name);
System.out.println("your age:" + age);
System.out.println("your salary:" + salary);
	}

}
