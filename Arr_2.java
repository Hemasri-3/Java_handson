package training;
import java.util.Scanner;

public class Arr_2 {
	
	int[] m1()
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("Please enter 3 elements");
		for(int i=0;i<3;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<2;i++)
		{
			if(a[i]==2 && a[i+1]==3)
				a[i+1]=0;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arr_2 obj=new Arr_2();
		int res[]=obj.m1();
		for(int data:res)
		{
			System.out.print(data);
		}
	}

}
