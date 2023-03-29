package Java_Logical_Programs;

public class UniqueChars 
{
	public void printUniqueCharsInEachEle(String[] ar)
	{
		for(int i=0; i<ar.length; i++)
		{
			System.out.println("Unique chars in "+ar[i]);
			String str=ar[i];
			for(int j=0; j<str.length(); j++)
			{
				int flag=0;
				for(int k=0; k<str.length(); k++)
				{
					if(str.charAt(j)==str.charAt(k) && j!=k)
					{
						flag++;
						break;
					}
				}
				if(flag==0) {
				System.out.println(str.charAt(j));
			}}
		}
	}
	public void printFirstUniqueCharinEachEle(String[] ar)
	{
		for(int i=0; i<ar.length; i++)
		{
			System.out.println("First unique chars in "+ar[i]);
			String str=ar[i];
			for(int j=0; j<str.length(); j++)
			{
				int flag=0;
				for(int k=0; k<str.length(); k++)
				{
					if(str.charAt(j)==str.charAt(k) && j!=k)
					{
						flag++;
						break;
					}
				}
				if(flag==0) {
				System.out.println(str.charAt(j));
				break;
			}}
		}
	}
	
	public static void main(String[] args) {
		String[] ar={"Nitin", "Kanani","Mahesh", "Kanani"};
		UniqueChars ob= new UniqueChars();
		ob.printUniqueCharsInEachEle(ar);
		ob.printFirstUniqueCharinEachEle(ar);
	}
}
