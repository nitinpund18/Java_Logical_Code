package Oops.Inheritance;

public class Test 
{
	public static void main(String[] args) {
		System.out.println("Parent class object creation");
		Parent p= new Parent();
		p.bunglow();
		p.gold();
		p.farm();
		
		System.out.println("Child class object creation");
		Child c= new Child();
		c.Iphone();
		c.bunglow();
		c.gold();
		c.farm();
		
		System.out.println("Grand Child class object creation");
		GrandChild g= new GrandChild();
		g.chockalate();
		g.Iphone();
		g.bunglow();
		g.farm();
		g.gold();
		int sum=g.x+c.y+g.z;
		System.out.println(sum);
	}
}
