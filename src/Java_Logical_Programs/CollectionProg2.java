package Java_Logical_Programs;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CollectionProg2
{
	public void printDuplicateName(String[] a)
	{
		System.out.println("Print all duplicate names from given Array");
		for(int i=0; i<a.length;i++)
		{
			for(int j=i; j<a.length; j++)
			{
				if(a[i].equalsIgnoreCase(a[j])&&i!=j)
				{
					System.out.print(a[i]+" ");
				}
			}
		}
	}
	public LinkedHashSet<String> getUniqueNames(String[] b)
	{
		System.out.println("Return unique names from given Array");
		LinkedHashSet<String> lhs= new LinkedHashSet<>();
		for(int i=0;i<b.length; i++)
		{
			lhs.add(b[i]);
		}
		return lhs;
	}
	public LinkedHashSet<Character> getUniqueChar(String name)
	{
		System.out.println("return unique characters from given name");
		LinkedHashSet<Character> lhs= new LinkedHashSet<>();
		for(int i=0;i<name.length(); i++)
		{
			lhs.add(name.charAt(i));
		}
		return lhs;
	}
	public LinkedHashSet<Integer> removeDuplicatesInsertionOrder(int[] c)
	{
		System.out.println("Remove duplicates from array containing numbers [insertion order]");
		LinkedHashSet<Integer> lhs= new LinkedHashSet<>();
		for(int i=0;i<c.length; i++)
		{
			lhs.add(c[i]);
		}
		return lhs;
	}
	public TreeSet<Integer> removeDuplicatesNaturalOrder(int[] c)
	{
		System.out.println("Remove duplicates from array containing numbers [Natural order]");
		TreeSet<Integer> tr= new TreeSet<>();
		for(int i=0;i<c.length; i++)
		{
			tr.add(c[i]);
		}
		return tr;
	}
	public Set<Integer> removeDuplicateUsingSet(int[] c)
	{
		System.out.println("duplicates from array containing numbers using Set");
		Set<Integer> set= new TreeSet<>();
		for(int i=0;i<c.length; i++)
		{
			set.add(c[i]);
		}
		return set;
	}
//	public List<Integer> removeDuplicateUsingList(int[] c)
//	{
		// correction
//		System.out.println("duplicates from array containing numbers using List");
//		List<Integer> l= new ArrayList<>(); 
//		for(int i=0;i<c.length; i++) {
//			l.add(c[i]);
//		}
//		System.out.println(l.size());
//			if() {
//					System.out.println(l.con);
//					l.remove(k);
//				}
//		return l;
//	}
	public static void main(String[] args) {
		String[] a={"Nitin", "Umesh", "Saroj", "Umesh"};
		String[] b={"Nitin", "Umesh", "Saroj", "Umesh","Umesh","Saroj"};
		String name="harsh";
		int[] c={10,10,13,12,12,10,55,66,55,11};
		CollectionProg2 ob = new CollectionProg2();
//		ob.printDuplicateName(a);
		System.out.println(ob.getUniqueNames(b));
		System.out.println(ob.getUniqueChar(name));
		System.out.println(ob.removeDuplicatesInsertionOrder(c));
		System.out.println(ob.removeDuplicatesNaturalOrder(c));
		System.out.println(ob.removeDuplicateUsingSet(c));
	//	System.out.println(ob.removeDuplicateUsingList(c));
	}
}
