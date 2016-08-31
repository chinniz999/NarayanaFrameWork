package testngAnnot;

import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.DataProviderExcel;
import util.ReadExcel;
import util.Xpaths;

public class LoginTest extends TestNgAnnot{
	boolean bRunMode;
	@BeforeMethod
	public void CheckRunMode(){
		
		ReadExcel excel = new ReadExcel();
		bRunMode = excel.checkRunMode("LoginTest");
	}
	
	
	
	@Test(dataProvider="data")
	public void loginintoApp(String sFirstName, String sLastName, String sEmail, String sCreatePswd, String sConfirmPswd) {
		
		if (bRunMode == true) {
		driver.get(Xpaths.sUrl);
		log.debug("URL Loaded");
		
		driver.findElement(By.id(Xpaths.sNameFirst_id)).sendKeys(sFirstName);
		log.debug("Entered FirstName");
		
		driver.findElement(By.id(Xpaths.sNameLast_id)).sendKeys(sLastName);
		log.debug("Entered LastName");
		
		driver.findElement(By.id(Xpaths.sChooseUserName_id)).sendKeys(sEmail);
		log.debug("Entered Email");
		
		driver.findElement(By.id(Xpaths.sCreateapassword_id)).sendKeys(sCreatePswd);
		log.debug("Entered Create Password");
		
		driver.findElement(By.id(Xpaths.sConfirmYourPassword_id)).sendKeys(sConfirmPswd);
		log.debug("Entered Create Password");
		
		driver.navigate().refresh();
		log.debug("Browser Rerreshed");
		}else if (bRunMode == false) {
			log.warn("TestCase Skipped As RunMode Set to NO");
			throw new SkipException("Skipped testcase as Runmode is No");
		}
		
		
		
	}
	
	
	
	
	@DataProvider
	public Object[][] data() {
		
		return DataProviderExcel.data("LoginTest");

	}
}
