package programmes.programmes;

import java.util.Scanner;

public class Biggest_3num 
{
	public static void main(String [] args)
	{
		
	
    int num1,num2,num3;
    System.out.println("enter the numbers num1,num2,num3");
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
                num1=scan.nextInt();
                num2=scan.nextInt();
                num3=scan.nextInt();
                System.out.println("enter the numbers num1,num2,num3" +num1+" "+num2+" "+num3);
                if(num1>num2)
                {
                if(num1>num3)
                {
                	  System.out.println("enter the numbers num1 is great");
                }
                else
                {
                	System.out.println("enter the numbers num3 is great");	
                }
                }
                else if(num2>num3)
                	System.out.println("enter the numbers num2 is great");
                else
                	System.out.println("enter the numbers num3 is great");
	
	
	}
}
