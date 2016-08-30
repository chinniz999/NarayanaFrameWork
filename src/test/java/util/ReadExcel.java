package util;

public class ReadExcel {
	
	Xlfile_Reader xlreader =new Xlfile_Reader("E:\\WorkSpace-Final\\src\\test\\resources\\Test.xlsx");
	
	
	public boolean checkRunMode(String testName){
		int iRowCount=xlreader.getRowCount("RunModes");
		int iColCount=xlreader.getColumnCount("RunModes");
		for(int row=1;row<iRowCount+1;row++){
			if(xlreader.getCellData("RunModes", "TestCase", row).equalsIgnoreCase(testName))
			if(xlreader.getCellData("RunModes", "RunMode", row).equalsIgnoreCase("Y"))
				return true;
		}
		return false;
	}
	
	
	

}
