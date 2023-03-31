package array;

public class MultiDimensionalArray 
{
	public static void main(String[] args) {
		int[][] b= {{1,2,3,4},{5,6,7},{8,9,10,11,12}};
		int[][] a= new int[3][4];
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[0][3]=4;
		a[1][0]=5;
		a[1][1]=6;
		a[1][2]=7;
		a[1][3]=8;
		a[2][0]=9;
		a[2][1]=9;
		a[2][2]=11;
		a[2][3]=12;
		System.out.println("a[] length="+a.length);
		System.out.println("a[0] length="+a[0].length);
		System.out.println("b[] length="+b.length);
		System.out.println("b[0] length="+b[0].length);
		System.out.println("b[1] length="+b[1].length);
		System.out.println("b[2] length="+b[2].length);
		System.out.println("******Printing array a******");
		for(int i=0; i<a.length; i++)	//rows
		{
			for(int j=0; j<a[i].length;j++) //cell
			{
				System.out.print(a[i][j]+", ");
			}
			System.out.println();
		}
		System.out.println("******Printing array b******");
		for(int i=0; i<b.length; i++)	//rows
		{
			for(int j=0; j<b[i].length;j++) //cell
			{
				System.out.print(b[i][j]+", ");
			}
			System.out.println();
		}
	}
}
