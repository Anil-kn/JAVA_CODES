package String.prgrmset2;

import java.util.Scanner;

public class Alphasort_string {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("enter string");
		String mystr=scan.nextLine();
     char temp;
     String str=mystr.toLowerCase();
     char[] charstr=str.toCharArray();//check the code
     int len=charstr.length;
     for(int i=1;i<len;i++)
     {
    	 for(int j=0;j<len-i;j++)
    	 {
    		 if(charstr[j]>charstr[j=1])
    		 {
    			 temp=charstr[j];
    			 charstr[j]=charstr[j+1];
    			 charstr[j+1]=temp;
    		 }
    	 }
     }
     System.out.println(charstr);
	}

}
