package programmes.programmes;

import java.util.Scanner;

public class Add_fractions {

	public static void main(String[] args) {
		int x1,y1,x2,y2,x3,y3,div,i;
		System.out.println("enter the values of x1 and y1");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	            x1=scan.nextInt();
	            y1=scan.nextInt();
	            System.out.println("enter the values of x2 and y2");
	    		@SuppressWarnings("resource")
	    		Scanner s=new Scanner(System.in);
	    	            x2=s.nextInt();
	    	            y2=s.nextInt();
	    	       x3=(x1*y2)+(x2*y1);
	    	       y3=(y1*y2);
	    	       if(x3>y3)
	    	       {
	    	    	   div=y3;
	    	       }
	    	       else
	    	       {
	    	    	   div=x3;
	    	       }
	            for(i=div;i>0;i--) 
	            {
	            if(x3%i==0&&y3%i==0)
	            {
	            	x3=x3/i;
	            	y3=y3/i;
	            }
	            }
	            
	            System.out.println("some of given fractions "+x3 +" "+ y3);      
	            
	}

}
