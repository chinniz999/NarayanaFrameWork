package testngAnnot;

import org.apache.log4j.Logger;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.ReadExcel;

public class GetUrl {

	public static Logger log = Logger.getLogger(GetUrl.class);

	boolean bRunMode;

	@BeforeMethod
	public void checkRunMode() {
		ReadExcel excel = new ReadExcel();
		bRunMode = excel.checkRunMode("GetUrl");
		

	}

	@Test
	public void getUrl() {
		
		if (bRunMode == true) {
			TestNgAnnot.driver.get("https://www.google.co.in");
			String url = TestNgAnnot.driver.getCurrentUrl();
			log.debug("Logger" + url);
		} else if (bRunMode == false) {
			log.warn("TestCase Skipped As RunMode Set to NO");
			throw new SkipException("Skipped testcase as Runmode is No");
		}

	}

}
