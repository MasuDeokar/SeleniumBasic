package Javintroduction;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class TestNgTwo {
	
	@Test

	public void streamMethod() {
		

		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhijit");
		names.add("Anup");
		names.add("Shamanth");
		names.add("Kartik");
		names.add("Anay");
		names.add("Amrita");
		
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	}

}
