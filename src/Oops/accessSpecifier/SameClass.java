package Oops.accessSpecifier;

public class SameClass 
{
	private static void method1()
	{
		System.out.println("Method1: Private");
	}
	static void method2()
	{
		System.out.println("Method2: Default");
	}
	protected static void method3()
	{
		System.out.println("Method3: Protected");
	}
	public static void method4()
	{
		System.out.println("Method4: Public");
	}
	private void method5()
	{
		System.out.println("Method5: non static-Private");
	}
	void method6()
	{
		System.out.println("Method6: non static-Default");
	}
	protected void method7()
	{
		System.out.println("Method7: non static-Protected");
	}
	public void method8()
	{
		System.out.println("Method8: non static-Public");
	}
	public static void main(String[] Aspire) 
	{
		System.out.println("Method calling in same class");
		method1();
		method2();
		method3();
		method4();
		SameClass object= new SameClass();
		object.method5();
		object.method6();
		object.method7();
		object.method8();
	}
}
