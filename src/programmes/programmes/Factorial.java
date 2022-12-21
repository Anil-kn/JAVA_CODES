package programmes.programmes;
//prgm5
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		 int fact = 1;
		 System.out.println("enter the number");
			@SuppressWarnings("resource")
			Scanner scan=new Scanner(System.in);
		            int num=scan.nextInt();
		            for(int i=1;i<=num;i++)
		            {
		            	fact=fact*i;
		            }
System.out.println("factorial of num"+num+"is"+fact);
		            
		            }

}
