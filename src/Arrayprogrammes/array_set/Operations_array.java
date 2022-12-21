package Arrayprogrammes.array_set;

import java.util.Scanner;

public class Operations_array {

	public static void main(String[] args) {
		
		
		int[] a= new int[50];
		int i,n,large,small;
		Scanner sc=new Scanner(System.in);
		System.out.println("HOW many elements");
		n=sc.nextInt();
		System.out.println("enter the array");
		for(i=0;i<n;i++)
		a[i]=sc.nextInt();
		
		large=small=a[0];
		for(i=1;i<n;++i)
		{
			if(a[i]>large)
		      large=a[i];
			if(a[i]<small)
			small=a[i];
			
		
		}
		
		System.out.println("the largest number is"+large);
		System.out.println("smallest number is"+small);
		
	
	}

}
