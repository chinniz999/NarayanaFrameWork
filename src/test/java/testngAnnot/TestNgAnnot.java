package testngAnnot;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNgAnnot {

	public static WebDriver driver;
	public static Logger log=Logger.getLogger(TestNgAnnot.class);

	@BeforeTest
	@Parameters("browser")
	public void init(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			log.debug("Paramaeter---> Chrome----> Openining Chrome Driver");
			driver = new ChromeDriver();
			

		} else if (browser.equalsIgnoreCase("firefox")) {
			log.debug("Paramaeter---> Firefox----> Openining Firefox Driver");
			driver = new FirefoxDriver();

		}
		
	}

}
