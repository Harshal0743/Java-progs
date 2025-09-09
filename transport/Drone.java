package transport;

public class Drone extends Vehicle implements Ipayable
{
	public Drone() 
	{ 
	System.out.println("In Drone"); 
	}
	public double cost(double distancekm)
	{
	return 20*distancekm;
	}
	@Override
	public void deliver(String item, String place)
	{
		if(!SecurityRules.canFly(place))
		{
			System.out.println("Delivery to " +place+ " is blocked");
			return;
		}
		else
			System.out.println("Deliver " +item+ " to "+place);

	}
}
