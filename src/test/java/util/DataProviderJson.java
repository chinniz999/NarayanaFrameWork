package util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

public class DataProviderJson {

	@DataProvider(name="jsondata")
	public void data() throws FileNotFoundException, IOException, ParseException {

		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(new FileReader("E:\\A.NEW-DATA\\SIRI\\SIRIINFO--PAYROLL\\WS\\FrameWorkFinal\\src\\test\\resources\\Data.json"));
       List<Object> l=(JSONArray) obj;
       //Map<Key,Object> map = new HashMap<Key,Object>();
      // for (Object i : l) map.put(i.getKey(),i);
	}
	

	
	  public static void main(String[] args) { 
		  
		  DataProviderJson sample=new DataProviderJson();
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
