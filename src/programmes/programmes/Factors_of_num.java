package programmes.programmes;

import java.util.Scanner;

public class Factors_of_num {

	public static void main(String[] args) {
		System.out.println("enter the number");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	            int num=scan.nextInt();
	            for(int i=1;i<=num;++i)
	            {
	            	if(num%i==0)
	            	{
	            		System.out.println(i);
	            	}
	            }

	}

}
