package conditionalStatement;

public class If1
{
	public static void main(String[] args) {
		int a=10;
		int b=20;
		
		System.out.println("Start of program");
		if(a<b) //10<20
		{
			int sum=a+b;
			System.out.println(sum);
			System.out.println("my If block result is true");
		}
		
		System.out.println("end of Program");
	}
}
