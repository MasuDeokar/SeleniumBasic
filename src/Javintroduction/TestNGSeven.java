package Javintroduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class TestNGSeven {
	@Test
	public void streamMap() {

		ArrayList<String> names = new ArrayList<String>();

		// Merging 2 lists
		names.add("Andrew");
		names.add("Mayuresh");
		names.add("Vaishali");
		names.add("Vagami");
		names.add("Anuj");
		names.add("Ashish");

		List<String> names1 = Arrays.asList("Azbhijit", "Anup", "Shamanth", "Kartik", "Anay", "Amrita");

		Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s -> System.out.println(s));

	}
}
