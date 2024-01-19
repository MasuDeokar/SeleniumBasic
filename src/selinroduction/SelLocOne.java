package selinroduction;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import java.time.Duration;
public class SelLocOne {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Mayuresh");
		// here we locate by using id.
		driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
		// here we locate by using Name.
		driver.findElement(By.className("signInBtn")).click(); 
		// Above Sign In there is two classes "submit signInBtn"
		// one is "submit" and another is "signInBtn"
		// here "submit signInBtn" space between submit and signInBtn separate two classes.
		// here we are using signInBtn class which is more unique.
		  
	} 

}
