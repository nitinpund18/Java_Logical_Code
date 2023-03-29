package Java_Logical_Programs;

public class StringPorg2
{
	public String getLongestWordinString(String str)
	{
		String[] ar = str.split(" ");
		String s="";
		int l=0;;
		for(int i=0; i<ar.length; i++) {
			if(ar[i].length()>l){
				l=ar[i].length();
				s=ar[i];
		}}
		return s;
	}
	public void printWordsWithDigitInString(String str)
	{
		String[] ar = str.split(" ");
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length(); j++) {
				if(Character.isDigit(ar[i].charAt(j))==true) {
					System.out.println(ar[i]);
					break;
		}}}
	}
	public String getWordWithMaxUppercase(String str)
	{
		String[] ar = str.split(" ");
		String word="";
		int higestUCCount=0;
		for(int i=0; i<ar.length; i++) {
			int ucCount=0;
			for(int j=0; j<ar[i].length(); j++) {
				if(Character.isUpperCase(ar[i].charAt(j))==true) {
					ucCount++;
					if(ucCount>=higestUCCount) {
						higestUCCount=ucCount;
						word=ar[i];
		}}}}
		return word;
	}
	public void printWordWithOutDigitUppercase(String str)
	{
		
		String[] ar = str.split(" ");
		for(int i=0; i<ar.length; i++) {
			int flag=0;
			for(int j=0; j<ar[i].length(); j++) {
				if(Character.isDigit(ar[i].charAt(j))==true ||Character.isUpperCase(ar[i].charAt(j))==true) {
					flag++;
		}}
			if(flag==0) {
			System.out.println(ar[i]);
			}
		}
	}
	public static void main(String[] args) {
		String input1 = "Good morning friends this is globant";
		String input2 = "Good mor9ning fr3iends t2hi2s is globant";
		String input3 = "Good Mor9niNg FR3ienDs t2hi2s Is Globant";
		String input4 = "Good mor9ning globant fr3iends";
		StringPorg2 ob = new StringPorg2();
//		System.out.println(ob.getLongestWordinString(input1));
//		ob.printWordsWithDigitInString(input2);
//		System.out.println(ob.getWordWithMaxUppercase(input3));
		ob.printWordWithOutDigitUppercase(input4);
	}
}
