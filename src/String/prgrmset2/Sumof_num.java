package String.prgrmset2;

import java.util.Scanner;

public class Sumof_num {

	public static void main(String[] args) {
		 @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		   System.out.print("Enter string : ");
		   String s = sc.nextLine();
		   int sum=0;
		   for (int i = 0; i < s.length(); i++) {
		      if(Character.isDigit(s.charAt(i))) 
		      sum=sum+Character.getNumericValue(s.charAt(i));
		      }
		   System.out.println("Sum of all the digit present in String : "+sum);

	}

}
