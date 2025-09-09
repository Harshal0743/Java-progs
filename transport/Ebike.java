package transport;

public class Ebike extends Bicycle 
{
	int percentage=100; 
	public Ebike() 
	{ 
	   System.out.println("In Ebike");
	}
	public void deliver(String item, String place) 
	{ 
	  System.out.println("Percentage is:"+percentage); 
	  super.deliver(item, place);
	}
}
