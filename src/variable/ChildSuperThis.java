package variable;

public class ChildSuperThis extends ParentSuperThis
{
	int a=50;
	int b=60;
	int d=70;
	public void addition()
	{
		//local-->same class global-->parent class global
		int b=20;
		int e=30;
		a=100;
		this.a=0;
		d=0;
		int sum=a+this.a+d;	
		System.out.println(sum);
	}
	public static void main(String[] args) {
		
		ChildSuperThis object = new ChildSuperThis();
		object.addition();
	}
}
