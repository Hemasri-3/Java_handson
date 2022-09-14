package training;
import java.util.Arrays;

public class Arr {
	void m1()
	{
		//int arr1[5]; cannot specify size during declaration
		int arr1[];
		arr1=new int[5];
		int arr2[]=new int[5];
		int arr3[]= {100,200,300};
		int arr4[]=new int[] {10,20,30,40};
		
		String s="java";
		
		System.out.println("Length of array :"+arr1.length);
		System.out.println("Length of str :"+s.length());
		System.out.println("accesing through Arrays"+Arrays.toString(arr4));
		
		
		System.out.print("Java is awsome");
		System.out.println();
		System.out.print("Hello");
		System.out.println();
		System.out.println("hey there");
		arr1[3]=10;
		arr1[0]=9;
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]+" ");	
		}
		System.out.println();
		System.out.println(arr3[0]);
		
		arr2[arr2.length-1]=45;
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");	
		}
		
		System.out.println();
		System.out.println("Reverse order");
		for(int i=arr1.length-1;i>=0;i--)
		{
			System.out.print(arr1[i]+" ");	
		}

		//System.out.println(arr3[3]); //Exception index out of range
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Arr().m1();

	}

}
