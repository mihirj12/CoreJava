public class swap 
{

    
    public static void main(String args[]) 
    {
        int a,b,temp;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		System.out.println("\nBefore Swapping...\n");
		System.out.println("\tA = "+a);
		System.out.println("\tB = "+b);
		
		temp=a;
		a=b;
		b=temp;
		
		System.out.println("\nAfter Swapping...\n");
		System.out.println("\tA = "+a);
		System.out.println("\tB = "+b);
        
    
    }

}