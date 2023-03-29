package Java_Logical_Programs;

public class ArrayProg2
{
	public int getSumOfNonPrimeNum(int[] ar)
	{
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			int flag=0;
			for(int j=2; j<ar[i]; j++){
				if(ar[i]%j==0) {
					flag++;
					break;
				}
			}
			if(flag>0) {
			sum=sum+ar[i];
			}
		}
		return sum;
	}
	
	public int getSumOfNonPrimeNumMulti5_7(int[] ar)
	{
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			int flag=0;
			for(int j=2; j<ar[i]; j++){
				if(ar[i]%j==0) {
					flag++;
					break;
				}
			}
			if(flag>0 && ar[i]%5==0 && ar[i]%7==0) {
			sum=sum+ar[i];
			}
		}
		return sum;
	}
	public int getSumOfEvenNum(int[] ar)
	{
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) {
				sum=sum+ar[i];
			}
		}
		return sum;
	}
	public int getSumOfDiffEvenOdd(int[] ar)
	{
		int sum=0;
		for(int i=0; i<ar.length; i++) {
			if(ar[i]%2==0) {
				sum=sum+ar[i];
			}
			else {
				sum=sum-ar[i];
			}
		}
		if(sum<0) {
			sum=-sum;
		}
		return sum;
	}
	public String getLongestElement(String[] ar)
	{
		String s="";
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i].length()>=s.length())
			{
				s=ar[i];
			}
		}
		return s;
	}
	
	public static void main(String[] args) {
		int[] a={11,13,17,22,44};
		int[] b={11,35,17,105,44};
		int[] c={10,11,15,6};
		String[] d={"Nitin","Aditty","Manjiri","Ankita","Credits"};
		ArrayProg2 ob= new ArrayProg2();
		System.out.println(ob.getSumOfNonPrimeNum(a));
		System.out.println(ob.getSumOfNonPrimeNumMulti5_7(b));
		System.out.println(ob.getSumOfEvenNum(c));
		System.out.println(ob.getSumOfDiffEvenOdd(c));
		System.out.println(ob.getLongestElement(d));
	}
}
