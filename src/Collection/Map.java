package Collection;

import java.util.HashMap;

public class Map 
{
public static void main(String[] args) {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Nitin");
		hm.put(2, "Pund");
		hm.put(3, "QA");
		hm.put(4, "Analyst");
		System.out.println(hm);
		System.out.println(hm.get(2));
		System.out.println(hm.size());
		System.out.println(hm.containsKey(3));
		System.out.println(hm.containsValue("Pune"));
		System.out.println("****Hashmap using for loop****");
		for(int i=1; i<=hm.size(); i++)
		{
			System.out.println(hm.get(i));
		}
	}
}
