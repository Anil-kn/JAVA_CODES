package programmes.programmes;

import java.util.Scanner;

public class even_r_odd 
{
public static void main(String [] args)
{
	System.out.print("enter the number");
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
              int num=scan.nextInt();
              if(num%2==0)
              {
            	  System.out.print("it is even");
            	  
              }
              else
              {
            	  System.out.print("it is odd");
              }
}




}
