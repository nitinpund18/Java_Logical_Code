package Java_Logical_Programs;

public class ArrayProg5 
{
	public void printModdifiedArray(int[] ar)
	{
		for(int i=0; i<ar.length;i++)
		{
			for(int j=i; j<ar.length;j++)
			{
			if(ar[i]>ar[j])
			{
				ar[i]=0;
			}
			}
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		int[] arr = {10,20,30,22,44,21,92,89};
		ArrayProg5 ob= new ArrayProg5();
		ob.printModdifiedArray(arr);
	}
}
