package programmes.programmes;

import java.util.Scanner;

public class Strong_number {

	public static void main(String[] args) {
		int num,sum=0,rem,temp;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);//123 is num
		System.out.print("enter the num1");//1!+2!+3!=9 factorial and sum not equal to value fail...
		        num=scan.nextInt();
		        temp=num;      //145 is num
		                       //1!+4!+5!=145 so both are equal...pass
		        while(num>0)
		        {
		        	rem=num%10;
		        	int fact=1;
		        	for(int i=1;i<=rem;i++)// factorial
		        	{
		        		fact=fact*i;
		        	}
		        	num=num/10;
		        	sum=sum+fact; //add
		        	
		        }
		        if(temp==sum)
		        {
		        	System.out.println(sum+"number is strong");
		        }
		        else
		        	
		       System.out.println("number is not strong");
		        
	}

}
