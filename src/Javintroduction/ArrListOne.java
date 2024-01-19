package Javintroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrListOne {

	public static void main(String[] args)
	{
		ArrayList <String> m =new ArrayList<String>();
		m.add("Shamanth");
		m.add("Mayuresh");
		m.add("Vaishali");
		m.add("Deokar");
		System.out.println(m.get(2));
		System.out.println(m.contains("Shamanth"));
		
		System.out.println("******************************");
		
		//Below we convert simple array into ArryList
		String arr2[]= {"Shamant","Mayuresh","Deokar"};
		List<String> arr2ArrayList= Arrays.asList(arr2);
		System.out.println(arr2ArrayList.contains("Deokar"));
		
	}

}
