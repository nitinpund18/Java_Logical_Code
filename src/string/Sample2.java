package string;

public class Sample2 
{
	public static void main(String[] args) {
		String s1="Nitin";
		String s2="NITIN";
		String s3="Nitin Pund";
		System.out.println(s3.charAt(s3.length()-1));
		System.out.println(s3.startsWith("Nit"));
		System.out.println(s3.startsWith(s1));
		System.out.println(s3.endsWith("Nitin Pund"));
		System.out.println(s3.substring(2));
		System.out.println(s1.substring(2, 5)); //firstIndex-incluide, last index-excluide
		System.out.println(s3.substring(7,s3.length()));
		System.out.println(s3.indexOf('t'));
		System.out.println(s3.lastIndexOf('p'));
		String s=s1.concat(s2);
		System.out.println(s);
		System.out.println(s3.replace("i", "t"));
	}
}
