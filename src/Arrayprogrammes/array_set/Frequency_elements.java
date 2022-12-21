package Arrayprogrammes.array_set;

import java.util.Scanner;

//this is the general approach

public class Frequency_elements {

	public static void main(String[] args) {
		 
		int[] arr=new int[56];
		int[] dup=new int[100];
		int n,i,j,cnt;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of an array");
		n=sc.nextInt();
		
		System.out.println("enter the elements of an array");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			dup[i]=-1;
		}
		for(i=0;i<n;i++)
		{
			cnt=1;
			for(j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					cnt++;
					dup[j]=0;
				}
			}
			if(dup[i]!=0)
			{
				dup[i]=cnt;
			}
			
		}
		System.out.println("print all frequency elements");
		for(i=0;i<n;i++)
		{
			if(dup[i]!=0)
			{
				System.out.println("NUMber"+arr[i]+"occur"+dup[i]+"times");
			}
		}
	}

}
