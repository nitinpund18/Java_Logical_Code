package Java_Logical_Programs;

public class Vowels 
{
	public int getCountOfVovels(String str)
	{
		int count=0;
		for(int i=0; i<str.length(); i++) {
			char ch=str.toUpperCase().charAt(i);
			if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
				count++;
			}
		}
		return count;
	}
	public void printCountOfVovelsInArrayEle(String[] ar)
	{
		for(int i=0; i<ar.length; i++) {
			int count=0;
			for(int j=0; j<ar[i].length(); j++) {
				char ch=ar[i].toUpperCase().charAt(j);
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
					count++;
				}
			}
			System.out.println(ar[i]+"->"+count);
		}
	}
	
	public static void main(String[] args) {
	String a="Ashish";
	String[] b={"Nitin","Aditty","Manjiri","Ankita"};
	Vowels ob= new Vowels();
	System.out.println(ob.getCountOfVovels(a));
	ob.printCountOfVovelsInArrayEle(b);
	}
}
