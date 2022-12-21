package String.prgrmset2;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
	 String str,rev="";
	 @SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		 str=scan.nextLine();
		
		 for(int i=str.length()-1;i>=0;i--)
		    
			 rev=rev+str.charAt(i);
			 
		 
		 if(str.equals(rev))
			 {
				 System.out.println("string is palindrome"+str);
				 
			 }
			 else
			 {
				 System.out.println(" string is not palindrome"+str);
			 }
		 

	}

}
