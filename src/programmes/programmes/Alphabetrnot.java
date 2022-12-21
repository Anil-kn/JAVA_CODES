package programmes.programmes;
//prgm 2
import java.util.Scanner;

public class Alphabetrnot {

	public static void main(String[] args) {
		char mychar;
		System.out.println("enter the character");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		mychar=scan.next().charAt(0); 
		//logic
if(mychar>=48 && mychar<=57)
{
	System.out.println("it is number");
}
		
else if((mychar>='A'&& mychar<='Z')||(mychar>='a'&& mychar<='z'))  //or from 97to122 atoz or 65 to90 is A to Z
{

	System.out.println("it is alpahbet");
}
else
{
	System.out.println("it is spaecial character");
}
	}

}
