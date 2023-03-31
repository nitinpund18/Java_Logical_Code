package exceptionsHandling;

public class RuntimeExceptions 
{
	public static void main(String[] args) {
		int a=10;
		int b=0;
		String s="Nitin";
		int[] ar= {1,2,3,4,5,6,0};
		System.out.println("Start of program");
		try {
			int div=a/ar[5];
			System.out.println(div);
			}
		catch (ArithmeticException ae)
		{
			System.out.println("Do not divide number with zero");
		}
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index issue");
		}
		catch (Exception e)
		{
			System.out.println("Super exception always in last catch block");
		}
		finally
		{
			System.out.println("Finally block must get execute");
		}
	//	System.out.println(div);
	//	System.out.println(ar[10]);
	//	System.out.println(s.charAt(10));
			System.out.println("End of program");
	}
}

//stack
/*
 Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 10
at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
at java.base/java.lang.String.charAt(String.java:712)
at com.java.exceptionsHandling.RuntimeExceptions.main(RuntimeExceptions.java:12)
*/


