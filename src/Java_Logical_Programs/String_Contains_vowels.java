package Java_Logical_Programs;

public class String_Contains_vowels 
{
public static void main(String[] args) 
{
	System.out.println(String_Contains_vowels("Hello"));
	System.out.println(String_Contains_vowels("Tv"));
}

private static boolean String_Contains_vowels(String input)
{
	return input.toLowerCase().matches(".*[aeiou].*");
}
}
