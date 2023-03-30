package Methods;
import Methods2.DiffPackageClass;
public class SameClass
{
	public static void sameClassStaticMethod()
	{
		System.out.println("Different static method from same class");
	}
	public void sameClassNonStaticMethod()
	{
		System.out.println("Non static method from same class");
	}
	public static void main(String[] args) {
		System.out.println("Program start");
		sameClassStaticMethod();
		DiffClass.diffClassMethod();
		DiffPackageClass.diffPackStaticMethod();
		
		SameClass object= new SameClass();
		object.sameClassNonStaticMethod();
		
		DiffClass object2 = new DiffClass();
		object2.diffClassNonStaticMethod();
		
		DiffClass object3 = new DiffClass();
		object3.diffClassNonStaticMethod();
		
		System.out.println("Program end");
	}
}
