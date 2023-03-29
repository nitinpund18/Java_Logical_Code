package Java_Logical_Programs;

public class StringProg8
{
	public void printNewString(String s)
	{
		System.out.println("Encrypting all characters from a given string by its next character");
		String str="";
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)=='Z' ||s.charAt(i)=='z')
			{
				str=str+(char)(s.charAt(i)-25);				
			}
			else
			{
				str=str+(char)(s.charAt(i)+1);
			}
		}
		System.out.println(str);
	}
	public int gettAsciiValue(char a)
	{
		System.out.println("Ascii value of given character");
		return (int)a;
	}
	public void printAtoZAsciiValue()
	{
		System.out.println("A-Z ascii value");
		char firstChar = 'A';
		char LastChar = 'Z';
		for(int i=firstChar; i<=LastChar;i++)
		{
			System.out.println(i);
		}
	}
	public int getCountOfDigit(String str)
	{
		System.out.println("count of digits from given String without using isDigit method of Character class");
		int count=0;
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)>=48 && str.charAt(i)<=57)
			{
				count++;
			}
		}
		return count;
	}
	public char getCharOfAsciiValue(int asciiValue)
	{
		System.out.println("Character of given Ascii value");
		return (char) (asciiValue);
	}
	public void printCharofGivenRangeOfAsciiValues(int min, int max)
	{
		System.out.println("all characters having ascii value 91 ot 96");
		for(int i=min; i<=max; i++)
		{
			System.out.println(i+"->"+(char)i);
		}
	}
	public static void main(String[] args) {
		String s="apdz";
		char a='A';
		StringProg8 ob=new StringProg8 ();
//		ob.printNewString(s);
//		System.out.println(ob.gettAsciiValue(a));
//		ob.printAtoZAsciiValue();
//		String s2="3h4k2lk4n2";
//		System.out.println(ob.getCountOfDigit(s2));
//		int asciiValue=98;
//		System.out.println(ob.getCharOfAsciiValue(asciiValue));
		int minAsciiValue=91;
		int maxAsciiValue=96;
		ob.printCharofGivenRangeOfAsciiValues(minAsciiValue, maxAsciiValue);
	}
}
