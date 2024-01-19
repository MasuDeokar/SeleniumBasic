package Javintroduction;

public class ArrStart 
{
	public static void main(String [] arg)
	{
		
		int arr1[]= {12,14,33,45,67,87,90,58};
		System.out.println("Array Length:- "+arr1.length);
		for(int i=0;i<arr1.length;i++)
		{			
			System.out.print(arr1[i]+" ");
		}	
		System.out.println();
		String arr2[]= {"Shamant","Mayuresh","Deokar"};
		for(int i=0;i<arr2.length;i++)
		{
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		// Another simple notation of for loop
		for(int s:arr1)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		for(String m:arr2)
		{
			System.out.print(m+" ");
		}
	}
	

}
