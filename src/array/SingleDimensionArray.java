package array;

import java.util.Arrays;

public class SingleDimensionArray 
{
	public static void main(String[] args) {
		int[] a= new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+", ");	//full array
		}
		System.out.println();
		System.out.println(a[3]);	//40
		int sum= a[1]+a[2];
		System.out.println(sum);  	//50
		System.out.println(a.length);	//5
		int[] b= {1,7,6,2,4,8,6,2,1,4,5};
		System.out.println("length of Array b="+b.length);
		Arrays.sort(b);
		for(int j=0; j<b.length; j++)
		{
			System.out.print(b[j]+", ");
		}
		
	}
}
