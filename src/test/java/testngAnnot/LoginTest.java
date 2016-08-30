package testngAnnot;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import util.ReadExcel;
import util.Xpaths;

public class LoginTest extends TestNgAnnot{
	boolean bRunMode;
	@BeforeMethod
	public void CheckRunMode(){
		
		ReadExcel excel = new ReadExcel();
		bRunMode = excel.checkRunMode("LoginTest");
	}
	
	
	
	@Test(dataProvider="jsondata")
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
	
	
	
	
	@DataProvider(name="jsondata")
	public void data() throws FileNotFoundException, IOException, ParseException {

		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(new FileReader("E:\\A.NEW-DATA\\SIRI\\SIRIINFO--PAYROLL\\WS\\FrameWorkFinal\\src\\test\\resources\\Data.json"));
		JSONArray jsonArray = (JSONArray) obj;
		Object[][] arr = null;
		arr[0][1]=jsonArray.get(0);
		System.out.println(arr[0][1]);
	}
}
