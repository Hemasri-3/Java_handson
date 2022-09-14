package total;
import java.util.Scanner;
import java.util.Arrays;
public class Str_hand {
	Scanner sc=new Scanner(System.in);
	void m1()
	{
		// we cannot convert char to string
		//String s11="Java";
		//char ch='c';
		//String s10=ch;
		
		//String class
		String s1="hema";
		String s2=new String("unique");
		String s3="hema";
		String s4=new String("hema");
		//char array converting to string
		char c[]={'J','A','V','A'};
		String a6=new String(c);
		System.out.println("a6 :"+a6);
		for(char i:c)
		{
			System.out.println(i);
		}
		//equals is used to compare contents
		System.out.println("s1 equlas s2 :"+s1.equals(s2));
		System.out.println("s1 equlas s2 :"+s1.equals(s4));
		System.out.println("--------------------------------");
		
		//It will compare the address ==
		System.out.println("== operator :"+(s1==s2));
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println("comparing hema s4(new obj) :"+("hema"==s4));
		System.out.println("comparing hema s3(scp) :"+("hema"==s3));

		System.out.println("--------------------------------");
		String s5="Java";
		
		//concat
		System.out.println("concat operation :"+s5.concat("is awsm"));
		System.out.println(s5);
		
		//split
		String s="hemasri is a good";
		String a[]=s.split(" ",3);
		System.out.println(Arrays.toString(a));
	}
	void m2()
	{
		String s="Never Ever give up";
		String a="Hemasri";
		
		//str length(), charAt()
		System.out.println("leng :"+s.length());
		System.out.println("charAt(2) :"+s.charAt(2));
		
		System.out.println("Enter your gender M/F");
		String s1=sc.next();
		char gender = s1.toUpperCase().charAt(0);
		switch(gender)
		{
		case 'M':
			System.out.println("you are male");
			break;
		case 'F':
			System.out.println("u are Female");
			break;
		default:
			System.out.println("please enter valid input");
		}
		
		//startsWith
		System.out.println("starts with :"+s.startsWith("N"));
		System.out.println("starts with :"+s.startsWith("Never"));
		System.out.println("Hemasri maddukuri".startsWith(" ".concat(a)));
		System.out.println("Hemasri maddukuri".startsWith(a));
		
		//toLowerCase, toUpperCase
		System.out.println(s.toLowerCase());
		System.out.println(s);
		System.out.println("java".toUpperCase());
		
		//
	
	}
	void m3()
	{
		String s1="I Love India";
		String s2=" Hello World    ";
		//substring
		System.out.println(s1.substring(5));
		System.out.println(s1.substring(0, 5));
		
		//replace
		System.out.println(s1.replace('I', 'U'));
		System.out.println(s1.replace("Love","Lovely"));
		
		//trim, indexOf,lastIndexOf
		System.out.println(s2.length());
		System.out.println(s2.trim());
		System.out.println(s2);
		System.out.println(s2.indexOf('l'));
		System.out.println(s2.indexOf("el"));
		System.out.println(s2.lastIndexOf('l'));
		
		//split
		String s3="29-09-22";
		String a[]=s3.split("-");
		System.out.println(Arrays.toString(a));
		
		//getBytes
		String s4="ABCDEF";
		byte a2[]=s4.getBytes();
		System.out.println(Arrays.toString(a2));
		
		for(byte x:a2)
		{
			System.out.print((char)x+" ");
		}
		
		
	}
	public static void main(String[] args) {
		Str_hand a=new Str_hand();
		//a.m1();
		//a.m2();
		a.m3();
	}
}
