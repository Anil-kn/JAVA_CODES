package starpattern.starpattern;

public class Reve_triangle {

	public static void main(String[] args) {
		
		  int n=4;
			
			for(int i=0;i<n;i++)
			{
				

				for(int j=1;j<=i;j++) 
				{
					System.out.print(" ");
				}
				
				for(int j=1;j<n-i;j++)//why it starts with 1
				{
					System.out.print("*");
				}
		
				
				for(int j=0;j<n-i;j++) 
				{
					System.out.print("*");
				}
				
				
				System.out.println();
			}
	}

}
