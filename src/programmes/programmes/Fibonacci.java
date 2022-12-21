 package programmes.programmes;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//method for n times
//		int k=0,a=1,b=1;
//		System.out.print("enter the number");
//		Scanner scan=new Scanner(System.in);
//		int n=scan.nextInt();
//		   System.out.print("1  1 ");//what if i didnt give space here..
//		   while(k<=n)
//		   {
//			   k=a+b;
//			   if(k>=n)
//				   break;
//			   System.out.print(k + " ");
//			   a=b;
//			   b=k;
		
		//method 2  for n
		
		int n1=0, n2=1, sum=0;
		
		System.out.print(n1 +""+n2);//0 1
		
		for(int i=2;i<10;i++) //2,3,4,5
		{
			sum=n1+n2;//0+1=1,1+1=2,1+2=3,2+3=5
			
			System.out.print(" "+ sum);
			    n1=n2;//1,1,n1=2,n1=3
			         n2=sum;//1,2->n2=2,3,n2=5
			
		
		   }

	}

}
