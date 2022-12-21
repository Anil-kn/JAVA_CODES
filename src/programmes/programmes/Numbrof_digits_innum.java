package programmes.programmes;
//prgm4
import java.util.Scanner;

public class Numbrof_digits_innum {

	public static void main(String[] args) 
	{

		
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the character");
		int num=scan.nextInt();
		int count=0;
		while (num>0)
		{
		num=num/10;
		count++;
	
		}
	 System.out.println("num of digits"+count);
	 

	}

}
