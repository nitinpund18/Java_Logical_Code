package variable;

public class VariableTypes
{
	//inside class & outside method
		//Global variables
		int a=10;			//global variable--> throughout in class and they are permenant
		static int c=50;
		public void addition()
		{
			int b=20;		//local variable--> only for that method
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
		public void multiplication()
		{
			System.out.println(a);
//			System.out.println(b);  //b is local variable in addition method
			System.out.println(c);
		}
		public static void main(String[] args) {
			//inside method-->inside class
			//Local variables
			VariableTypes object = new VariableTypes();
			System.out.println(object.a);
			System.out.println(c);
		}
}
