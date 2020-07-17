public class oddeven
{

    
    public static void main(String args[]) 
    {
        int num;
		num=Integer.parseInt(args[0]);
		System.out.println("\nNumber : "+num+"\n");
		if(num%2==0)
		{
			System.out.println(num+" IS AN EVEN NUMBER.");
		}
        else
		{
			System.out.println(num+" IS AN ODD NUMBER.");
		}
        
            
    
    }

}