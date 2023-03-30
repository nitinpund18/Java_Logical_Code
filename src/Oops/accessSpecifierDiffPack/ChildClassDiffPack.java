package Oops.accessSpecifierDiffPack;
import Oops.accessSpecifier.SameClass;
public class ChildClassDiffPack extends SameClass
{
	public static void main(String[] args) {
		SameClass.method3();
		SameClass.method4();
		
		ChildClassDiffPack child = new ChildClassDiffPack();
		child.method7();
		child.method8();
		
		SameClass parent= new SameClass();
		parent.method8();
	}
}
