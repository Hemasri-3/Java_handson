package training;

public class Palindrome {

	String m1()
	{
		String s="heh";
		int j=s.length()-1;
		for(int i=0;i<s.length();i++)
		{
		
		char c1=s.charAt(i);
		char c2=s.charAt(j);
		j--;
		if(c1==c2)
		{
			continue;
		}
		else
		{
			return("false");
		}
		}
		return("true");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new Palindrome().m1();
		System.out.println(s);
	}

}
