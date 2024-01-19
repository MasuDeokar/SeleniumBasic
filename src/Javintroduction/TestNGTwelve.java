package Javintroduction;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class TestNGTwelve {
	
	@Test
	public void streamCollect() {

		// Print unique numbers.
		List<Integer> values = Arrays.asList(25, 100, 56, 89, 100, 22, 89, 90, 27, 25);
		List <Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(3));
	}

}
