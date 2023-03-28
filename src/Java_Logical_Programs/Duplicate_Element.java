package Java_Logical_Programs;

public class Duplicate_Element 
{
public static void main(String[] args) 
{
	int a[] = {1,2,3,4,2,7,8,8,3};
	System.out.println("Duplicate element in given array");
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1 ;i<a.length;j++)
		{
			if(a[i]==a[j])
				System.out.println(a[i]);
		}
	}
}
}
