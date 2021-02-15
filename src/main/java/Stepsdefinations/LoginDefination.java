package Stepsdefinations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginDefination {
	public static WebDriver driver;
	
	@Given("^user is already on loginpage$")
	public void user_is_already_on_loginpage() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "D:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.etsy.com/ca/");
		
	    
	}

	
	@When("^title of login page is Etsay$")
	public void title_of_login_page_is_Etsay() throws Throwable {
		
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		String Actual_title = driver.getTitle();
		Assert.assertEquals("Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone", Actual_title);
	}
	
	@Then("^user enters username and password$")
	public void user_enters_username_and_password(DataTable sign_In_Data) throws Throwable {
		List<List<String>> data = sign_In_Data.raw();
		driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
	}


	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
	    driver.findElement(By.name("submit_attempt"));
	   
	}

	@Then("^user is on homepage$")
	public void user_is_on_homepage() throws Throwable {
	    System.out.println("helllo");
	 
	}


}
