package Java_Logical_Programs;

public class ArrayProg 
{
	public int getSumOfArrayEle(int[] ar)
	{
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			sum=sum+ar[i];
		}
		return sum;
	}
	public int getSumOfPrimeNumbersInArray(int[] ar)
	{
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			int flag=0;
			for(int j=2; j<ar[i]; j++) {
				if(ar[i]%j==0)
				{
					flag++;
				}
			}
			if(flag==0)
			{
				sum=sum+ar[i];
			}
		}
		return sum;
	}
	public int getMaxNumberInArray(int[] ar)
	{
		int max=ar[0];
		for(int i=0; i<ar.length; i++) {
			if(max<ar[i]) {
				max=ar[i];
			}
		}
		return max;
	}
	public int getMinNumberInArray(int[] ar)
	{
		int min=ar[0];
		for(int i=0; i<ar.length; i++) {
			if(min>ar[i]) {
				min=ar[i];
			}
		}
		return min;
	}
	public void MiddleCharInArrayEle(String[] ar)
	{
		for(int i=0; i<ar.length;i++)
		{
			char temp;
			int length = ar[i].length();
			if(length%2==0)
			{
			temp=ar[i].charAt(length/2-1);
			}
			else
			{
			temp=ar[i].charAt(length/2);
			}
			System.out.println(ar[i]+"->"+temp);
		}
	}
	public static void main(String[] args) {
		int a[]={10,11,15};
		int b[]={11,14,17,22,44};
		int c[]={11,4,55,23,43};
		String d[]={"Nitin","Priyanka","Sneha","Ankita"};
	
		ArrayProg ob= new ArrayProg();
		System.out.println(ob.getSumOfArrayEle(a));
		System.out.println(ob.getSumOfPrimeNumbersInArray(b));
		System.out.println(ob.getMaxNumberInArray(c));
		System.out.println(ob.getMinNumberInArray(c));
		ob.MiddleCharInArrayEle(d);
		
	}
}
