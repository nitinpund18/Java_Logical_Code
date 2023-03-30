package Oops.accessSpecifier;

public class DiffClassSamePack 
{
	public static void main(String[] args) {
		System.out.println("Same package different class without inheritence");
		SameClass.method2();
		SameClass.method3();
		SameClass.method4();
		//SameClass.method1();	//private -no access
		SameClass object= new SameClass();
		object.method6();
		object.method7();
		object.method8();
		//object.method5(); //private -no access
	}
}
