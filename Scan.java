package training;

import java.util.Scanner;
public class Scan {
	Scanner sc=new Scanner(System.in);
	void m1()
	{
		System.out.println("Enter a");
		int a=sc.nextInt();
		
		System.out.println("Enter b");
		int b=sc.nextInt();
		
		System.out.println(a+b);
	}
	String m2()
	{
		System.out.println("Enter value");
		int a=sc.nextInt();
		//int b=sc.nextInt();
		
		System.out.println("enetred valu"+a);
		if(a>0)
		{
			System.out.println("check num");
			return sc.next();
		}
		else
		{
			System.out.println("check num");
			return sc.next();
		}
	}
	void m3(int a,int b)
	{
		for(System.out.println("m4");a<=b;a++)
		{
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scan a=new Scan();
		a.m1();
		String res=a.m2();
		System.out.println(res);
		
		a.m3(a.sc.nextInt(), a.sc.nextInt());
	}

}
