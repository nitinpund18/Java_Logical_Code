package Java_Logical_Programs;

import java.util.Scanner;

public class Factorial_Scanner
{
	public int getFactorial(int num)
	{
		int fact=1;
		while(num>=1)
		{
			fact=fact*num;
			num--;		
		}
		return fact;
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter a number");
	int num=sc.nextInt();
	Factorial_Scanner ob = new Factorial_Scanner();
	System.out.println(ob.getFactorial(num));
	}
}
