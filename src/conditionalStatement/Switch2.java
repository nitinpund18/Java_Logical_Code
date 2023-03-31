package conditionalStatement;

public class Switch2 
{
	public static void main(String[] args) {
		String options="";
	
		switch(options)
		{
			case "BalanceCheck":
				System.out.println("Checking Balance in ATM");
				break;
			case "WithDraw":
				System.out.println("Amount with Draw from ATM");
				break;
			case "statement":
				System.out.println("Print mini statement");
				break;
			case "pinChange":
				System.out.println("Change ATM pin");
				break;
			default:
				System.out.println("Timeout");
		}
	}
}
