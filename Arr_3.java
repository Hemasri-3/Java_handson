package training;

import java.util.Scanner;

public class Arr_3 {
	int m1(int[] a)
	{
		if(a.length>=2)
			return a[0]+a[1];
		else if(a.length==1)
			return a[0];
		else
			return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Arr_3 o=new Arr_3();
		System.out.println("enter size"
				+ "");
		int a[]=new int[sc.nextInt()];
		System.out.println("Please enter elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int res=o.m1(new int[] {10,20,30});
		//int res=o.m1(a);
		System.out.println("The sum :"+res);
	}

}
