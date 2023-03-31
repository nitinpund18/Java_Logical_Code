package conditionalStatement;

public class NestedIf1
{
	public static void main(String[] args) {
		String enteredUsername="xyz";
		String enteredPassword="pqr@123";
		if(enteredUsername=="xyz")
		{
			System.out.println("Usrname correct");
			if(enteredPassword=="xyz@123")
			{
				System.out.println("Password correct");
				System.out.println("Login successful");
			}
			else
			{
				System.out.println("Invalid pasword");
			}
				
		}
		else
		{
			System.out.println("Invalid username");
		}
				
		
	}
}
