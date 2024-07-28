package objectsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LoginPage_objects {
	
	


	WebDriver driver;
	
	//Constructor that will be automatically called as soon as the object of the class is created
	public LoginPage_objects(WebDriver driver) {
          this.driver = driver;
	}
	
	//Locator for username field
	By uname = By.name("uid");
	
	//Locator for password field
	By pswd = By.name("password");
	
	//Locator for login button
	By loginBtn = By.name("btnLogin");
	
	//Method to enter username
	public void enterUsername(String user) {
		driver.findElement(uname).sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(pswd).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		
		WebElement login_click = driver.findElement(loginBtn);
        new Actions(driver)
                .moveToElement(login_click)
                .click()
                .perform();
		//driver.findElement(loginBtn).click();
	}

}
