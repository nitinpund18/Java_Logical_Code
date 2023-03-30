package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set_LinkedHashset
{
	public static void main(String[] args) {
		LinkedHashSet lhs= new LinkedHashSet();
		lhs.add("Nitin Pund");
		lhs.add(987654321);
		lhs.add(90.52);
		lhs.add('N');
		lhs.add('N');
		lhs.add(true);
		lhs.add(1234567891.1235546671);
		lhs.add(null);
		lhs.add(null);
		lhs.add("Nitin Pund");
		System.out.println(lhs);
		System.out.println(lhs.contains('A'));
		System.out.println(lhs.isEmpty());
		lhs.remove(90.52);
		System.out.println(lhs);
		System.out.println(lhs.size());
		System.out.println("******LinkedHashset using for eacch loop*****");
		for(Object temp:lhs)
		{
			System.out.print(temp+" | ");
		}
		System.out.println("\n************LinkedHashset using Iterator********");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " | ");
		}
	}
}
