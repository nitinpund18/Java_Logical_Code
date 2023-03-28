package Java_Logical_Programs;

public class Reverse_Each_Word 
{
public static void main(String[] args) 
{
	String s="Nitin Pund";
	String[]words=s.split(" ");
	String revString="";
	System.out.println(words[1]);
	for(int i=0; i<words.length;i++)
	{
		String word=words[i];
		String revWord="";
		
		for(int j=word.length()-1;j>=0;j--)
		{
			revWord=revWord+word.charAt(j);
		}
		revString=revString+revWord+" ";
	}
	System.out.println("Given string is : "+ s);
	System.out.println("Reverse words of given string is : "+revString);

}
}
