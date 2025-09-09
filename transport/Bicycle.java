package transport;

public class Bicycle extends Vehicle {
	public Bicycle() 
	{ 
	System.out.println("In Bicycle");
	}

	@Override
	public void deliver(String item, String place)
	{
		System.out.println("Deliver item"+item+"to"+place);
		// TODO Auto-generated method stub

	}

}
