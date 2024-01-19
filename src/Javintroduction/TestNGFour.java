package Javintroduction;

import java.util.ArrayList;

import org.testng.annotations.Test;

public class TestNGFour {

	@Test

	public void streamMethod() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhijit");
		names.add("Anup");
		names.add("Shamanth");
		names.add("Kartik");
		names.add("Anay");
		names.add("Amrita");

		names.stream().filter(s -> s.length() > 4).forEach(s -> System.out.println(s));
		// Below is for limit the result.
		names.stream().filter(s -> s.length() > 4).limit(1).forEach(s -> System.out.println("Limit to result:-" + s));
	}

}
