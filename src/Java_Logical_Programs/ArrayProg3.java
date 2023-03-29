package Java_Logical_Programs;

import java.util.HashMap;

public class ArrayProg3 
{
	public char getMiddleCharOfLongestEle(String[] ar)
	{
		char ch = 0;
		int l=0;
		for(int i=0; i<ar.length; i++)
		{
			if(ar[i].length()>=l)
			{
				l=ar[i].length();
				if(l%2==0)
				{
				ch=ar[i].charAt(l/2-1);
				}
				else
				{
				ch=ar[i].charAt(l/2);					
				}
			}
		}
		return ch;
	}
	public HashMap<String, Character> getMiddleCharOfAllEle(String[] ar)
	{
		HashMap<String, Character> hm= new HashMap<String, Character>();
		for(int i=0; i<ar.length; i++)
		{
			int l=ar[i].length();
				if(l%2==0)
				{
				hm.put(ar[i], ar[i].charAt(l/2-1));
				}
				else
				{
				hm.put(ar[i], ar[i].charAt(l/2));					
				}
		}
		return hm;
	}
	
	public static void main(String[] args) {
		String[] a={"Ravi","Pallavi","Neha","Rahul","Vishal"};
		String[] b={"Nitin","Avni","Puja","Harshal","Aditty","Rahul"};
		ArrayProg3 ob= new ArrayProg3 ();
		System.out.println(ob.getMiddleCharOfLongestEle(a));
		System.out.println(ob.getMiddleCharOfAllEle(b));
	}
}
