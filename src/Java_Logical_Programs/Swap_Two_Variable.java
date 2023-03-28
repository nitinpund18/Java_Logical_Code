package Java_Logical_Programs;

public class Swap_Two_Variable
{
public static void main(String[] args)
{
	System.out.println("Swapping by two variables method");
	int a=10; 
	int b=20;
	a=a+b;  		//a=10+20=30
	b=a-b;			//b=30-20=10
	a=a-b;			//a=30-10=20
	System.out.println("a="+a);
	System.out.println("b="+b);
}
}
