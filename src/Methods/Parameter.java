package Methods;

public class Parameter 
{
	public static void addition(int a, int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void multiplication(int x, int y)
	{
		int multi=x*y;
		System.out.println(multi);
	}
	public static void main(String[] args) {
		addition(0, 0);	
		addition(10, 15);
		addition(20, 25);
		Parameter ob= new Parameter();
		ob.multiplication(40, 50);
		ob.multiplication(40, 50);
		ob.multiplication(30, 60);
	}
}
