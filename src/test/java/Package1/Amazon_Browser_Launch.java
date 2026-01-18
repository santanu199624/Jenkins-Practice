package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazon_Browser_Launch {
	
	@Test
	public void luanchBrowser() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		System.out.println("Browser luanch successful!");
		driver.quit();
	}

}
