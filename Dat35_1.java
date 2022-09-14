package training;

public class Dat35_1 {
	int x,y;//instance var.
	Dat35_1(int a,int b)
	{
		x=a;
		y=b;
	}
	void big()
	{
		if(x>y)
			System.out.println(x);
		else
			System.out.println(y);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Dat35_1(40,20).big();
	}

}
