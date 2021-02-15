package Stepsdefinations;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpstepDeefinition {
	WebDriver driver;
	
	@Given("^user is aleady on homepage$")
	public void user_is_aleady_on_homepage() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.etsy.com/ca");
	
	}

	@When("^user click on sign in button and register button$")
	public void user_click_on_sign_in_button_and_register_button() throws Throwable {
	    driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
	    driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
	    
	    //driver.switchTo().frame(0);
	    Thread.sleep(3000);
	    
	}

	@Then("^user enter the valid details of sign up$")
	public void user_enter_the_valid_details_of_sign_up(DataTable credential) {
		
		for(Map<String, String> data:credential.asMaps(String.class, String.class)) {
			
			driver.findElement(By.name("email")).sendKeys(data.get("email"));
			driver.findElement(By.name("first_name")).sendKeys(data.get("firstname"));
			driver.findElement(By.name("password")).sendKeys(data.get("password"));
		 
			
		}
		
		   
	}

	@Then("^browser close$")
	public void browser_close() throws Throwable {
		
	  
	}

}
