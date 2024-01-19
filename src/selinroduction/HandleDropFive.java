package selinroduction;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleDropFive {
	
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		
		try {
		
		System.setProperty("webdriver.chrome.driver","./Server/chromedriver.exe"); 
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("Aus");
		Thread.sleep(5000);
		List<WebElement> options =driver.findElements(By.xpath("//li[@class='ui-menu-item'] a"));
		
		for(WebElement option : options)
		{
			System.out.println(option.getText());
			if(option.getText().equalsIgnoreCase("Australia"))
			{
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
				wait.until(ExpectedConditions.elementToBeClickable(option)).click();
				break;			
			}
		}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally 
		{
			if(driver!=null)
			driver.quit();
}

}
	}

