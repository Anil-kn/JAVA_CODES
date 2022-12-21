
 
package programmes.programmes;

import java.util.Scanner;

public class Area_rectangle {

	
	public static void main(String[] args) {
		int length,breadth,area;
		System.out.print("enter the length ");
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);	
		 length=input.nextInt();
		 System.out.print("enter the  breadth");
		 breadth=input.nextInt();
		 area=length*breadth;
		 System.out.println("area of recgangle is"+area);
	}

}
// find the area of triangle 1/2*base*height