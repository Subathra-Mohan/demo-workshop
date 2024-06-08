package demoworkshop.fileutility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;

import demo.baseclass.baseclass;

public class ListnersRun extends baseclass implements ITestListener,ISuiteListener{
	@Override
	public void onStart(ISuite suite)
	{
		Reporter.log(suite.getName()+" has started execution",true);
	}
	@Override
	public void onTestStart(ITestResult result)
	{
		Reporter.log(result.getName()+" test script execution started",true);
	}
	@Override
	public void onTestSuccess(ITestResult result)
	{
		Reporter.log(result.getName()+" test script sucessfully executed",true);
	}
	@Override
	public void onTestSkipped(ITestResult result)
	{
		Reporter.log(result.getName()+" test script skipped",true);
	}
	@Override
	public void onFinish(ISuite suite)
	{
		Reporter.log(suite.getName()+" has execution completed",true);
	}
	@Override
	public void onTestFailure(ITestResult result)
	{
		Reporter.log(result.getName()+" test failed and captured the screenshot",true);
	
	//Typecasting
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	
	//path
	File path=new File("./FailedScreenshots/"+ result.getName()+".png");
	
	
	//take screenshots
	File img=ts.getScreenshotAs(OutputType.FILE);
	
		try {
			FileHandler.copy(img, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //copy
	
	

}
}
