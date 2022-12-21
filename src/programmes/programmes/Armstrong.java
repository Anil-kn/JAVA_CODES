package programmes.programmes;
                                         //try to find the logics
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int number,originalnum,rem,res=0;
		System.out.println("enter the number");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
                    number=scan.nextInt();
               originalnum=number;
               while(originalnum!=0)
               {
            	   rem=originalnum%10;
            	   res +=rem*rem*rem;
            	   originalnum /=10;
            	   
               }
               if(res==number)
               {
            	   System.out.println("it is armstrong number");
               }
               else
            	   System.out.println("it is not an armstrong number");  
	}

}
