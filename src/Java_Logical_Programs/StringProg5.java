package Java_Logical_Programs;

import java.util.HashMap;

public class StringProg5
{
	public int getCountOfVowelsInString(String str)
	{
		int flag=0;
		for(int i=0; i<str.length(); i++)
		{
			switch (str.toUpperCase().charAt(i)) {
			case ('A'): {
				flag++; 
			}
			case ('E'): {
				flag++; 
			}
			case ('I'): {
				flag++; 
			}
			case ('O'): {
				flag++; 
			}
			case ('U'): {
				flag++; 
			}}}
		return flag;
	}
	public char getFirstOfVowelInString(String str)
	{
		char firstVowel = 0;
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.toUpperCase().charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				firstVowel=ch;
				break;
			}
		}
		return firstVowel;
	}
	public void printCountOfEachVowelsInString(String str)
	{
		HashMap<Character, Integer> hm= new HashMap<>();
		for(int i=0; i<str.length(); i++)
		{
			char ch = str.toUpperCase().charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				if(hm.containsKey(ch))
				{
					hm.put(ch, hm.get(ch)+1);
				}
				else
				{
					hm.put(ch, 1);
				}
			}
		}
		System.out.println(hm);
	}
	public void printCountOfEachVowelsInStringArray(String[] ar)
	{
		for(int k=0; k<ar.length; k++)
		{
			String str=ar[k];
			System.out.println("Count of ovels in="+str);
			HashMap<Character, Integer> hm= new HashMap<>();
			for(int i=0; i<str.length(); i++)
			{
				char ch = str.toUpperCase().charAt(i);
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					if(hm.containsKey(ch))
					{
						hm.put(ch, hm.get(ch)+1);
					}
					else
					{
						hm.put(ch, 1);
					}
				}
			}
			System.out.println(hm);
		}
	}
	public static void main(String[] args) {
		String str="globant";
		String[] ar={"globant", "nitin", "harsh"};
		StringProg5 ob = new StringProg5();
//		System.out.println("Count of vowels in string ="+ob.getCountOfVowelsInString(str));
//		System.out.println("First Ovel in String ="+ob.getFirstOfVowelInString(str));
//		ob.printCountOfEachVowelsInString(str);
		ob.printCountOfEachVowelsInStringArray(ar);
	}
}
