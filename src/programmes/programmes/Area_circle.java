package programmes.programmes;

import java.util.Scanner;

public class Area_circle {

	public static void main(String[] args) {
		double radius,area;
		System.out.print("enter the radius");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	               radius=scan.nextDouble();
	               area=Math.PI*radius*radius;// circle area=pi*r^2
	               System.out.print("area of the circle is "+area);

	}

}
