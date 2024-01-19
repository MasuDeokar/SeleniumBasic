package TestNGAll;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CarLoan {

	@AfterTest
	public void getLast() {
		System.out.println("After Test Annotation");
	}

	@Test
	public void LoginWeb() {
		System.out.println("Login on Web Page of CarLoan");
	}

	@Test
	public void LoginMobile() {
		System.out.println("Login On Mobile Phone of CarLoan");
	}

	@Test(groups= {"Smoke"})
	public void LoginRestAPI() {
		System.out.println("Login on REST API of CarLoan");
	}

	@Test
	public void password() {
		System.out.println("Password for Web, Mobile and Rest of CarLoan");
	}

	@BeforeTest
	public void getFirst() {
		System.out.println("Before Test Annotation");
	}

}
