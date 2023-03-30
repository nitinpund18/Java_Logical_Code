package Collection;

import java.util.TreeSet;

public class Set_Treeset 
{
	public static void main(String[] args) {
		TreeSet ts= new TreeSet<>();
//		ts.add("Kiran");
//		ts.add("Rushikesh");
//		ts.add("Shivani");
//		ts.add("Manish");
//		ts.add("Archana");
//		ts.add("Sachin");
//		ts.add("Rutuja");
		ts.add(54);
		ts.add(46);
		ts.add(88);
		ts.add(22);
		ts.add(13);
		ts.add(22);
		ts.add(36);
		for(Object temp:ts)
		{
			System.out.println(temp);
		}
		System.out.println(ts.contains(22));
		System.out.println(ts.isEmpty());
		ts.remove(36);
		System.out.println(ts);
		System.out.println(ts.size());
	}
}
