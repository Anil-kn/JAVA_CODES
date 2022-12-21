package Arrayprogrammes.array_set;

public class Sumof_array {

	public static void main(String[] args) {
	int a[]= {5,5,5,5,5};
		int sum=0;
		
	/*	for(int i=0;i<a.length-1;i++)
		{
			sum=sum+a[i];
		}*/
		
		for(int value:a)
		{


			sum=sum+value;
		}
  System.out.println("sum of array elements"+sum);
	}

}
