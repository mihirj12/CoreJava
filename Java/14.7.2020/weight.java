public class weight 
{

    
    public static void main(String args[]) 
    {
        double moon,earth;
		
		
		earth=Double.parseDouble(args[0]);
        System.out.println("Weight on Earth :\t"+earth+"Kg");
		
		moon = (earth/9.81) * 1.622;
		
        System.out.println("Weight on Moon :\t"+moon+"Kg");
            
    
    }

}




