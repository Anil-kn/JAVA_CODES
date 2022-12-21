package String.prgrmset2;
//check the code
import java.util.Scanner;

public class Removebrackets {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String mystr=scan.nextLine();
		
		
		String result=mystr.replaceAll("[()]", "");
		System.out.println(result);

	}

}
