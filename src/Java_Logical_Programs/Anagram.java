package Java_Logical_Programs;

import java.util.Scanner;

public class Anagram 
{
	public void verifyAnagram(String s1, String s2)
	{
		int flag=0;
		for(int i=0; i<s1.length();i++)
		{
			for(int j=0; j<s2.length();j++)
			{
				if(s1.length()==s2.length() && s1.charAt(i)==s2.charAt(j))
				{
					flag++;
					break;
				}
				}}
		if(s1.length()==flag) {
			System.out.println("Anagram");
		}
	}
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter two strings");
	String input1 = sc.next();
	String input2 = sc.next();
	Anagram ob =new Anagram();
	ob.verifyAnagram(input1.toLowerCase(), input2.toLowerCase());
	}
}
