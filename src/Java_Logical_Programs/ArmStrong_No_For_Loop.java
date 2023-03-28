package Java_Logical_Programs;

public class ArmStrong_No_For_Loop 
{
public static void main(String[] args)
{
	int number=1634, originalNumber,remainder,result=0,n=0;
	originalNumber=number;
	for(;originalNumber!=0;originalNumber/=10,n++);
	originalNumber=number;
	for(;originalNumber!=0;originalNumber/=10)
	{
		remainder=originalNumber% 10;
		result+=Math.pow(remainder, n);
		
	}
	if(result==number)
		System.out.println(number + " is an armstrong number");
	else
		System.out.println(number + " is not  an armstrong number");
	
}
}
