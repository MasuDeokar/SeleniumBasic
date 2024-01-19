package TestNGAll;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BikeLoan {
	@Test(groups= {"Smoke"})
	public void LoginWeb() {
		System.out.println("Login on Web Page of BikeLoan");
	}

	@Test(dataProvider="getData")
	public void LoginMobile (String userName, String password){
		System.out.println("Login On Mobile Phone of BikeLoan");
		System.out.println(userName);
		System.out.println(password);
	}

	@Test(dependsOnMethods={"LoginMobile","LoginWeb"})
	public void LoginRestAPI() {
		System.out.println("Login on REST API of BikeLoan");
	}

	@Test
	public void password() {
		System.out.println("Password for Web, Mobile and Rest of BikeLoan");
	}
	@DataProvider
	public Object[][] getData() {
		Object[][] data = new Object[3][2];
		data[0][0]="Firstsetusername";
		data[0][1]="Firstpassword";
		
		data[1][0]="Secondsetusername";
		data[1][1]="Secondpassword";
		
		data[2][0]="Thirdsetusername";
		data[2][1]="ThirdSecondpassword";
		return data;

	}
}

