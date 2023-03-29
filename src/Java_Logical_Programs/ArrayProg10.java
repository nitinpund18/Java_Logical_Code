package Java_Logical_Programs;

import java.util.Arrays;

public class ArrayProg10
{
	public void printMissingNumbersInArray(int[] a)
	{
		Arrays.sort(a);
		for(int i=1; i<=10;i++)
		{
			int flag=0;
			for(int j=0; j<a.length;j++)
			{
				if(i==a[j])
				{
				flag++;
				break;
				}
			}
			if(flag==0) {
			System.out.println(i);
		}}
	}
	public static void main(String[] args) {
		int[] a={1,3,9,5,6,10};
		ArrayProg10 ob= new ArrayProg10();
		ob.printMissingNumbersInArray(a);
	}
}
