package Javintroduction;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.Test;

public class TestNGSix {

	@Test
	public void streamMap() {
		// WAP name which have first letter as a with upper case and sorted.
		
		List<String> names = Arrays.asList("Azbhijit", "Anup", "Shamanth", "Kartik", "Anay", "Amrita");
		
		names.stream().filter(s->s.startsWith("A")).sorted()
		.map(s->s.toUpperCase()).forEach(s->System.out.println(s));
}
}
