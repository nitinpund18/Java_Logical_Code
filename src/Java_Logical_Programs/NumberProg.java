package Java_Logical_Programs;

public class NumberProg 
{
	public static void armstrongNumber(int a)
	{
		int num=a,rem=0,sum=0;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem*rem*rem;
		}
		if(sum==a)
		{
			System.out.println(sum+" is a palindrome number");
		}
		else
		{
			System.out.println(sum+" is not a palindrome number");
		}
	}
	public static void reverseNumber(int b)
	{
		int num=b,rem=0,rev=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
	}
	public static void pallindromeNumber(int c)
	{
		int num=c,rem=0,rev=0;
		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==c)
		{
			System.out.println(rev+" is a palindrome number");
		}
		else
		{
			System.out.println(rev+" is not a palindrome number");
		}
	}
		
	public static void main(String[] args) {
		int a=153;
		int b=123;
		int c=1221;
		int d=1231;
		armstrongNumber(a);
		armstrongNumber(b);
//		reverseNumber(b);
//		pallindromeNumber(c);
//		pallindromeNumber(d);
	}
}
