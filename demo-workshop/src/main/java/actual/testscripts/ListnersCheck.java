package actual.testscripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import demo.baseclass.baseclass;
import demoworkshop.fileutility.ReadPropertiesdemo;
@Listeners(demoworkshop.fileutility.ListnersRun.class)
public class ListnersCheck extends baseclass {
	ReadPropertiesdemo demo = new ReadPropertiesdemo();

	@Test
	public void search() {
		WebElement scrl = driver.findElement(By.xpath("//h3[text()='Information']"));
		Actions act = new Actions(driver);
		act.scrollToElement(scrl).perform();
		driver.findElement(By.xpath("//a[text()='Addresses']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(150));
		driver.findElement(By.xpath("//input[@value='Add new']")).click();
		String firstName = demo.fetchproperty("firstname");
		driver.findElement(By.id("Address_FirstName")).sendKeys(firstName);
		String lastName = demo.fetchproperty("lastname");
		driver.findElement(By.id("Address_LastName")).sendKeys(lastName);
		String email = demo.fetchproperty("email");
		driver.findElement(By.id("Address_Email")).sendKeys(email);
		String city = demo.fetchproperty("city");
		driver.findElement(By.id("Address_City")).sendKeys(city);
		String address1 = demo.fetchproperty("address1");
		driver.findElement(By.id("Address_Address1")).sendKeys(address1);
		String zip = demo.fetchproperty("zip");
		driver.findElement(By.id("Address_ZipPostalCode")).sendKeys(zip);
		String phoneNumber = demo.fetchproperty("phno");
		Assert.fail(); 
		driver.findElement(By.id("Address_PhoneNumber")).sendKeys(phoneNumber);
	}
}
