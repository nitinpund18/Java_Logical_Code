package string;

public class Sample1 
{
	public static void main(String[] args) {
		String s1="Nitin";
		String s = s1.toUpperCase();
		System.out.println(s);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.length());
		String s2="Nitin Pund";
		System.out.println(s2.contains(s1));
		String s3="NITIN";
		System.out.println(s1.equalsIgnoreCase(s3));
		String s4="  ";
		String s5=null;
		System.out.println(s4.isEmpty());
	//	System.out.println(s4.isBlank());		//space will be treated as blank
	}
}
