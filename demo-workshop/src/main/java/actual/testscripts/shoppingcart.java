package actual.testscripts;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import demo.baseclass.baseclass;

public class shoppingcart extends baseclass{
	@Test
	public void productsearch()
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("Jewelry");
		driver.findElement(By.xpath("(//input[@value='Search'])[1]")).click();
		driver.findElement(By.xpath("//a[text()='Create Your Own Jewelry']")).click();
		driver.findElement(By.id("product_attribute_71_10_16")).click();		
		driver.findElement(By.id("add-to-cart-button-71")).sendKeys("23");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Reporter.log("PRODUCT ADDED TO SHOWCART", true);
		
	}

}
