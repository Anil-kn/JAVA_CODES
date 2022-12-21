package programmes.programmes;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		int rem=0,sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the numbers");
		        int  input=scan.nextInt();
		        while(input>0)
		        {
//		        	rem=input%10;
//		        	sum=sum+rem;
	        	
		        	   sum=sum+input%10;
		        	input=input/10;
		        	
		        }
  System.out.print(sum);
	}

}
