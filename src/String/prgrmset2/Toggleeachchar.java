package String.prgrmset2;

//import java.util.Scanner;

public class Toggleeachchar {

	public static void main(String[] args) {
		/*@SuppressWarnings("resource") why it can not when scaner
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String str=scan.nextLine();*/
		
		String s="Hello World";
		
		String r=" ";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>65 && s.charAt(i)<90)
			{
				r=r+(char)(s.charAt(i)+32);
			}
			else
				r=r+(char)(s.charAt(i)-32);
			
		}
		
		System.out.print(r);
		
	}

}
