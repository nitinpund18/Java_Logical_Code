package Java_Logical_Programs;

public class ReverseString 
{
public static void main(String[] args) 
{
	String name= "Nitin Pund";
	   String reverseString="";
	   for (int i= name.length()-1; i>=0; i--)
	   {
		   reverseString= reverseString + name.charAt(i);
	   } 
	   System.out.println("Given String : " + name);
	   System.out.println("Reverse String : "+ reverseString);
}
}
