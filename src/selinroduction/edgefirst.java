package selinroduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgefirst {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.msedge.driver","./Server/msedgedriver.exe"); 
		WebDriver driver = new EdgeDriver(); 
		driver.manage().window().maximize(); 
		driver.get("https://rahulshettyacademy.com/"); 
		System.out.println(driver.getTitle()); 
		System.out.println(driver.getCurrentUrl());																																						
	}

}
