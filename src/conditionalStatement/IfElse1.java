package conditionalStatement;

public class IfElse1 
{
	public static void main(String[] args) {
		int obtainedMark=110;
		int passingMarks=40;	
		System.out.println("Program start");
		if(obtainedMark>=passingMarks)	//true condition
		{
			System.out.println("Pass in Exam");
		}
		else	//false condition
		{
			System.out.println("Fail in exam");
		}
		System.out.println("Program end");
	}
}
