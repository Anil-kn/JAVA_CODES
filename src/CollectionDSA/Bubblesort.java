package CollectionDSA;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Bubblesort {
    public static void main(String [] args)
    {
        int a []={4,2,1,5,3};
        System.out.println("Array before sorting:-"+ Arrays.toString(a));

        int temp=0;
        int n=a.length;

        for (int i=0;i<n-1;i++)
        {
            for (int  j=0;j<n-1;j++)
            {
                if (a[j]>a[j+1])
                {
                    temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;

                }
            }
        }
        System.out.println("Array After sorting:-"+ Arrays.toString(a));
    }
}
