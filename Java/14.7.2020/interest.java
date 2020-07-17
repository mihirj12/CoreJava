public class interest
{
	public static void main(String[] args)
	{
		float SI,rate;
		int amt,time;
		
		amt=Integer.parseInt(args[0]);
		time=Integer.parseInt(args[1]);
		rate=Float.parseFloat(args[2]);
		
		System.out.println("Principle amount:\tRs. "+amt);
		
		System.out.println("Time of Interest:\t"+time+" years");
		
		System.out.println("Rate of Interest:\t"+rate+"%");
			
		SI=(amt*time*rate)/100;
		
		System.out.println("Simple Interest = Rs. "+SI);
	}
}