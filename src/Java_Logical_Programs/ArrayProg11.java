package Java_Logical_Programs;

import java.util.LinkedHashSet;

public class ArrayProg11
{
	public void printUniqueNamesInArray(String[] arr)
	{
		System.out.println("Unique names in array");
		for(int i=0; i<arr.length; i++)
		{
			int flag=0;
			String str1=arr[i].toLowerCase();
			for(int j=0; j<arr.length; j++)
			{
				String str2=arr[j].toLowerCase();
				if(str1.equals(str2) && i!=j)
				{
					flag++;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(arr[i]);
			}
		}		
	}
	public void printDuplicateNamesInArray(String[] arr)
	{
		System.out.println("Duplicate names in array");
		LinkedHashSet<String> hs= new LinkedHashSet<>();
		for(int i=0; i<arr.length; i++)
		{
			int flag=0;
			String str1=arr[i].toLowerCase();
			for(int j=0; j<arr.length; j++)
			{
				String str2=arr[j].toLowerCase();
				if(str1.equals(str2) && i!=j)
				{
					flag++;
					break;
				}
			}
			if(flag!=0)
			{
				hs.add(str1);
			}
		}
		System.out.println(hs);
	}
	public static void main(String[] args) {
		ArrayProg11 ob= new ArrayProg11();
		String[] a={"Hi", "Hello", "Hello","Tech","Nitin","Tech"};
		String[] b={"Hi", "HELLO", "Tech", "Nitin", "ptc", "Ptc","Hello"};
		ob.printUniqueNamesInArray(a);
		ob.printDuplicateNamesInArray(b);
	}
}
