package String.prgrmset2;

import java.util.Scanner;

public class Remove_vowels {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String str=scan.nextLine();
		
		System.out.println("string to remove vowel"+  str);
		String strnew=str.replaceAll("[AEIOUaeiou]", "");
		System.out.println(" the new string is " +strnew);

	}

}// check the code
/////////////////////////////