package Oops.polymorphism;

public class ChildMethodOverriding extends ParentMethodOverriding
{
	public void bunglow()
	{
		System.out.println("Child Bunglow=01");
	}
	public void addition(int x, int y)
	{
		int c=20;
		int sum=x+y+c;
		System.out.println("Child sum="+sum);
	}
	public void money()
	{
		System.out.println("Child money=10000");
	}
}
