package Java_Logical_Programs;

import java.util.Scanner;

public class Grade 
{
public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter score");
	Grade grade = new Grade();
	grade.processResult(sc.nextInt());
}
public void processResult(int score)
{
	if(score>=0 && score <= 49)
	{
		System.out.println("Failed as obtained mark is "+score+", work harder");
	}
	else if(score>=50 && score <= 100)
	{	
		System.out.println("Student could clear exam");
	}
	else {
		System.out.println("Invalid score");
	}
	
	
	if(score>=90 && score <= 100)
	{
		System.out.println("A+, very good job");
	}
	else if(score>=80 && score <= 89)
	{	
		System.out.println("A, good job");
	}
	else if(score>=70 && score <= 79)
	{	
		System.out.println("B+, you are improving");
	}
	else if(score>=60 && score <= 69)
	{	
		System.out.println("C+, keep reading");
	}
	else if(score>=50 && score <= 59)
	{	
		System.out.println("C, you can do better");
	}

}
}
