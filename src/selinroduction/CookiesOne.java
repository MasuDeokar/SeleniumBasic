package selinroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookiesOne {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies(); 
		// Above step to delete all cookies.
		driver.manage().deleteCookieNamed("Example");
		// Above step to delete particular cookie by name of of cookie.
		
		driver.get("http://google.com/");
		
	}

}
