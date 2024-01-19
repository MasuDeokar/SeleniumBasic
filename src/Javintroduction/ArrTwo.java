package Javintroduction;

public class ArrTwo 
{
	public static void main(String [] args)
	{
		int arr1[]= {1,2,3,4,34,57,122,67,90,135,178,192,299,832,936,999};
		
		
		System.out.println("Length of Array :- "+arr1.length);
		for(int i=0;i<arr1.length;i++)
		{
			if(arr1[i] % 2 == 0)
			{
				System.out.println(arr1[i]);
			}
			else
			{
				System.out.println(arr1[i]+" not divide by 2.");
			}
		}
	}

}
