package programmes.programmes;
//prgm5
import java.util.Scanner;

public class Print_ascii_value 
{

	public static void main(String[] args) 
	{
		System.out.println("enter the character");
		@SuppressWarnings("resource")
		//char ch=0;
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		      int i=ch;
 {
	 System.out.println("Ascii value of character"+" "+ch+"=="+i); 
 }

	}
}
