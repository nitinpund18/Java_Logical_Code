package Java_Logical_Programs;

import java.util.Scanner;

public class PrimeNumber_scanner 
{
	public static void prime(int num)
	{
		int flag = 0;
		if(num>0)
		{
			for(int i=2; i<num; i++)
			{
				if(num%i==0)
				{
					flag++;
					break;
				}
			}
			if(flag>0)
			{
				System.out.println(num+" is not a prime number");
			}
			else
			{
				System.out.println(num+" is a prime number");
			}
		}
		else
		{
			System.out.println("not a valid number");
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		prime(num);
	}
}
