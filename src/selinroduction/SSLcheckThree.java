package selinroduction;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLcheckThree {

	public static void main(String[] args) {
		
		// https://chromedriver.chromium.org/capabilities important for below operations.
		
		ChromeOptions option = new ChromeOptions();
		
		// Add the WebDriver proxy capability.
		Proxy proxy =new Proxy();
		proxy.setHttpProxy("ipaddress:445455");
		option.setCapability("proxy", proxy);
		
		//Set download directory
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default-", prefs);
		option.setExperimentalOption("prefs", prefs);
		
		option.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.chrome.driver", "./Server/chromedriver.exe");
		WebDriver driver = new ChromeDriver(option);
		driver.manage().window().maximize();
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
