package Java_Logical_Programs;

public class StringProg7 
{
	public int sumOfNumbers(String s1)
	{
		String[] ar = s1.split(" ");
		int sum=0;
		for(int i=0; i<ar.length; i++) 
		{
			int a=0;
			try {
				a = Integer.parseInt(ar[i]);
			}
			catch (NumberFormatException ignore) { }
		 sum=sum+a;
	
		}
		return sum;
		}
	public int sumOfDigits(String s2)
	{
		String[] ar = s2.split("");
		int sum=0;
		for(int i=0; i<ar.length; i++) 
		{
			int a=0;
			try {
				a = Integer.parseInt(ar[i]);
			}
			catch (NumberFormatException ignore) { }
		 sum=sum+a;
	
		}
		return sum;
		}

	public static void main(String[] args) {
	String s1 = "i have 15 years and 3 months of experience.";
	String s2 = "i have 15 years and 3 months of experience.";
	StringProg7 ob =new StringProg7();
	System.out.println(ob.sumOfNumbers(s1));
	System.out.println(ob.sumOfDigits(s2));
	}
}
