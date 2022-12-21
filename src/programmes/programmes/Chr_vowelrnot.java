/*program 1 */

package programmes.programmes;

import java.util.Scanner;

public class Chr_vowelrnot {

	public static void main(String[] args) {
		char ch=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the character");
   ch =sc.next().charAt(0);
   //logic
   if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
   {
	   System.out.println("it isvowel");
	   }
   else
	   {
		   System.out.println("constant");
	   }
	}

}
