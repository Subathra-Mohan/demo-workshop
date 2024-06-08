 package demo.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage {
	
	public WelcomePage(WebDriver driver)
	{
	super(driver);
}
	@FindAll({@FindBy(xpath = "//a[text()='Log in']"),@FindBy(linkText = "Log in")})
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	
	
	
	

}
