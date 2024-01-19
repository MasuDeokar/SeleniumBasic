package Javintroduction;

public class StrinOne {

	public static void main(String[] args) {
		
		String s ="Shamanth"; // This presentation of String is Literal type.
		String s1="Shamanth"; // here for Shamanth memory will allocate for only single time.
		// Means For same value of String memory allocate single time in literal type.
		
		String s2= new String("Shamanth Mayuresh Deokar"); // This is another type to present string by creating object.
		String s3=new String ("Shamanth Mayuresh Deokar"); // Here separate memory allocate for every object.
		
		  String [] SplitString =s2.split(" ");
		  System.out.println(SplitString[0]);
		  System.out.println(SplitString[1]);
		  System.out.println(SplitString[2]);
		  
		  System.out.println("********************************************************");
		  
		  String [] SplitString1 =s2.split("Mayuresh");
		  System.out.println(SplitString1[0]);
		  System.out.println(SplitString1[1]);
		  System.out.println(SplitString1[1].trim()); // here we removed white space.
		  
		  System.out.println("**********************Reverse String**************************");
		  
		  for(int i=s2.length()-1;i>0;i--)
		  {
			  System.out.print(s2.charAt(i));
		  }
		  System.out.println();
		  System.out.println(s2.toLowerCase());
		  
		  System.out.println("**************************************");
		  System.out.println(s1);
		  System.out.println(s);
		  System.out.println(s3);
		  
	}

}
