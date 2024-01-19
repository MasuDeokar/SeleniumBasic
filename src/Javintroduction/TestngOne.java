package Javintroduction;

import java.util.ArrayList;

import org.testng.annotations.Test;





public class TestngOne {

	@Test

	public void regularMethod() {

		ArrayList<String> names = new ArrayList<String>();

		names.add("Abhijit");
		names.add("Anup");
		names.add("Shamanth");
		names.add("Kartik");
		names.add("Anay");
		names.add("Amrita");
		int count = 0;

		for (int i = 0; i < names.size(); i++) {
			String actual = names.get(i);
			if (actual.startsWith("A")) {
				count++;
			}
		}
		System.out.println(count);
	}

}
