public class velocity 
{

    
    public static void main(String args[]) 
    {
        float u,a,t,v;
		
		u=Float.parseFloat(args[0]);
        a=Float.parseFloat(args[1]);
		t=Float.parseFloat(args[2]);
		//t=t*60;
		
		System.out.println("Initial speed = "+u+"m/s");
		System.out.println("Acceleration = "+a+"m/s^2");
		System.out.println("Time = "+t+"s");
		
		v = u + (a*t);
		System.out.println("Velocity = "+v+"m/s");
    }

}