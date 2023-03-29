package Java_Logical_Programs;

import java.util.Scanner;

public class PrimeInRange
{
	int flag, sum, count;
	float avg;
	public void prime(int min, int max)
	{
		for(int i=min; i<=max; i++) {
			flag=0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flag++;
				}}
			if(flag==0)
			{
				System.out.println(i);
				sum=sum+i;
				count++;
				avg=sum/count;
			}
		}
		System.out.println("Sum of prime numbers="+sum);
		System.out.println("Count of prime numbers="+count);
		System.out.println("Average of prime numbers="+avg);
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers");
		int min = sc.nextInt();
		int max = sc.nextInt();
		PrimeInRange ob= new PrimeInRange();
		ob.prime(min, max);
	}
}
