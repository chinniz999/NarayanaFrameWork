package util;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import testngAnnot.ItestContestEx;

public class DataProviderItestContest {
	
	@DataProvider(name="data")
	public static Object[][] getDataFromDataprovider(ITestContext c){
	Object[][] groupArray = null;
		for (String group : c.getIncludedGroups()) {
		if(group.equalsIgnoreCase("login")){
			groupArray = new Object[][] { 
					{ "narayana@gmail.com", "******" }, 
					{ "narayana1@gmail.com", "*****1" }, 
					{ "narayana2@gmail.com", "*****2" } 
				};
		break;	
		}
			else if(group.equalsIgnoreCase("registerregister"))
			{
				groupArray = new Object[][] { 
					{ "narayana@gmail.com", "******" ,"@@@@1@@@"}, 
					{ "narayana1@gmail.com", "*****1","@@@@2@@@" }, 
					{ "narayana2@gmail.com", "*****2","@@@@3@@@" } 
				};
			}
		break;
	}
		
	return groupArray;		
	}

}
