package programmes.programmes;

import java.util.Scanner;

public class Perfect_num {              //6 factors of 6 is 1+2+3=6 equal it is perfect number same for 28 also check

	public static void main(String[] args) 
	{
	  int i=1,sum=0;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the num");
		       int  num=scan.nextInt();
		while(i<num)
		{
			if(num%i==0)
				sum=sum+i;
			i++;
		}
		        
		               if(sum==num)
		        		{
		        			System.out.println("prfect number is "+num);
		        		}
		        		else
		        		{
		        			System.out.println("not prfect number is "+num);	
		        		}
	}
}
		        	
		        
		        
		        

	



