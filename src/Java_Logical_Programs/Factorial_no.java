package Java_Logical_Programs;

public class Factorial_no 
{
public static void main(String[] args) 
{
	int num=5;
	int fact=1;
	for(int i=num; i>1;i--)
	{
		fact=fact*i;
	}
	System.out.println(fact);

}
}
