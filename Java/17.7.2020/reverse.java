public class reverse
{
	public static void main(String[] args)
	{
		
		
		int num=0;
		int rev =0;
		System.out.println("Enter number: ");
      
		
      
		num =Integer.parseInt(args[0]);
      
		while( num != 0 )
		{
          rev = rev * 10;
          rev = rev + num%10;
          num = num/10;
		}

		System.out.println("Reverse number is: "+rev);
	
	
	}
}