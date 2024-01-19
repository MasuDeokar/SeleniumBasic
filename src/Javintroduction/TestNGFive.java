package Javintroduction;

import java.util.stream.Stream;

import org.testng.annotations.Test;

public class TestNGFive {
@Test
	public void streamMap() {
		// printing name which have last letter a with upper case
		Stream.of("Abhijit", "Anup", "Shamanth", "Kartik", "Anay", "Amrita")
		.filter(s->s.endsWith("a")).map(s->s.toUpperCase())
		.forEach(s->System.out.println(s));
	}

}
