package programmes.programmes;

import java.util.Scanner;

public class Leapyear {  //check the logic 

	public static void main(String[] args) {
	 int year;
	 System.out.println("enter the year");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	                year=scan.nextInt();
   if(year%400==0)
	   System.out.println("it is leapyear"+year);
   else if(year%100==0)
	   System.out.println("it is not leapyear"+year);
   else if(year%4==0)
	   System.out.println("it is leap"+year);
   else
	   System.out.println("it is not leap year"+year);
	                
	}

}
