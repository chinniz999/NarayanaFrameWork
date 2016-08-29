package testngAnnot;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.ReadExcel;

public class PageTitle extends TestNgAnnot{
	
	
	boolean bRunMode;
	@BeforeMethod
	public void checkRunMode(){
		ReadExcel excel=new ReadExcel();
		bRunMode=excel.checkRunMode("GetUrl");
		
	}
	
	@Test
	public void getPageTitle(){
		
		
		if(bRunMode==true){
			String title=TestNgAnnot.driver.getTitle();
			System.out.println(title);
			}else if(bRunMode==false){
				
				throw new SkipException("Skipped testcase as Runmode is No");
			}
				
		}
		
		
		
		
	}


