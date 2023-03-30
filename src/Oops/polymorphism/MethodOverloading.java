package Oops.polymorphism;

public class MethodOverloading extends Parent
{
	public void addition()
	{
		System.out.println("Method without parameter");
	}
	public void addition(int a)
	{
		System.out.println(a);
	}
	public void addition(int a, int b)
	{
		System.out.println(a+b);
	}
	public void addition(int a, String b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		MethodOverloading object= new MethodOverloading();
		object.addition();
		object.addition(10);
		object.addition(20, 30);
		object.addition(50, "Aspire");
		object.addition(100, 200, 300);
	}
}
