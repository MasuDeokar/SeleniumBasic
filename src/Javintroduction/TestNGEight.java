package Javintroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGEight {
	@Test
	public void streamMap() {

		ArrayList<String> names = new ArrayList<String>();

		// Merging 2 different lists
		names.add("Andrew");
		names.add("Mayuresh");
		names.add("Vaishali");
		names.add("Vagmi");
		names.add("Anuj");
		names.add("Ashish");

		List<String> names1 = Arrays.asList("Azbhijit", "Anup", "Shamanth", "Kartik", "Anay", "Amrita");

		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());

		boolean flag = newStream.anyMatch(s -> s.equalsIgnoreCase("Vagmi"));
		System.out.println(flag);
		Assert.assertTrue(flag);

	}
}