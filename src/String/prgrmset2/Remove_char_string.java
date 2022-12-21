package String.prgrmset2;

import java.util.Scanner;

public class Remove_char_string {

	public static void main(String[] args) 
	{

     Scanner sc =new Scanner(System.in);
     System.out.print("Enter String : ");
     String s = sc.nextLine();
     s=s.replaceAll("[^a-zA-Z]","");//^ why we use this
     System.out.println(s);
   }
}

//[a-zA-Z]-->Alphabets
// [^a-zA-Z]	-Non Alphabets
// https://www.digitalocean.com/community/tutorials/java-remove-character-string
	

