package String.prgrmset2;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the string");
		 String value=scan.nextLine();                   //string scanner
        
		 
		 for(int i=value.length()-1;i>=0;i--)
        {
        	System.out.print(value.charAt(i));
        }
		
		
		
	}

}
