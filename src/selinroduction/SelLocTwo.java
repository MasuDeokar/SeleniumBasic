package selinroduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelLocTwo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//driver.findElement(By.id("inputUsername")).sendKeys("Mayuresh");
		//below is by using Css Selector.
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Mayuresh");
		//driver.findElement(By.name("inputPassword")).sendKeys("Hello123");
		//below is by using Css Selector.
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("Hello123");
		//driver.findElement(By.className("signInBtn")).click();
		//below is by using Css Selector.
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		//System.out.println(driver.findElement(By.className("error")).getText());
		// Above we print message in console * incorrect username or password.
		// here we use className selector to locate address.
		// Above is by using class.
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());

	}

}
