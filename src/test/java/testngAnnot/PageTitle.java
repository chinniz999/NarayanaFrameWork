package testngAnnot;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.ReadExcel;

public class PageTitle {
	
	
	boolean bRunMode;
	@BeforeMethod
	public void checkRunMode(){
		ReadExcel excel=new ReadExcel();
		bRunMode=excel.checkRunMode("GetUrl");
		TestNgAnnot.log.debug("Opened url");
	}
	
	@Test
	public void getPageTitle(){
		
		
		if(bRunMode==true){
			TestNgAnnot.driver.get("https://www.google.co.in");
			String title=TestNgAnnot.driver.getTitle();
			TestNgAnnot.log.debug(title);
			}else if(bRunMode==false){
				TestNgAnnot.log.warn("TestCase Skipped As RunMode Set to NO");
				throw new SkipException("Skipped testcase as Runmode is No");
			}
				
		}
		
		
		
		
	}


