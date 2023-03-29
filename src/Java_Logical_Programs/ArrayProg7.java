package Java_Logical_Programs;
public class ArrayProg7 
{
	public void shiftAllZeroToEndInArray(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i]==0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.print(a[i]+", ");
		}
	}
	public void shiftAllZeroToBeginingInArray(int[] b)
	{
		for(int i=0; i<b.length; i++)
		{
			for(int j=i+1; j<b.length;j++)
			{
				if(b[j]==0)
				{
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
			System.out.print(b[i]+", ");
		}
	}
	public static void main(String[] args) {
		int[] a={10,0,0,3,4,5,0,9};
		int[] b={10,0,0,3,4,5,0,9};
		ArrayProg7 ob= new ArrayProg7();
//		ob.shiftAllZeroToEndInArray(a);
		ob.shiftAllZeroToBeginingInArray(b);
	}
}
