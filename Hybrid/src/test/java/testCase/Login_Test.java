package testCase;

import static org.testng.Assert.assertTrue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import objectsclass.LoginPage_objects;

public class Login_Test extends BaseClass {
	
	
	public static Logger log = LogManager.getLogger(Login_Test.class.getName());
	
	

	@Test
	
	void login_page () {
		
	driver.get(baseURL);
	
	log.info("URL Opened");
	
	LoginPage_objects lpo = new LoginPage_objects(driver);
	
	lpo.enterUsername(username);
	
	lpo.enterPassword(password);
	
	lpo.clickLogin();
	

	if(driver.getTitle().equals("GTPL Bank Manager HomePage"))

	{
		
		Assert.assertTrue(true);
		
	}
	
	else {
		
		Assert.assertTrue(false);
	}
	
	
		
	}


}
