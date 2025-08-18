package Pgm1;

public class Employee {

	String name;
	String id;
	double salary;
	//Employee details
	Employee(String name,String id,int salary)
	{
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	//Displaying details
	void display_deatails()
	{
		System.out.println("Employee name:"+this.name);
		System.out.println("Employee ID:"+this.id);
		System.out.println("Employee salary:"+this.salary);
	}
	
	//Salary increment
	void increased_salary(int percentage)
	{
		double increment =(percentage*this.salary)/100;
		this.salary=increment+this.salary;
		System.out.println("Incremented salary of the employee is"+this.salary);
	}
}
	
