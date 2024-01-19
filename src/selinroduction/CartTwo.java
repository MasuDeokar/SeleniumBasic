package selinroduction;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CartTwo {

	public static void main(String[] args) {

		int j = 0; // this give iteration until 20 ()Given value because Mango on 17th place) after 20 code breaks.
		
		String[] veggies = { "Brocolli","Mango","Beetroot","Beans" };
		System.setProperty("webdriver.chrome.driver", "./Server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formatName = name[0].trim();
			List<String> VeggiList = Arrays.asList(veggies);
			if (VeggiList.contains(formatName)) {
				j++; // this is hard code not dynamic CartThree we discuss dynamic.
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if (j == 20) {
					break;
				}
			}
		}
	}

}
