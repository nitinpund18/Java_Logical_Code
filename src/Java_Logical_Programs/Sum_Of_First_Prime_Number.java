package Java_Logical_Programs;

import java.util.Scanner;

public class Sum_Of_First_Prime_Number 
{
	public int prime(int num)
	{
		int i = 0, count=0, sum=0;
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
					sum=sum+i;
				}
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number to get first prime numbers");
		int num = sc.nextInt();
		Sum_Of_First_Prime_Number  ob= new Sum_Of_First_Prime_Number ();
		System.out.println("Sum of first"+num+"prime numbers ="+ob.prime(num));
	}
}
