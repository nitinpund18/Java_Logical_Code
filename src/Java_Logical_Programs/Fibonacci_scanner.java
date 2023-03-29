package Java_Logical_Programs;

import java.util.Scanner;

public class Fibonacci_scanner 
{
	public void printFabonacci(int count)
	{
		int a=0;
		int b=1;
		int temp=0;
		System.out.println(a);
		System.out.println(b);
		for(int i=2; i<count; i++)
		{
			temp=a+b;
			a=b;
			b=temp;
			System.out.println(temp);
		}
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter count of number");
	int num=sc.nextInt();
	Fibonacci_scanner ob = new Fibonacci_scanner();
	ob.printFabonacci(num);
	}
}
