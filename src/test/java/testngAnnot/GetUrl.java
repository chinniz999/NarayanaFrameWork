package testngAnnot;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.ReadExcel;

public class GetUrl {

	

	boolean bRunMode;

	@BeforeMethod
	public void checkRunMode() {
		ReadExcel excel = new ReadExcel();
		bRunMode = excel.checkRunMode("GetUrl");
		TestNgAnnot.log.debug("URL OPENED");
	}

	@Test
	public void getUrl() {
		
		if (bRunMode == true) {
			TestNgAnnot.driver.get("https://www.google.co.in");
			String url = TestNgAnnot.driver.getCurrentUrl();
			TestNgAnnot.driver.findElement(By.xpath("")).sendKeys("sdf");
			TestNgAnnot.log.debug("Logger" + url);
		} else if (bRunMode == false) {
			TestNgAnnot.log.warn(bRunMode);
			TestNgAnnot.log.warn("TestCase Skipped As RunMode Set to NO");
			throw new SkipException("Skipped testcase as Runmode is No");
		}

	}

}
