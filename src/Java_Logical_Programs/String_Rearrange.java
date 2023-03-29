package Java_Logical_Programs;

public class String_Rearrange
{
	public String getRearrangeString1(String name)
	{
		String digitStr="";
		String charStr="";
		for(int i=0; i<name.length(); i++)	{
			char ch = name.charAt(i);			
			if(Character.isDigit(ch)==true) {
				digitStr=digitStr+name.charAt(i);
			}
			else {
				charStr=charStr+name.charAt(i);
			}
		}
		String str=digitStr+charStr;
		return str;
	}
	public String getRearrangeString2(String name)
	{
		String digitStr="";
		String ucStr="";
		String lcStr="";
		for(int i=0; i<name.length(); i++)	{
			char ch = name.charAt(i);			
			if(Character.isDigit(ch)==true) {
				digitStr=digitStr+name.charAt(i);
			}
			else if(Character.isUpperCase(ch)==true) {
				ucStr=ucStr+name.charAt(i);
			}
			else if(Character.isLowerCase(ch)==true) {
				lcStr=lcStr+name.charAt(i);
			}
		}
		String str=ucStr+digitStr+lcStr;
		return str;
	}
	public int getFrequencyOfChar(String name, char a)
	{
		int count=0;
		for(int i=0; i<name.length(); i++) {
			char b = name.charAt(i);		
			if(a==b) {
			count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str1="ni2t4in";
		String str2="p101u3n4d5";
		String str3="Nitin S Pund";
		char targetChar='n';
		
		String_Rearrange ob= new String_Rearrange();
		System.out.println(ob.getRearrangeString1(str1));
		System.out.println(ob.getRearrangeString2(str2));
		System.out.println(ob.getFrequencyOfChar(str3, targetChar));
	}
}
