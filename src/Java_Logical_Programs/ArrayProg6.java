package Java_Logical_Programs;

public class ArrayProg6
{
	public void printNewArray(int[] ar)
	{
		int[] newArr = new int[ar.length];
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length; j++) {
				if(i!=j) {
				newArr[i]=newArr[i]+ar[j];
			}}
			System.out.println(newArr[i]);
	}}
	public static void main(String[] args) {
		int[] a= {12,2,11,17};
		ArrayProg6 ob= new ArrayProg6 ();
		ob.printNewArray(a);
	}
}
