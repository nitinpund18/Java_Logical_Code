package Java_Logical_Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class Number_Operations
{
public static void main(String[] args) 
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter numbers");
	int min=sc.nextInt();
	int max=sc.nextInt();
	sc.close();
//	evenNumbers(min, max);
//	divisibleby5(min, max);
//	divisibleby5_3(min, max);
//	divisibleby7_13(min, max);
//	sumOfRange(min, max);
//	DiffEvenOddsumInRange(min, max);
	OddReverse(min, max);
}
public static void evenNumbers(int min, int max)
{
	for(int i=min; i<=max; i++) 
	{
		if(i%2==0) 
		{
			System.out.println(i);
		}
		}
	}
public static void divisibleby5(int min, int max){
	for(int i=min; i<=max; i++)
	{
		if(i%5==0) 
		{
			System.out.println(i);
		}
		}
	}
public static void divisibleby5_3(int min, int max)
{
	for(int i=min; i<=max; i++)
	{
		if(i%5==0 && i%3==0)
		{
			System.out.println(i);
		}
		}
	}
public static void divisibleby7_13(int min, int max)
{
	for(int i=min; i<=max; i++)
	{
		if(i%7==0 || i%13==0)
		{
			System.out.println(i);
		}
		}
	}
public static void sumOfRange(int min, int max)
{
	int sum=0;
	for(int i=min; i<=max; i++)
	{
		sum=i+sum;
		}
	System.out.println(sum);
	}
public static void DiffEvenOddsumInRange(int min, int max)
{
	int evensum=0, oddSum=0;
	for(int i=min; i<=max; i++)
	{
		if(i%2==0){
			evensum=i+evensum;
		}
		else{
			oddSum=i+oddSum;
		}
	}
	System.out.println(oddSum-evensum);
	}
public static void OddReverse(int min, int max){
	ArrayList<Integer> al = new ArrayList<Integer>();
	for(int i=min; i<=max; i++)
	{
		if(i%2!=0)
		{
			al.add(i);
		}
		}
	for(int j=al.size(); j>0; j--) 
	{
		System.out.println(al.get(j-1));
	}
	}
}

