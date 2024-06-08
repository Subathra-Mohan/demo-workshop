package LoginFunctionalTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import demoworkshop.fileutility.ReadPropertiesdemo;
import demoworkshop.fileutility.multipledata;

public class loginTest {
	@DataProvider
	public Object[][]  dataSuppliers()
	{
		multipledata readexcel=new multipledata();
		Object [][] data=readexcel.exceldata("Sheet1");
		return data;
	}
	@Test(dataProvider="dataSuppliers")
	public void loginfunctionTest(String un,String pwd)
	{
		WebDriver driver=new ChromeDriver();
		ReadPropertiesdemo read = new ReadPropertiesdemo();
		driver.manage().window().maximize();
		String url = read.fetchproperty("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(180));
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		String email = read.fetchproperty("email");
		String password = read.fetchproperty("password");
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
	}
	
			

}
