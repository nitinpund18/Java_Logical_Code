package string;

public class Split 
{
	public static void main(String[] args) {
		String s="Nitin Pund";
		String[] a = s.split("");
		System.out.println(a.length);
		for(int i=a.length-1; i>=0; i--)
		{
			System.out.print(a[i]);
		}
		System.out.println();
		String[] b = s.split(" ");
		System.out.println(b.length);
		for(int i=b.length-1; i>=0; i--)
		{
			System.out.print(b[i]+" ");
		}
	}
}
