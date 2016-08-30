package testngAnnot;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;

public class Sample {

	@DataProvider(name="jsondata")
	public void data() throws FileNotFoundException, IOException, ParseException {

		JSONParser jsonParser = new JSONParser();
		Object obj = jsonParser.parse(new FileReader("C:\\Users\\Narayana\\Desktop\\Data.json"));
		JSONArray jsonArray = (JSONArray) obj;
		
			
		
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
