package Java_Logical_Programs;

import java.util.HashMap;

public class StringProg4
{
	public HashMap<Character, Integer> printCharCount(String str) {
		HashMap<Character, Integer> hm = new HashMap<>();
		int i=0;
		while(i<str.length())
		{
			if(hm.get(str.charAt(i)) == null) {
				hm.put(str.charAt(i), 1);
			}
			else
			{
				hm.put(str.charAt(i), hm.get(str.charAt(i))+1);
			}
		i++;
		}
		return hm;
		}
		public static void main(String[] args) {
			String str="globant india";
			StringProg4 ob= new StringProg4 ();
			System.out.println(ob.printCharCount(str));
			
		}
}
