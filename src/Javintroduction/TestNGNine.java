package Javintroduction;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.annotations.Test;

public class TestNGNine {

	@Test
	public void streamCollect() {

		List<String> ls = Stream.of("Abhijit", "Anup", "Shamanth", "Kartik", "Anay", "Amrita")
				.collect(Collectors.toList());
		System.out.println(ls.get(2));
	}
}
