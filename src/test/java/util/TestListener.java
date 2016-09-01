package util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import testngAnnot.ItestContestEx;

public class TestListener extends TestListenerAdapter{
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		super.onTestSuccess(tr);
		System.out.println("Test Case-->"+tr.getName()+" Passed");
	}
	
	
	@Override
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		File scrFile = ((TakesScreenshot)ItestContestEx.driver).getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy somewhere
		try {
			FileUtils.copyFile(scrFile, new File(System.getProperty("user.dir")+"\\ScreenShots\\"+tr.getName()+".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	@Override
	public void onTestSkipped(ITestResult tr) {
		super.onTestSkipped(tr);
		System.out.println("Test Case-->"+tr.getName()+" Skipped");
	}

	

}
