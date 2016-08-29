package testngAnnot;

import org.testng.SkipException;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import util.ReadExcel;

public class GetUrl {
	
	boolean bRunMode;
	@BeforeMethod
	public void checkRunMode(){
		ReadExcel excel=new ReadExcel();
		bRunMode=excel.checkRunMode("GetUrl");
		
	}
	

	@Test
	public void getUrl() {

		if(bRunMode==true){
		String url = TestNgAnnot.driver.getCurrentUrl();
		System.out.println(url);
		}else if(bRunMode==false){
			
			throw new SkipException("Skipped testcase as Runmode is No");
		}
			
	}
	
	
	

}
