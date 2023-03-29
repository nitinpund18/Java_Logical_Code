package Java_Logical_Programs;

import java.util.Arrays;

public class ArrayProg4
{
	public int getSecondHigestNumberInArray(int[] ar)
	{
		int num=0;
		int maxNum=0;
		Arrays.sort(ar);
	for(int i=0; i<ar.length; i++)
	{
			if(maxNum<=ar[i])
			{
				num=maxNum;
				maxNum=ar[i];
			}
	}
	return num;
	}
	public static void main(String[] args) {
		int[] a={10,99,33,44,89,76};
		ArrayProg4 ob= new ArrayProg4 ();
		System.out.println(ob.getSecondHigestNumberInArray(a));
	}
}
