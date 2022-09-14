package training;

public class Pattern1 {

	void m1()   
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i;j++)
			{
			System.out.print("* ");
			}
			System.out.println(" ");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Pattern1().m1();
	}

}
