package exceptionsHandling;

public class AlternateWays 
{
public static void main(String[] args) {
		
	}
	public void method1() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	public void method2()
	{
		try {
			Thread.sleep(2000);
		} 
		catch (InterruptedException e) {
		
			e.printStackTrace();
		}
	}
}
