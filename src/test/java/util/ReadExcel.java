package util;

public class ReadExcel {
	
	Xlfile_Reader xlreader =new Xlfile_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\Test.xlsx");
	
	/**
	 * "It Check the RunMode in Excel File before running any TestCase"
	 * @param testName Case Name--->"TestCase"
	 * @return true if RunMode="Yes" and False if RunMode="NO"
	 */
	public boolean checkRunMode(String sTestName){
		int iRowCount=xlreader.getRowCount("RunModes");
		int iColCount=xlreader.getColumnCount("RunModes");
		for(int row=1;row<iRowCount+1;row++){
			if(xlreader.getCellData("RunModes", "TestCase", row).equalsIgnoreCase(sTestName))
			if(xlreader.getCellData("RunModes", "RunMode", row).equalsIgnoreCase("Y"))
				return true;
		}
		return false;
	}
	
	
	

}
