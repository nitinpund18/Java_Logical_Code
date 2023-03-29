package Java_Logical_Programs;

public class StringProg6 
{
	public static void pallindromeString(String str)
	{
		String revStr="";
		for(int i=str.length()-1; i>=0; i--)
		{
			revStr=revStr+str.charAt(i);
		}
		if(str.equals(revStr))
		{
			System.out.println(str+" is palindrome");
		}
		else
		{
			System.out.println(str+" is not palindrome");
		}
	}
	public static void printPallindromeEleInArray(String[] ar)
	{
		for(int j=0; j<ar.length; j++)
		{
			String str=ar[j];
			String revStr="";
			for(int i=str.length()-1; i>=0; i--)
			{
				revStr=revStr+str.charAt(i);
			}
			if(str.equals(revStr))
			{
				System.out.println(str);
			}
		
		}
	}
	public static void main(String[] args) {
		String s1="radar";
		String s2="aabcbaa";
		String s3="abcabc";
//		pallindromeString(s1);
//		pallindromeString(s2);
//		pallindromeString(s3);
		String[] ar={"radar","techhpet","madam","maulikkilum"};
		printPallindromeEleInArray(ar);
	}
}
