package Javintroduction;

import java.util.stream.Stream;
import org.testng.annotations.Test;

public class TestNGThree {

	@Test
	public void streamMethod() {

		// there is no life for intermediate(Like Filter operation) operation if there
		// is no terminal operation(Lambda Operation).
		// Terminal operation will execute only if intermediate operation return true.
		// Here filter(s->s.startsWith("A")) filter is intermediate operation.
		// and (s->s.startsWith("A")) is lambda operation.
		// Long c = names.stream().filter(s -> s.startsWith("A")).count();
		// System.out.println(c);

		Long d = Stream.of("Abhijit", "Anup", "Shamanth", "Kartik", "Anay", "Amrita").filter(s -> s.startsWith("A"))
				.count();
		System.out.println(d);
		// print all the name of the array.
	}

}
