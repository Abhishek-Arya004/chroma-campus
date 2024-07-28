package testCase;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import objectsclass.LoginPage_objects;

public class Login_Test extends BaseClass {

	@Test
	
	void login_page () {
		
	driver.get(baseURL);
	
	//logger.info("URL Opened");
	
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
