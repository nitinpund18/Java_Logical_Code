package Java_Logical_Programs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class ArrayProg9
{
	public void printDuplicateNumberInArray(int[] arr)
	{
		System.out.println("Duplicate elements in Array:");
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
	public void printUniqueNumberInArray(int[] arr)
	{
		System.out.println("Unique elements in Array:");
		for(int i=0; i<arr.length; i++)
		{
			int flag=0;
			for(int j=0; j<arr.length; j++)
			{
				if(arr[i] == arr[j] && i!=j){
					flag++;
				}
			}
			if(flag==0)
			{
			System.out.println(arr[i]);
		}}
	}
	public void printNumberInArraywithoutDuplication(int[] arr)
	{
		System.out.println("All numbers in Array without duplication:");
		LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		for(int num:arr)
		{
			lhs.add(num);
		}
		for(int num:lhs)
		{
			System.out.println(num);
		}
	}
	public void printFrequencyOfEleInArray(int[] arr)
	{
		System.out.println("Frequecy of numbers in array:");
		HashMap<Integer, Integer> hm= new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			if(hm.containsKey(arr[i]))
			{
				hm.put(arr[i], hm.get(arr[i])+1);
			}
			else
			{
				hm.put(arr[i], 1);
			}
		}
		System.out.println(hm);
	}
	public static void main(String[] args) {
		int[] a= {10,20,10,44,33,55,33};
		int[] b={10,11,11,10,5,6,5,6,5,5,4};
		ArrayProg9 ob= new ArrayProg9();
//		ob.printDuplicateNumberInArray(a);
//		ob.printUniqueNumberInArray(a);
//		ob.printNumberInArraywithoutDuplication(a);
		ob.printFrequencyOfEleInArray(b);
		
	}
}
