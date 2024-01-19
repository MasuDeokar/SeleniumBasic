package selinroduction;

//below package is very important use with relative locator:=import static org.openqa.selenium.support.locators.RelativeLocator.with;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewRelativeLocator {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");

		WebElement rbd = driver.findElement(By.cssSelector("[for='exampleFormControlRadio1']"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rbd)).getText());

	}

}
