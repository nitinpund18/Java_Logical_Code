package Oops.accessSpecifier;

public class ChildClassSamePack  extends SameClass
{
	public static void main(String[] args) {
		SameClass.method2();
		SameClass.method3();
		SameClass.method4();
		
		ChildClassSamePack child= new ChildClassSamePack();
		child.method6();
		child.method7();
		child.method8();
		
		SameClass parent = new SameClass();
		parent.method6();
		parent.method7();
		parent.method8();
	}
}
