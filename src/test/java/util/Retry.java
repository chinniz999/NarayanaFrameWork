package util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	int intial=0;
	int maxRetries=2;
	
	public boolean retry(ITestResult result) {
		while(intial<maxRetries){
			System.out.println("Running test"+result.getName()+" for"+intial+" times"+" with status "+getResultStatusName(result.getStatus()));
			intial++;
			return true;
		}
		
		return false;
	}
	
	 public String getResultStatusName(int status) {
	    	String resultName = null;
	    	if(status==1)
	    		resultName = "SUCCESS";
	    	if(status==2)
	    		resultName = "FAILURE";
	    	if(status==3)
	    		resultName = "SKIP";
			return resultName;
	    }

}
