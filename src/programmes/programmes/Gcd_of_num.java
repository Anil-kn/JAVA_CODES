package programmes.programmes;

import java.util.Scanner;

public class Gcd_of_num {

	public static void main(String[] args) {
		int n1,n2,gcd=1,i;
		System.out.println("enter the values of n1 and n2");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
                    n1=scan.nextInt();
                    n2=scan.nextInt();
                    for(i=1;i<=n1&&i<=n2;++i)
                    {
                    	// check if i is factors of both integer
                    	if(n1%i==0&& n2%i==0)
                    		 gcd=i;
                    }
                    System.out.println("the n1 is"+n1);
                    System.out.println("the n2 is"+n2);
                    System.out.println("the gcd is"+gcd);
                    
                    //write a programe to find number of days and time 
	}                //wp to adjacent equal character
	//wp to incre number of character count only if digit present in even position
	// wp security policy of password
	//can we able to achieve 3d 

}
