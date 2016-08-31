package util;

import org.testng.annotations.DataProvider;

public class DataProviderExcel {
	
	
	@DataProvider
	public static Object[][] data(String sTestName){
		
		Xlfile_Reader xlreader =new Xlfile_Reader(System.getProperty("user.dir")+"\\src\\test\\resources\\Test.xlsx");
		int iRowcount=xlreader.getRowCount(sTestName);
		int iColCount=xlreader.getColumnCount(sTestName);
		
			Object[][] arr=new Object[iRowcount-1][iColCount];
			for(int row=2;row<iRowcount+1;row++){
				for(int col=0;col<iColCount;col++)
					arr[row-2][col]=xlreader.getCellData(sTestName, col, row);
			}
	return arr;
		}
		
	
	
	/*public static void main(String[] args) {
		DataProviderExcel dataProviderExcel=new DataProviderExcel();
		Object[][] s=dataProviderExcel.data("LoginTest");
		for(Object[] w:s)
			for(Object d:w)
				System.out.println(d);
	}*/

}
