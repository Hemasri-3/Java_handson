package training;

public class Task {
	void display()
	{
		int a=10;
		for(int k=(a++ +new Task().m1(5)+(++a +3)+(++a + 3));k>10;k++)
		{
			System.out.println(k+6);
			break;
		}
	}
	int m1(int a)
	{
		return new Task().m2(10+1,15-3)+(a*2);
	}
	int m2(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Autosys-generated method stub
		Task a=new Task();
		a.display();
	}

}
