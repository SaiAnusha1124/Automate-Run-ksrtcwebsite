package automationjar.session;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass 
{
	public WebDriver driver;

	@Test
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\saianusha.podichervu\\eclipse-workspace\\Run-pomfile\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
