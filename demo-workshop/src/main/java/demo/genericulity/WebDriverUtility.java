package demo.genericulity;

import org.openqa.selenium.WebDriver;

public class WebDriverUtility {
WebDriverUtility utility=new WebDriverUtility();
public String getTitle(WebDriver driver)
{
	return utility.getTitle(driver);
	}

public String getUrl(WebDriver driver)
{
	return utility.getUrl(driver);
	}
}
