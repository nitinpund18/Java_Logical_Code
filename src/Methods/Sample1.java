package Methods;
import Methods2.Sample3;
public class Sample1
{
	public static void addition()
	{
		int a=10;
		int b=20;
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		addition();				//same class--> methodName
		Sample2.subtraction();	// different class & same package--> className.methodName
		Sample3.multiplication();	//different package--> import package and then className.methodName
		Sample3.multiplication();
		addition();	
	}
}
