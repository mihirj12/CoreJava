public class pqrs
{

	public static void main(String[] args)
	{
		char a[]={'p','q','r','s'};
		int i,j;
		
		for(i=0;i<a.length;i++)	
		{
			
			for(j=0;j<=i;j++)
			{
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
	}
}