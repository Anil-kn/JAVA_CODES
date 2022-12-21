package programmes.programmes;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		int num,reverse=0,org_num;
		System.out.println("enter the num");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	                num=scan.nextInt();
	               org_num =num;
	                while(num!=0)
	                {
	                reverse=reverse*10+num%10;
	                num=num/10;
	                }
	                if(org_num==reverse)
	                	System.out.println("it is palindrome number"+org_num);
	                else
	                	System.out.println("it is not palindrome number"+org_num);
	}

}
