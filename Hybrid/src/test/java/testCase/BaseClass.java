package testCase;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import utils.ReadConfig;

public class BaseClass {
	
	

	ReadConfig readconfig = new ReadConfig();
	
	public String baseURL = readconfig.getApplicationURL();
	
	public String username = readconfig.getUsername();
	
	public String password = readconfig.getPassword();
	

	public static WebDriver driver;

	public static Logger log;

	@BeforeClass

	public void SetUp() {

		driver = new ChromeDriver();

	///	log = Logger.getLogger()

		// propertyconfigurator.configure("Log4j.properties");

	}

	@AfterClass

	public void tearDown() {

		driver.quit();

	}
}
