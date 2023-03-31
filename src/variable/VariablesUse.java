package variable;

public class VariablesUse
{
	int a=10;			//Global-instance
	int b=20;			//Global-instance
	static int c=30;	//Global-static
	static int d=40;	//Global-static
	
	public void addition()
	{
		int e=50;		//Local-instance
		int sum=a+b+c+d+e;
		System.out.println(sum);
	}
	public static void multiplication()
	{
		VariablesUse object= new VariablesUse();
		int f=60;		//Local-instance
		int multi=object.a*object.b*c*d*f;
		System.out.println(multi);
	}
	public static void main(String[] args) {
		VariablesUse object= new VariablesUse();
		object.addition();
		object.multiplication();
	}
}
