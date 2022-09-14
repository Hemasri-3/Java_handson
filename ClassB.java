package training;

public class ClassB {
	protected void m1()//if default cannot be accessable
	{
		System.out.println("class B");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CLassA().m1();
		new ClassB().m1();
	}

}
