package Java_Logical_Programs;

import java.util.ArrayList;

public class CollectionProg
{
	private void removeGivenNameInArrayList(ArrayList<String> al1, String givenName) {
		if(al1.contains(givenName))
		{
			al1.remove(givenName);
		}
		System.out.println(al1);
	}
	private void removeMultipleOccuranceOfGivenStringInArrayList(ArrayList<String> al2, String givenName) {
		for(int i=0; i<al2.size(); i++)
		{
			if(al2.indexOf(givenName)!=al2.lastIndexOf(givenName))
			{
				al2.remove(al2.lastIndexOf(givenName));
			}
		}
		System.out.println(al2);
	}
	private void removeMultipleOccuranceInArrayList(ArrayList<String> al3) {
		for(int i=0; i<al3.size(); i++)
		{
			for(int j=0; j<al3.size(); j++)
			{
			if(al3.get(i).equals(al3.get(j)) && i!=j)
			{
				al3.remove(al3.lastIndexOf(al3.get(i)));
			}
		}}
		System.out.println(al3);
	}
	
	public static void main(String[] args) {
		String[] a={"Sagar","Nitin","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
		String[] b= {"Sagar","Nitin","Sagar","Apurva","Gaurav","Sagar","Deepak","Rashmi"};
		String[] c= {"Sagar","Nitin","Sagar","Harshal","Apurva","Gaurav","Sagar","Gaurav"};
		ArrayList<String> al1=new ArrayList<>();
		for(int i=0; i<a.length;i++) {
			al1.add(a[i]);
		}
		ArrayList<String> al2=new ArrayList<>();
		for(int i=0; i<b.length;i++) {
			al2.add(b[i]);
		}
		ArrayList<String> al3=new ArrayList<>();
		for(int i=0; i<c.length;i++) {
			al3.add(c[i]);
		}
		CollectionProg ob= new CollectionProg();
		String givenName="Sagar";
		ob.removeGivenNameInArrayList(al1,givenName);
		ob.removeMultipleOccuranceOfGivenStringInArrayList(al2,givenName);
		ob.removeMultipleOccuranceInArrayList(al3);
	}
}
