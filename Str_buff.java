package total;

public class Str_buff {

	void m1()
	{
		//private String stud_nmae;
		String s1=new String("Hema");
		StringBuffer buff=new StringBuffer("Hema");
		StringBuilder buil=new StringBuilder("Hema");
		
		String s2=new String("Hema");
		StringBuffer buff2=new StringBuffer("Hemasri");
		StringBuilder buil2=new StringBuilder("Hemasri");
		//append
		System.out.println(s1.concat("sri"));
		buff.append("sri");
		buil.append("sri");
		System.out.println(s1);
		System.out.println(buff);
		System.out.println(buil);
	
		//StringBuffer s2="hema"; we cannot initialize for string buffer
		//bcz there is no SCP
		//equals
		System.out.println(s1.equals(s2));
		System.out.println(buff.equals(buff2));//compares address
		System.out.println(buil.equals(buil2));
		
		System.out.println(s1==s2);
		System.out.println(buff==buff2);
		System.out.println(buil==buil2);
		
		//to check contents of buffer and builder
		System.out.println("compare "+(buff.toString()).equals(buff2.toString()));
		System.out.println("compare "+(buil.toString()).equals(buil2.toString()));
	
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Str_buff().m1();
	}

}
