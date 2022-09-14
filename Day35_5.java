package training;

public class Day35_5 {
	void m1(int n_att,int n_cl_held)
	{
		
		int perc;
		//int a=29/30;
		//System.out.println(a);
		perc=(n_att/n_cl_held)*100;
		System.out.println(perc);
		if(perc>=75)
		{
			System.out.println(" allowed ");
		}
		else
		{
			System.out.println("not allowed");
		}	
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Day35_5().m1(29,30);
	}

}
