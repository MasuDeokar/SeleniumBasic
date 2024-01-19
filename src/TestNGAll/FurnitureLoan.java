package TestNGAll;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FurnitureLoan {

	@Parameters({ "URL" })
	@Test

	public void WebLogin(String urlname) {
		System.out.println("Web Login on Page of FurnitureLoan");
		System.out.println(urlname);
	}

	@Test(enabled = false)
	public void MobileLogin() {
		System.out.println("Mobile Login On Page of FurnitureLoan");
	}

	@Test(timeOut = 4000)
	public void RestAPILogin() {
		System.out.println("REST API Login on of FurnitureLoan");
	}

	@Test
	public void password() {
		System.out.println("Password for Web, Mobile and Rest of FurnitureLoan");
	}

	
}
