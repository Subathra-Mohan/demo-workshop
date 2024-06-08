package demo.baseclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import demo.genericulity.WebDriverUtility;
import demo.objectrepository.LoginPage;
import demo.objectrepository.WelcomePage;
import demoworkshop.fileutility.ReadPropertiesdemo;

public class baseclass {
	public WebDriver driver;
	ReadPropertiesdemo read = new ReadPropertiesdemo();

	@BeforeClass
	public void openBrowser() throws Throwable {
		//WebDriverUtility utility=new WebDriverUtility();
		//System.out.println(utility.getTitle(driver));
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//System.out.println(utility.getUrl(driver));
		String url = read.fetchproperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		Reporter.log("Opened Browser", true);
	}

	@BeforeMethod
	public void login() throws Throwable {
		//WebDriverUtility utility=new WebDriverUtility();
		//System.out.println(utility.getTitle(driver));
		WelcomePage page = new WelcomePage(driver);
		page.getLoginButton().click();
		//driver.findElement(By.xpath("//a[text()='Log in']")).click();
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getEmailTextField().sendKeys(email);
		String email = read.fetchproperty("email");
		String password = read.fetchproperty("password");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Reporter.log("Login", true);
	}

	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		Reporter.log("Logout", true);
	}

	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}

}
