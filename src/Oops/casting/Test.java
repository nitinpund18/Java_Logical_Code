package Oops.casting;

public class Test 
{
	public static void main(String[] args) {
		Parent p= new Parent();
		p.bunglow();
		p.car();
		p.farm();
		System.out.println(p.a);
		
		Child c= new Child();
		c.bunglow(); //parent & child
		c.car();     //parent
		c.farm();    //parent
		c.iPhone();  //child
		System.out.println(c.a);
		System.out.println(c.b);
		
		System.out.println("********NonPrimitive cating--Upcasting*****");
		Parent pc=new Child();		//create the object of child class with reference to parent class
		pc.bunglow();
		pc.car();
		pc.farm();
	//	pc.iphone();
		System.out.println(c.a);
		System.out.println(c.b);
		
		//WebDriver driver = new ChromeDriver();
	}
}
