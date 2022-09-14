package total;

class A
{
	void m2()
	{
		System.out.println("Class A m2");
	}
	A()
	{
		System.out.println("default constructor");
	}
	
}
public class Inher extends A {

	Inher()
	{
		//super();
		this(10);
	}
	Inher(int a)
	{
		System.out.println("a val: "+a);
	}
	void m1()
	{
		//super();
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inher a=new Inher();
		a.m1();
		a.m2();
	}
	

}

