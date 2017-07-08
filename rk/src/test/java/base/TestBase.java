package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TestBase {
	
	
	public static WebDriver driver;
	
	
	
	public void Click(String locator)
	{
		driver.findElement(By.xpath("locator")).click();
	}
}
