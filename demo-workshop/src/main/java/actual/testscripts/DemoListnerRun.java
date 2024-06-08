package actual.testscripts;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import demo.baseclass.baseclass;

public class DemoListnerRun extends baseclass {
//@listners(demoworkshop.listnersimplementation.ListnerClass.class)//we can give listners at suite level if the test scripts is more
	@Test(retryAnalyzer = demoworkshop.listnersimplementation.RetryListner.class)
	public void demo()
	{
		Assert.fail();
		Reporter.log(driver.getTitle(),true);
	}
}
