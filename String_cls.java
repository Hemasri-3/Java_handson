package training;

import java.util.Arrays;

public class String_cls {
	
	void m1()
	{
		String s1="hema";
		String s2=new String("unique");
		String s3="hema";
		String s4=new String("hema");
		
		//equals is used to compare contents
		System.out.println("s1 equlas s2 :"+s1.equals(s2));
		System.out.println("s1 equlas s2 :"+s1.equals(s2));
		
		//It will compare the address ==
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		
		String s="hemasri madd is a good";
		String a[]=s.split(" ",3);
		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args) {
		String_cls a=new String_cls();
		a.m1();
	}
}
