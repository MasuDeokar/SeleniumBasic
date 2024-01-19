package selinroduction;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowTwo {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","./server/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		driver.get("http://google.com/"); // here site will open until last part will displayed.
		
		// we can use directly Chrome or any browser without giving driver location.
		// so we commented first line and but this is in beta state not stable.
		

	}

}
