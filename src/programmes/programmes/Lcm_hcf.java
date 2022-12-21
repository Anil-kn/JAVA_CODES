package programmes.programmes;

import java.util.Scanner;

public class Lcm_hcf {// check this code 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("enter the num1");
		        int  num1=scan.nextInt();
		        System.out.print("enter the num2");
		        int  num2=scan.nextInt();
		        int n1=num1;
		        int n2=num2;
		       
		        while(n1!=0)
		        {
		        	if(n1>n2)
		        		n1=n1-n2;
		        	else
		        		n2=n2-n1;
		        }
		        int GCD=n1;
		        int LCM=num1*num2;
		        System.out.print("enter the lcm"+LCM);
		        }
		        
	}

