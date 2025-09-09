package main;
import transport.*;

public class MainClass
{
	public static void main(String[] args)
	{
	Ebike e = new Ebike();
	e.deliver("chips", "Library");
	Drone d = new Drone();
	 d.deliver("Notes", "ExamCell");
	 d.deliver("Mobile", "ISE Block");
	 double bill = d.cost(5);
	 System.out.println("Drone delivery cost is: Rs." + bill);
}
}
