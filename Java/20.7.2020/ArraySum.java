public class ArraySum
{

	public static void main(String[] args)
	{
		
		int arr1[][] ={{1,2},{3,4}};
		int arr2[][] ={{1,2},{3,4}};
		int sum[][] = new int [2][2];
		
		System.out.println("\nArray 1 :\n");
		for(int x=0;x<2;x++)	
		{
		
			for(int y=0;y<2;y++)
			{
				System.out.print(arr1[x][y]+"\t");
			}
			System.out.println();
		}
		System.out.println("\nArray 2 :\n");
		
	
		for(int i=0;i<2;i++)	
		{
		
			for(int j=0;j<2;j++)
			{
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("\nSum of both Arrays :\n");
		
		for(int p=0;p<2;p++)	
		{
		
			for(int q=0;q<2;q++)
			{
				sum[p][q]=arr1[p][q]+arr2[p][q];
				
				System.out.print(sum[p][q]+"\t");
			}
			System.out.println();
		}
		
	}
}