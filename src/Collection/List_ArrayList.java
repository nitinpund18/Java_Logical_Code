package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List_ArrayList 
{
	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add("Nitin Pund");
		al.add("9876543210");
		al.add(90.52);
		al.add('A');
		al.add('A');
		al.add(true);
		al.add(1234567891.1235546671);
		al.add(null);
		al.add(null);
		al.add("Nitin Pund");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		System.out.println(al.size());
		al.add(0, "Hi");
		System.out.println(al);
		boolean a = al.contains("Nitin Pund");
		System.out.println(a);
		System.out.println(al.get(2));
		al.set(0, "Hi");
		System.out.println(al);
		System.out.println("************Print Arraylist using for loop********");
		for(int i=0; i<al.size();i++)
		{
			System.out.println(al.get(i));
		}
		System.out.println("************Print Arraylist using for each********");
		for(Object temp:al)
		{
			System.out.println(temp);
		}
		System.out.println("************Arraylist using iterator********");
		System.out.println(al);
		Iterator itr = al.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		itr.remove();
		System.out.println(al);
		System.out.println("************Arraylist using Listiterator********");
		System.out.println(al);
		ListIterator litr = al.listIterator(5);
		System.out.println(litr.hasNext());
		System.out.println(litr.next());
		System.out.println(litr.next());
		System.out.println(litr.previous());
		System.out.println(litr.previous());
		System.out.println(litr.hasPrevious());
		litr.add("India");
		System.out.println(litr.nextIndex());
	}
	
}
