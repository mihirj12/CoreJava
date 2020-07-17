public class greater_3
{
	public static void main(String[] args)
	{
		int a,b,c,big;
		
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		c=Integer.parseInt(args[2]);
		
		if(a>b&&a>c)
		{
			//System.out.println(a+" is bigger than "+b+" & "+c);
			big=a;
			System.out.println(big+" is the greatest.");
		}
		else if(b>c)
		{
			//System.out.println(b+" is bigger than "+a+" & "+c);
			big=b;
			System.out.println(big+" is the greatest.");
		}
		else 
		{
			//System.out.println(c+" is bigger than "+a+" & "+b);
			big=c;
			System.out.println(big+" is the greatest.");
		}
		
	}
}