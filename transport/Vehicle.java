package transport;

public abstract class Vehicle {
	public Vehicle() 
	{ 
	   System.out.println("In Vehicle"); 
	}
	public abstract void deliver(String item,String place); 
	
}


