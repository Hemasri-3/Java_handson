package training;


import java.util.Scanner;

public class Eco_Basket {
	Scanner sc=new Scanner(System.in);
	int n_items=0,total=0;
	void m1()
	{
		System.out.println("");
		System.out.println("=====Welcome to Eco Basket=====");
		System.out.println("|\t1. Fruits\t\t\t|");
		System.out.println("|\t2. Vegetables\t\t\t|");
		System.out.println("|\t3. Organic Staples\t\t|");
		System.out.println("|\t4. Dry Fruits\t\t\t|");
		System.out.println("--------------------------------");
		System.out.println("Please enter your choice");
		int ch=sc.nextInt();
		System.out.println("--------------------------------");
		switch(ch)
		{
		case 1:
			fruits();
			break;
		case 2:
			veg();
			break;
		case 3:
			staples();
			break;
		case 4:
			dry_fruits();
			break;
		default:
			System.out.println("enter valid input");
			new Eco_Basket().m1();		
		}
	}
	int pc;
	void fruits()
	{
		int n_kg;		
		int p_code[]={125,126,127,128};
		String p_name[]= {"Mango","Apple","Banana","Papaya"};
		int price[]= {50,100,25,44};
		System.out.println("---Welcome to Fruits module---");
		for(int i=0;i<p_code.length;i++)
		{
			System.out.print(p_code[i]+" -- "+p_name[i]+" -- Rs."+price[i]);
			System.out.println();
		}
		System.out.print("please choose your product code :");
		pc=sc.nextInt();
		for(int i=0;i<p_code.length;i++)
		{
			if(pc==p_code[i])
			{
				System.out.println(p_name[i]+" is a good choice how many kgs you need?");
				n_kg=sc.nextInt();
				n_items++;
				total+=(price[i]*n_kg);
				break;
			}
			else
			{
				System.out.println("Enter valid code");
				fruits();
			}
		}
		System.out.println("======================================================");
		//System.out.println("no of kg"+n_kg);
		System.out.println("continue with Fruits press 1\nMain menu press 2\nexit press 3");
		int m=sc.nextInt();
		if(m==1)
		{
			fruits();
		}
		else if(m==2)
		{
			m1();
		}
		else
		{
			bill();
		}
	}
	void veg()
	{
		int n_kg;
		int p_code[]={135,136,137,138};
		String p_name[]= {"Brinjal","Cabbage","Onion","Chillies"};
		int price[]= {50,100,25,44};
		System.out.println("---Welcome to Vege module---");
		for(int i=0;i<p_code.length;i++)
		{
			System.out.print(p_code[i]+" -- "+p_name[i]+" -- Rs."+price[i]);
			System.out.println();
		}
		System.out.print("please choose your product code :");
		pc=sc.nextInt();
		for(int i=0;i<p_code.length;i++)
		{
			if(pc==p_code[i])
			{
				System.out.println(p_name[i]+" is a good choice how many kgs you need?");
				n_kg=sc.nextInt();
				n_items++;
				total+=(price[i]*n_kg);
				break;
			}
			else
			{
				System.out.println("Enter valid code");
				veg();
			}
		}
		System.out.println("======================================================");
		System.out.println("continue with Vegtables press 1\nMain menu press 2\nexit press 3");
		int m=sc.nextInt();
		if(m==1)
		{
			veg();
		}
		else if(m==2)
		{
			m1();
		}
		else
		{
			bill();
		}
	}
	void staples()
	{
		int n_kg;
		int p_code[]={145,146,147,148};
		String p_name[]= {"Maida","Beasan","Sooji","Cornflour"};
		int price[]= {50,100,25,44};
		System.out.println("---Welcome to Staples module---");
		for(int i=0;i<p_code.length;i++)
		{
			System.out.print(p_code[i]+" -- "+p_name[i]+" -- Rs."+price[i]);
			System.out.println();
		}
		System.out.print("please choose your product code :");
		pc=sc.nextInt();
		for(int i=0;i<p_code.length;i++)
		{
			if(pc==p_code[i])
			{
				System.out.println(p_name[i]+" is a good choice how many kgs you need?");
				n_kg=sc.nextInt();
				n_items++;
				total+=(price[i]*n_kg);
				break;
			}
			else
			{
				System.out.println("Enter valid code");
				staples();
			}
		}
		System.out.println("======================================================");
		System.out.println("continue with Staples press 1\nMain menu press 2\nexit press 3");
		int m=sc.nextInt();
		if(m==1)
		{
			staples();
		}
		else if(m==2)
		{
			m1();
		}
		else
		{
			bill();
		}
	}
	void dry_fruits()
	{ 
		int n_kg;
		int p_code[]={155,156,157,158};
		String p_name[]= {"Almond","Dates","Cashew","Walnut"};
		int price[]= {50,100,25,44};
		System.out.println("---Welcome to Fruits module---");
		for(int i=0;i<p_code.length;i++)
		{
			System.out.print(p_code[i]+" -- "+p_name[i]+" -- Rs."+price[i]);
			System.out.println();
		}
		System.out.print("please choose your product code :");
		pc=sc.nextInt();
		for(int i=0;i<p_code.length;i++)
		{
			if(pc==p_code[i])
			{
				System.out.println(p_name[i]+" is a good choice how many kgs you need?");
				n_kg=sc.nextInt();
				n_items++;
				total+=(price[i]*n_kg);
				break;
			}
			else
			{
				System.out.println("Enter valid code");
				dry_fruits();
			}
		}
		System.out.println("======================================================");
		System.out.println("continue with Dry Fruits press 1\nMain menu press 2\nexit press 3");
		int m=sc.nextInt();
		if(m==1)
		{
			dry_fruits();
		}
		else if(m==2)
		{
			m1();
		}
		else
		{
			bill();
		}
	}
	void bill()
	{
		int disc=0;
		System.out.println("=================================");
		System.out.println("Total cost               :"+total);
		System.out.println("total items              :"+n_items);
		if(total>500)
		{
			disc=total*5/100;
			System.out.println("You have saved           :"+disc);
		}
		System.out.println("Your final bill is       :"+(total-disc));
		System.out.println("=====Thank you for shopping======");
	}
	public static void main(String[] args) {
		new Eco_Basket().m1();
	}
}
//239
