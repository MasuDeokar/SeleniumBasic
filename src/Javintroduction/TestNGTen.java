package Javintroduction;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class TestNGTen {
	
	@Test
	public void streamCollect() {

		// Print unique numbers.
		List<Integer> values = Arrays.asList(25, 100, 56, 89, 100, 22, 89, 90, 27, 25);
		values.stream().distinct().forEach(s->System.out.println(s));
		
	}

}
