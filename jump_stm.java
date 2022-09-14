package training;

public class jump_stm {
	void m1()
	{
		System.out.println("Jump statments");
		for(int i=0;i<=10;i++)
		{
			if(i==5)
			{
				break;//out of loop
				//continue;//go to start of loop
				//return;//out of method
			}
		System.out.println(i);
		}
		System.out.println("out of loop");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new jump_stm().m1();
	}

}
