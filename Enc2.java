package training;

import java.util.Scanner;

import total.Enc1;

public class Enc2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Enc1 a=new Enc1();
		
		System.out.println("Enter emp name :");
		a.setEmpName(sc.next());
		
		System.out.println("Enter emp exper :");
		a.setEmpExp(sc.nextInt());
			
		System.out.println("Enter emp sal :");
		a.setEmpSal(sc.nextDouble());
	
		System.out.println(a.getEmpName());
		System.out.println(a.getEmpExp());
		System.out.println(a.getEmpSal());
		sc.close();

	}


}
