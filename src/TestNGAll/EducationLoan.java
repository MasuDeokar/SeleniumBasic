package TestNGAll;


import org.testng.annotations.Test;

public class EducationLoan {

	
	@Test
	public void LoginWeb() {
		System.out.println("Login on Web Page of EducationLoan");
	}

	@Test(groups= {"Smoke"})
	public void LoginMobile() {
		System.out.println("Login On Mobile Phone of EducationLoan");
	}

	@Test
	public void LoginRestAPI() {
		System.out.println("Login on REST API of EducationLoan");
	}

	@Test
	public void password() {
		System.out.println("Password for Web, Mobile and Rest of EducationLoan");
	}

}
