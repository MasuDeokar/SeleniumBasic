package selinroduction;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTwo {

	public static void main(String[] args) {

		String[] veggies = { "Almonds", "Cucumber", "Cashews", "Nuts Mixture" };
		System.setProperty("webdriver.chrome.driver", "./Server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		// getItem(driver,veggies); here we have to make below getItem method into
		// static.
		// another method to call array is creating object line 29 below.
		WaitOne m = new WaitOne();
		m.getItem(driver, veggies);

		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoBtn")));
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();

	}

	public void getItem(WebDriver driver, String[] veggies) {
		int j = 0;
		List<WebElement> options = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < options.size(); i++) {
			String[] name = options.get(i).getText().split("-");
			String formatName = name[0].trim();

			List<String> veggieList = Arrays.asList(veggies);

			if (veggieList.contains(formatName)) {
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == veggies.length) {
					break;
				}
			}
		}

	}

}
