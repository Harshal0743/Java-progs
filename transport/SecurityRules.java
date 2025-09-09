package transport;

public final class SecurityRules 
{
	private SecurityRules() {}
	public static boolean canFly(String place)
	{
	if(place=="exam cell")
	{
		return false;
	}
	else
		return true;
	}
}
