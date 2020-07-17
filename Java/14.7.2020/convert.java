

public class convert
{
	public static void main(String[] args)
	{
		
		int km,ans;
		
		System.out.println("Enter Distance in KM :");
		km=Integer.parseInt(args[0]);
		ans = km*1000;
		System.out.println(km+"km in meters is "+ans);
	}
}