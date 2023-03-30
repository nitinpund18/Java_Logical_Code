package Oops.encapsulation;

public class Child 
{
	public static void main(String[] args) {
		Sample s= new Sample();
	//	System.out.println(s.a);	//10
		System.out.println(s.b);	//20
	//	System.out.println(s.c);	//0
		s.addition();				//30
	}
}
