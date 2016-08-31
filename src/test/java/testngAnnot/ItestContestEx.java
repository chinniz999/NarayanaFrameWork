package testngAnnot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.DataProviderItestContest;

public class ItestContestEx extends TestNgAnnot{
	
	
	
	
	@Test(dataProviderClass=DataProviderItestContest.class,dataProvider="data",groups="login")
	public void login(String sUserName, String sPswd){
		
		
		
		driver.get("https://login.naukri.com/nLogin/Login.php");
		
		driver.findElement(By.id("emailTxt")).sendKeys(sUserName);
		driver.findElement(By.id("emailTxt")).clear();
		
		driver.findElement(By.id("emailTxt")).sendKeys(sPswd);
		driver.findElement(By.id("pwd1")).clear();
		
	}
	
	@Test(dataProviderClass=DataProviderItestContest.class,dataProvider="data",groups="register")
	public void register(String emailid, String reEneterEid, String Pswd){
		
		driver.findElement(By.id("pWdgTab_register")).click();
		
		driver.findElement(By.id("email")).sendKeys(emailid);
		driver.findElement(By.id("email")).click();
		
		driver.findElement(By.id("remail")).sendKeys(reEneterEid);
		driver.findElement(By.id("remail")).click();
		
		driver.findElement(By.id("pwd")).sendKeys(Pswd);
		driver.findElement(By.id("pwd")).click();
	}

}
