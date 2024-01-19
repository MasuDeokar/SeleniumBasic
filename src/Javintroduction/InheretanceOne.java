package Javintroduction;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InheretanceOne extends InheretanceTwo {

	@Test
	public void testRun() {
		doThis();

	}

	@BeforeMethod
	public void beforeRun() {
		System.out.println("Run me first!!!");
	}

	@AfterMethod
	public void afterRun() {
		System.out.println("Run me Last!!!");

	}
}