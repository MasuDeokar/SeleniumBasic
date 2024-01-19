package TestNGAll;

import org.testng.annotations.Test;

public class HomeLoan {
	
		@Test
		public void LoginWeb() {
			System.out.println("Login on Web Page of HomeLoan");
		}

		@Test
		public void LoginMobile() {
			System.out.println("Login On Mobile Phone of HomeLoan");
		}

		@Test
		public void LoginRestAPI() {
			System.out.println("Login on REST API of HomeLoan");
		}

		@Test(groups= {"Smoke"})
		public void password() {
			System.out.println("Password for Web, Mobile and Rest of HomeLoan");
		}

}
