package actual.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import demoworkshop.fileutility.ReadPropertiesdemo;

public class assertioncheck {
	@Test
	public void productsearch() {
		WebDriver driver = new ChromeDriver();
		ReadPropertiesdemo read = new ReadPropertiesdemo();
		driver.manage().window().maximize();
		String url = read.fetchproperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		Reporter.log("Opened Browser", true);
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		String email = read.fetchproperty("email");
		String password = read.fetchproperty("password");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		Assert.assertEquals(driver.getTitle().contains("Log in"), true);
		Reporter.log("Login page is displayed", true);

	}

}
