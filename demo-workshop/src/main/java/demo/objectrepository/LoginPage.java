package demo.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public  LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

@FindAll({@FindBy(id = "Email"),@FindBy(xpath = "//input[@autofocus='autofocus']")})
private WebElement emailTextField;

public WebElement getEmailTextField() {
	return emailTextField;
}
@FindAll({@FindBy(id = "Password"),@FindBy(xpath = "//input[@type='password']")})
private WebElement passwordTextField;

public WebElement getPasswordTextField() {
	return passwordTextField;
}


}
