package Java_Logical_Programs;

public class Total_count_String 
{
public static void main(String[] args)
{
	String str="nitin pund";
	int count=0;
	System.out.println("The entered String is: " +str);
	for(int i=0; i<str.length();i++)
	{
		if(str.charAt(i)!=' ')
			count++;
	}
	System.out.println("Total number of character in the string : "+ count);
}
}
