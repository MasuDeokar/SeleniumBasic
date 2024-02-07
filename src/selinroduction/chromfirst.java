package selinroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromfirst {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./Server/chromedriver.exe"); 
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize(); 
		//driver.get("https://www.google.com/");
		driver.get("https://github.com/");
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl() ); 																																						
		//driver.close();
	}

}
