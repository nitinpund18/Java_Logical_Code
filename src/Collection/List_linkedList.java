package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class List_linkedList 
{
	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.add("Nitin Pund");
		ll.add("9876543210");
		ll.add(90.52);
		ll.add('A');
		ll.add('A');
		ll.add(true);
		ll.add(1234567891.1235546671);
		ll.add(null);
		ll.add(null);
		ll.add("Nitin Pund");
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.isEmpty());
		System.out.println(ll.contains(90.52));
		ll.remove(null);
		System.out.println("************Linkedlist using for loop********");
		for(int i=0; i<ll.size(); i++)
		{
			System.out.print(ll.get(i)+" | ");
		}
		System.out.println("\n************Linkedlist using foreach loop********");
		for(Object temp:ll)
		{
			System.out.print(temp+" | ");
		}
		System.out.println("\n************Linkedlist using Iterator********");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+ " | ");
		}
		System.out.println("\n************Linkedlist using ListIterator********");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+ " | ");
		}
	}
}
