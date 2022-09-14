package training;

public class Quiz1 {
	
	void m1()
	{
		int i=0,j=5;
		for(;(i<3)&&(j++<10);)
		{
			System.out.println(" "+i+" "+j);
			i++;
		}
		System.out.println(" "+i+" "+j);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Quiz1().m1();
	}

}
