package programmes.programmes;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the numbers");
		        int  num=scan.nextInt();
		    //1.using algorithm
		       int rev=0;
		        while(num!=0)
		        {
		        rev=rev*10+num%10;
		        num=num/10;
		        }
		        
		        
		        
		        System.out.print("reverse number is"+rev);
	}

	
}
