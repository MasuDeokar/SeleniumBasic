package selinroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class SSLcheckTwo {

	public static void main(String[] args) {
		
		EdgeOptions option = new EdgeOptions();	
		option.setAcceptInsecureCerts(true);
		
		System.setProperty("webdriver.msedge.driver","./Server/msedgedriver.exe"); 
		WebDriver driver = new EdgeDriver(option); 
		driver.manage().window().maximize();
		
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());

	}

}
