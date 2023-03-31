package conditionalStatement;

public class IfElseIf 
{
	public static void main(String[] args) {
		int obtainedMark=100;
		if(obtainedMark>100 || obtainedMark<0)
		{
			System.out.println("invalid Marks");
		}
		else if(obtainedMark>=75)
		{
			System.out.println("Disctinction");
		}
		else if(obtainedMark>=60)
		{
			System.out.println("First class");
		}
		else if(obtainedMark>=50)
		{
			System.out.println("second class");
		}
		else if(obtainedMark>=40)
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
}
