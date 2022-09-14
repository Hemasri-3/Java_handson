package total;

public class Word {

	String m1(String out,String wrd)
	{
		return out.substring(0,2)+wrd+out.substring(2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Word().m1("[[]]", "Hema");
		System.out.println(s);
	}

}
