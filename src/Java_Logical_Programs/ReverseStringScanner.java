package Java_Logical_Programs;

public class ReverseStringScanner
{
	public String getReverseString(String name)
	{
		String rev="";
		for(int i=name.length()-1; i>=0; i--)
		{
			rev=rev+name.charAt(i);
		}
		return rev;
	}
	public String getEvenPositionChars(String name)
	{
		String str = "";
		for(int i=0; i<name.length(); i++)
		{
			if(i%2==0)
			{
			str=str+name.charAt(i);
			}
		}
		return str;
	}
	public String getEvenPositionCharsInReverse(String name)
	{
		String str = "";
		for(int i=name.length()-1; i>=0; i--)
		{
			if(i%2==0)
			{
			str=str+name.charAt(i);
			}
		}
		return str;
	}
	public int getCountOfDigitsInString(String name)
	{
		int count=0;
		for(int i=0; i<name.length(); i++)
		{
			char ch = name.charAt(i);		
			if(Character.isDigit(ch)==true)
			{
			int digit = Character.getNumericValue(ch);
			count++;
			}
		}
		return count;
	}
	public int getSumOfDigitsInString(String name)
	{
		int sum=0;
		for(int i=0; i<name.length(); i++)
		{
			char ch = name.charAt(i);			
			if(Character.isDigit(ch)==true)
			{
			sum= sum+Character.getNumericValue(ch);
			}
		}
		return sum;
	}
	
	public static void main(String[] args) {
		String name="nitin";
		
		ReverseStringScanner ob= new ReverseStringScanner();
		System.out.println(ob.getReverseString(name));
		System.out.println(ob.getEvenPositionChars(name));
		System.out.println(ob.getEvenPositionCharsInReverse(name));
		System.out.println(ob.getCountOfDigitsInString(name));
		System.out.println(ob.getSumOfDigitsInString(name));
		
	}
}
