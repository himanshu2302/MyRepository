package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginStepDefinition {

	public WebDriver driver;
	
	@Given("^User is already on login page$")
	public void user_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "/Users/himanshu.dubey/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.freecrm.com");
		
	}
	
	@When("^title of login page is Free CRM$")
	public void login_page_title() {
		String title = driver.getTitle();
		System.out.println("Title of the page is : " + title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title );
	}
	
	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String un, String pwd) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		
	}
	
	@Then("^user clicks on login button$")
	public void user_click_on_login_btn() {
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}
	
	@Then("^user is on home page$")
	public void user_is_on_homepage() {
		String title = driver.getTitle();
		System.out.println("Homepage title is : " + title);
		Assert.assertEquals("CRMPRO", title );
	}
	
}
