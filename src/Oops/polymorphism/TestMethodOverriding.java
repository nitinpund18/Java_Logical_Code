package Oops.polymorphism;

public class TestMethodOverriding 
{
	public static void main(String[] args) {
		System.out.println("**********Child class properties********");
		ChildMethodOverriding c= new ChildMethodOverriding();
		c.bunglow();
		c.farm();
		c.addition(10, 20);
		c.money();
		
		System.out.println("**********Parent class properties********");
		ParentMethodOverriding p= new ParentMethodOverriding();
		p.bunglow();
		p.farm();
		p.addition(10, 20);
	}
}
