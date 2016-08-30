package testngAnnot;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

public class Sample {

	@DataProvider(name="jsondata")
	public void data() throws FileNotFoundException, IOException, ParseException {

		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(new FileReader("E:\\A.NEW-DATA\\SIRI\\SIRIINFO--PAYROLL\\WS\\FrameWorkFinal\\src\\test\\resources\\Data.json"));
		JSONObject jsonObject=(JSONObject) obj;
		System.out.println(jsonObject.get("firstname1"));
			
		
	}
	

	
	  public static void main(String[] args) { 
		  
		  Sample sample=new Sample();
		  try {
			sample.data();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	  }
	 

}
