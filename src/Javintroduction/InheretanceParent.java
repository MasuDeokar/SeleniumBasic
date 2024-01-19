package Javintroduction;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class InheretanceParent {

	public void doThis() {
		System.out.println("I am Here!!!");
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
