package constructor;

public class Sample2
{
	static int a;
	int b=20;
	boolean c;
	char d;
	String e;

	public static void main(String[] args) {
		Sample2 object = new Sample2();
		System.out.println(a);
		System.out.println(object.b);	//objectName.VariableName
		System.out.println(object.c);
		System.out.println(object.d);
		System.out.println(object.e);
	}
}
