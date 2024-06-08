package LoginFunctionalTest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import demo.baseclass.baseclass;

public class demo extends baseclass{
	@Test
	public void demoRun()
	{

	Reporter.log(driver.getTitle(),true);
}
}
