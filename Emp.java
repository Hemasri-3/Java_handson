package training;

import java.util.Scanner;
public class Emp {
	void emp_details()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp name");
		String name=sc.nextLine();
		
		System.out.println("Enter emp num");
		int num=sc.nextInt();
		
		System.out.println("Enter emp Sal");
		float sal=sc.nextFloat();
		
		System.out.println("Enter emp add");
		sc.nextLine();
		String add=sc.nextLine();
		
		
		System.out.println(name);
		System.out.println(num);
		System.out.println(sal+(sal*10/100));
		System.out.println(add);
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Emp().emp_details();
	}

}
