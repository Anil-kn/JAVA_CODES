package programmes.programmes;

import java.util.Scanner;

public class Sum_of_naturalnum {

	public static void main(String[] args) {
		 int sum=0;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the numbers");
		        int  n=scan.nextInt();
		        for(int i=0;i<n;i++)
		        {
		        	sum=sum+i;//0+1+2+3+4...............n
		        }
		        System.out.print("sum of natural numbers is"+sum);
		
		
		
		
	}

}
