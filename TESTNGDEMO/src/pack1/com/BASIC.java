package pack1.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class BASIC {
	
	
	WebDriver driver = new ChromeDriver();
	
	
	@Test
	public void test1() {
		
		
		

		// WebDriver driver = new ChromeDriver();

		driver.get("https://www.selenium.dev/selenium/web/web-form.html");
		
		
		//System.out.println("This is first TestNG1  code");
		
		
		
	}
	
	@Test
	public void test2() {
		
		
		//System.out.println("This is first TestNG2 code");
		
		WebElement textBox = driver.findElement(By.name("my-text"));

		WebElement submitButton = driver.findElement(By.cssSelector("button"));
		
		textBox.sendKeys("Selenium");
		submitButton.click();
		
	}
	
	
	@Test
	public void test3() {
		
		
		System.out.println("This is first TestNG3 code");
		
	}
	
	@Test
	
public void test4() {
		
		
		System.out.println("This is first TestNG3 code-4");
		
	}
	
public void test5() {
		
		
		System.out.println("This is first TestNG3 code-5");
		
	}

}
