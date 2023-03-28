package Java_Logical_Programs;

import java.util.HashMap;
import java.util.Scanner;

public class Index
{
	HashMap<Integer, String> hm;
	public void day(int dayIndex)
	{
		hm= new HashMap<Integer, String>();
		hm.put(1,"Monday");
		hm.put(2,"Tuesday");
		hm.put(3,"Wednesday");
		hm.put(4,"Thursday");
		hm.put(5,"Friday");
		hm.put(6,"Saturday");
		hm.put(7,"Sunday");
		if(dayIndex>=1 && dayIndex<=7)
		{
		System.out.println(hm.get(dayIndex));
		}
		else
		{
			System.out.println("Invalid day index");
		}
	}
	public void dayType(int dayIndex)
	{
		if(dayIndex<=0 || dayIndex>=8)
		{
			System.out.println("Invalid index");
		}
		else if (dayIndex>=1 && dayIndex<=5)
		{
			System.out.println("Weekday");
		}
		else
		{
			System.out.println("Weekend");
		}
	}
	public void quarter(int monthIndex)
	{
		float i = monthIndex/3;
		
		if(monthIndex>=1 && monthIndex<=12)
		{
			int q;
			for(q=1; q<=4; q++)
			{
			if(monthIndex<=q*3)
			{
				System.out.println("FY2022 Q"+q);
				break;
			}
			}

		}
		else 
		{
		System.out.println("Invalid month index");
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter numbers");
		int index = sc.nextInt();
		sc.close();
		Index ob= new Index();
		ob.day(index);
		ob.dayType(index);
		ob.quarter(index);
	}
}
