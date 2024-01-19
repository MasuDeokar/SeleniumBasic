package selinroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefofirst {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.geko.driver","./Server/gekodriver.exe"); ; 
		WebDriver driver = new FirefoxDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://rahulshettyacademy.com/"); 
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl());																																						
		driver.close();
		

	}

}
