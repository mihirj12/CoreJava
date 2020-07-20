public class multipattern
{

	public static void main(String[] args)
	{
		
		int i,j,n;
		
		for(i=0;i<4;i++)	
		{
			n=1;
			
			for(j=0;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print("* ");
				}
				else
				{	
					System.out.print((n+j)+" ");
				}
			}
			System.out.println();
		}
	}
}