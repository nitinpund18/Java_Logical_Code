package Methods;

public class ReturnType 
{

	public static int addition(int a, int b)
	{
		int sum=a+b;
		return sum;
	}
	public static void subtraction(int i, int j)
	{
		int sub=i-j;
		System.out.println(sub);
	}
	public static void multiplication(int x, int y)
	{
		int multi=x*y;
		System.out.println(multi);
	}
	public static void main(String[] args) {
		int c = addition(20,10);
		System.out.println("Value of c="+c);
		subtraction(20, 10);
		multiplication(20, 10);
	}
}
