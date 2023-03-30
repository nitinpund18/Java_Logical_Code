package Oops.casting;

public class PrimitiveCasting 
{
	public static void main(String[] args) {
		//implicit
	byte a=10;
	float b=a;
	System.out.println(b);
	double d= a;
	System.out.println(d);
	short e=a;
	System.out.println(e);
	
	
	//explicit casting
	int i=10000000;
	short j=(short) i;
	System.out.println(j);
	double f=100.784548791232155472f;
	int g=(int) f;
	System.out.println(g);
	float h=(float) f;
	System.out.println(h);
	char c=(char) f;
	System.out.println(c);
	}
}
