package String.prgrmset2;

import java.util.Scanner;

public class Primerange {

	public static void main(String[] args) {
		int i,start,isprime,end,n;

		System.out.println("enter the num");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	                start=scan.nextInt();
	                end=scan.nextInt();
	                
	                for(n=start;n<=end;n++)
	                {
	                	isprime=1;
	                	for(i=2;i<n/2;i++)
	                		if(n%i==0)
	                		{
	                			isprime=10;
	                					break;
	                		}
	                	// if(isprime) check
	                		System.out.print(n);
	                		
	                }
	                
	                
	                
	}

}
