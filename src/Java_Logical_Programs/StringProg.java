package Java_Logical_Programs;

public class StringProg 
{
	public int  getNameLength(String name)
	{
		return name.length();
	}
	public char getMiddleCharOfString(String name)
	{
		int i = name.length();
		if(i%2==0)
		{
		return name.charAt(i/2-1);
		}
		else
		{
			return name.charAt(i/2);
		}
	}
	public static void main(String[] args) {
		String name="nitin";
		StringProg ob= new StringProg();
		int length = ob.getNameLength(name);
		System.out.println(length);
		char middleChar = ob.getMiddleCharOfString(name);
		System.out.println(middleChar);
	}
}
