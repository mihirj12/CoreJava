public class vowel_ifelse
{
	public static void main(String[] args)
	{
			//String s=args[0];
			char ch;
			ch=args[0].charAt(0);
			
			
        
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
            System.out.println("\n"+ch+" is a Vowel");
		}
		else
		{
            System.out.println("\n"+ch+" is a Consonnant");
		}
		
	}
}