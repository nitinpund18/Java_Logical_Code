package Collection;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class List_Vector 
{
	public static void main(String[] args) {
		Vector v= new Vector();
		v.add("Nitin Pund");
		v.add("9876543210");
		v.add(90.52);
		v.add('A');
		v.add('A');
		v.add(true);
		v.add(1234567891.1235546671);
		v.add(null);
		v.add(null);
		v.add("Nitin Pund");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		System.out.println(v.size());
		v.add(0, "Hi");
		System.out.println(v);
		boolean a = v.contains("Nitin Pund");
		System.out.println(a);
		System.out.println(v.get(2));
		v.set(0, "Hi");
		System.out.println(v);
		System.out.println("************Print Vector using for loop********");
		for(int i=0; i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
		System.out.println("************Print Vector using for each********");
		for(Object temp:v)
		{
			System.out.println(temp);
		}
		System.out.println("************Vector using iterator********");
		System.out.println(v);
		java.util.Iterator itr = v.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.next());
		System.out.println(itr.hasNext());
		itr.remove();
		System.out.println(v);
		System.out.println("************Vector using Listiterator********");
		System.out.println(v);
		ListIterator litr = v.listIterator(5);
		System.out.println(litr.hasNext());
		System.out.println(litr.next());
		System.out.println(litr.next());
		System.out.println(litr.previous());
		System.out.println(litr.previous());
		System.out.println(litr.hasPrevious());
		litr.add("Aspire");
		System.out.println(litr.nextIndex());
		System.out.println("************Vector using Enumeration cursor********");
		System.out.println(v);
		Enumeration en = v.elements();
//		System.out.println(en.nextElement());
//		System.out.println(en.nextElement());
//		System.out.println(en.nextElement());
//		System.out.println(en.hasMoreElements());
//		System.out.println(en.nextElement());
		while(en.hasMoreElements())
		{
			Object temp = en.nextElement();
		//	System.out.println(v.indexOf(temp)+"-->"+temp);
			System.out.println(v.lastIndexOf(temp)+"-->"+temp);
		}
	}
}
