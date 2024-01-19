package TestNGAll;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class PersonalLoan {
	@Test
	public void LoginWeb() {
		System.out.println("Login on Web Page of PersonalLoan");
	}

	@Test
	public void LoginMobile() {
		System.out.println("Login On Mobile Phone of PersonalLoan");
	}
	@BeforeSuite
	public void BSouite() {
		System.out.println("I am number 1");
	}
	@Test
	public void LoginRestAPI() {
		System.out.println("Login on REST API of PersonalLoan");
	}

	@Test
	public void password() {
		System.out.println("Password for Web, Mobile and Rest of PersonalLoan");
	}
}
