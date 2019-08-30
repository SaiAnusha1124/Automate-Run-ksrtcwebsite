package automationjar.testscripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import automationjar.session.BaseClass;

public class GoogleSearch extends BaseClass
{
	@Test
	public void SearchKeyWord()
	{
		driver.findElement(By.name("q")).sendKeys("ksrtc.in");
	}
}
