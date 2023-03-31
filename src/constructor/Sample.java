package constructor;

public class Sample 
{
	static int b;
	int c;
	
	public Sample()
	{
		
	}
	public Sample(int i)
	{
		
	}
	public Sample(short j)
	{
		
	}
	public Sample(int x, String y)
	{
		
	}
	public Sample(String p, int q)
	{
		
	}
	
	
	public static void method1()
	{
		int a=10;
		System.out.println(a);
	}
	
	public void method2()
	{
		System.out.println(c);
	}
	public static void main(String[] args) {
		method1();
		System.out.println(b);
		Sample object = new Sample();
		object.method2();
	}
}
