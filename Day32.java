package training;

public class Day32 {

	void display()
	{
		byte x;
		int a=270;
		double b =128.128;
		x=(byte) a;
		System.out.println("a :"+a+" x :"+x);
		a=(int) b;
		System.out.println("b:"+b+" a:"+a);
		//x=b;
		System.out.println("b:"+b+" x:"+x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Day32().display();
	}

}
