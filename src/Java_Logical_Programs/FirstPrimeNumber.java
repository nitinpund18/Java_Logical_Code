package Java_Logical_Programs;

import java.util.Scanner;

public class FirstPrimeNumber
{
	public void prime(int num)
	{
		int i = 0, count=0;
		for(i=2; i<=i*num; i++) {
			if(count<num)
			{
				int flag=0;
				for(int j=2; j<i; j++) {
					if(i%j==0) {
						flag++;
					}}
				if(flag==0)
				{
					count++;
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to get first prime numbers");
		int num = sc.nextInt();
		FirstPrimeNumber ob= new FirstPrimeNumber();
		ob.prime(num);
	}
}
