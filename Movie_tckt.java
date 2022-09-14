package training;
import java.util.Scanner;
public class Movie_tckt {
	void m1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("How many tickets you want");
		String a[]=new String[sc.nextInt()];
		System.out.println("Please select your row A,B,C,D");
		String r=sc.next();
		System.out.println("Please enter names");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.next();
		}
		int c=0;
		System.out.println("your tickets");
		for(String data:a)
		{
			c=c+1;
			System.out.println(data+" "+r.charAt(0)+c);
		}
		sc.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Movie_tckt().m1();

	}

}
