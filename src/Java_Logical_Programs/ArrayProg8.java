package Java_Logical_Programs;

import java.util.ArrayList;

public class ArrayProg8
{
	public void printDuplicateNumberInArray(int[] arr)
	{
		ArrayList<Integer> al= new ArrayList<Integer>();
		for(int i=0; i<arr.length; i++)
		{
			int flag=0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] == arr[j] && i!=j){
					if(al.contains(arr[i]))	{
						break;	
					}
					else
					{
						al.add(arr[i]);
						flag++;
			}}}
			if(flag>0)
			{
			System.out.println(arr[i]);
		}}
	}
	public static void main(String[] args) {
		int[] a={10,12,44,12,77,67,12,44};
		ArrayProg8 ob= new ArrayProg8();
		ob.printDuplicateNumberInArray(a);
	}
}
