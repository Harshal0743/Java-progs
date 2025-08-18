package Pgm1;

public class Main {

	public static void main(String[] args) {
		//Employee details
		Employee e1 =new
		Employee("Harshal","NNM24IS091",15000);
		Employee e2 =new
		Employee("Ram","NNM24IS221",16000);
		e1.display_deatails();
		e2.display_deatails();
		
		//increasing salary
		e1.increased_salary(20);
		e2.increased_salary(10);
		
		e1.display_deatails();
		e2.display_deatails();
	}

}
