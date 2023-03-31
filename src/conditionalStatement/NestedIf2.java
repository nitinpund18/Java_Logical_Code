package conditionalStatement;

public class NestedIf2 
{
	public static void main(String[] args) {
		int age=20;
		String gender="male";
		
		if(age>=18)
		{
			System.out.println("Valid voter");
			if(gender=="male")
			{
				if(age>=21)
				{
				System.out.println("Eligible for marriage");
				}
				else
				{
					System.out.println("Not eligible for marriage");
				}
			}
			else	//female
			{
				System.out.println("Eligible for marriage");
			}
			if(age>=60)
			{
				System.out.println("Eligible for senior citizen scheme");
			}
		}
		else
		{
			System.out.println("Invalid voter");
		}
	}
}
