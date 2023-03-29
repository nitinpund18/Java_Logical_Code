package Java_Logical_Programs;

public class ArrayProg12 
{
	public void replaceEleWithGivenString(String[] a, String originalString, String newString)
	{
		System.out.println("Replace all Deepak with Shivani.");
		for(int i=0; i<a.length;i++)
		{
			if(a[i].equalsIgnoreCase(originalString))
			{
				a[i]=newString;
			}
			System.out.print(a[i]+", ");
		}
	}
	public void marks(int[] b)
	{
		System.out.println("\n Increase student marks by 10 if marks is less than 35.");
		for(int i=0; i<b.length; i++) {
			if(b[i]<35)
			{
			b[i]=b[i]+10;
			}
			System.out.print(b[i]+", ");
			}
	}
	public void printMiddleChar(String[] c)
	{
		System.out.println("\nlist of Middle character from given name if length of the name is more than 6 characters");
		for(int i=0; i<c.length;i++)
		{
			int l=c[i].length();
			if(l>6)
			{
				if(l%2!=0) {
				System.out.print(c[i].charAt(l/2)+", ");
				}
				else
				{
					System.out.print(c[i].charAt(l/2-1)+", "	);					
				}
			}
		}
	}
	public void printData(String[] d)
	{
		System.out.println("list of name if name starts with Vowel, contains atleast one digit and having exactly 1 uppercase");
		for(int i=0; i<d.length; i++) {
			int digitCount=0;
			int ucCount=0;			
			char firstChar = d[i].toLowerCase().charAt(0);
			if(firstChar=='a'||firstChar=='e'||firstChar=='i'||firstChar=='o'||firstChar=='u')
			{
				for(int j=0; j<d[i].length(); j++)
				{
					if(Character.isDigit(d[i].charAt(j)))
					{
						digitCount++;
					}
					if(Character.isUpperCase(d[i].charAt(j)))
					{
						ucCount++;
					}
			}}
			if(ucCount==1&&digitCount>0)
			{
				System.out.print(d[i]+", ");
			}
			}
	}
	public static void main(String[] args) {
		String[] a={"Nitin", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		String originalString="Deepak";
		String newString="Shivani";
		ArrayProg12 ob= new ArrayProg12();
		ob.replaceEleWithGivenString(a,originalString,newString);
		int[] b= {23,55,34,88,58,81};
		ob.marks(b);
		String[] c={"Nitin", "Anuja", "Deepak", "Sagar", "AKanksha", "Amol", "Deepak", "Deepak"};
		ob.printMiddleChar(c);
		String[] d={"Ni3tin", "is4h4a", "i5Sha4n","nUpur3"};
		ob.printData(d);
	}
}
