package Java_Logical_Programs;

public class StringProg3
{
	public void printAllRepetedWords(String str) {
		String[] ar = str.toUpperCase().split(" ");
		for(int i=0; i<ar.length; i++) {
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i].equals(ar[j])) {
					System.out.println(ar[i]);
					break;
		}}}
	}
	public void printAllNonRepetedWords(String str) {
		String[] ar = str.toUpperCase().split(" ");
		for(int i=0; i<ar.length; i++) {
			int flag=0;
			for(int j=0; j<ar.length; j++) {
				if(ar[i].equals(ar[j]) && i!=j) {
					flag++;
					break;
		}}
		if(flag==0)
		{
			System.out.println(ar[i]);
		}
		}
	}
	public static void main(String[] args) {
		String str1="Nitin Puja Hindavi Shubham Hindavi Shubham Titiksha Swati";
		String str2="Nitin Puja Hindavi Shubham hindavi Shubham Titiksha Swati";
		StringProg3 ob= new StringProg3();
		ob.printAllRepetedWords(str1);
		ob.printAllNonRepetedWords(str2);
		
	}
}
