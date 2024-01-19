package selinroduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelLocFour {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Mayuresh");
		driver.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys("Hello123");
		driver.findElement(By.cssSelector("button.signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Shamanth");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		// Above is example of Xpath using index.we cant use Css selector using above syntax.
		// Above are two examples of locator by using we put email ID and clear. now below we reenter mail id.
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("shamanthdeokar@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9075559055");
		System.out.println(driver.findElement(By.xpath("//form/h2")).getText());
		//Above two lines are example of parent child Xpath.
	}

}
