package Java_Logical_Programs;

import java.util.Scanner;

public class Last3DivisibleBy3_7 
{
public static void main(String[] args)
{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter numbers");
	int min=sc.nextInt();
	int max=sc.nextInt();
	sc.close();
	divisibleby5_3(min, max);
}
public static void divisibleby5_3(int min, int max){
	int num1=0, num2=0, num3=0;
	
	for(int i=min; i<=max; i++){
		if(i%3==0 && i%7==0) {
			num1=num2;
			num2=num3;
			num3=i;
		
		}}
	System.out.println(num3);
	System.out.println(num2);
	System.out.println(num1);	
}
}
