package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreateNewDeals {

	public WebDriver driver;
	
	@Given("^user is on login page$")
	public void user_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/himanshu.dubey/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.freecrm.com");

	}
	
	@When("^title of logn page is Free CRM$")
	public void login_page_title() {
		String title = driver.getTitle();
		System.out.println("Title of the page is : " + title);
		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title );
	}
	
	@Then("^user inputs username and password$")
	public void user_enters_un_pwd(DataTable credantials) {
		List<List<String>> raw = credantials.raw();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(raw.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(raw.get(0).get(1));
	}
	
	@Then("^user click on login button$")
	public void user_click_log_btn() {
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}
	
	@Then("^user on home page$")
	public void user_is_on_homepage() {
		String title = driver.getTitle();
		System.out.println("Homepage title is : " + title);
		Assert.assertEquals("CRMPRO", title );
	}
	
	@Then("^user moves to new deal page$")
	public void click_on_contacts_link() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		WebElement element1 = driver.findElement(By.xpath("//a[text()='Deals']"));
		Actions action = new Actions(driver);
		action.moveToElement(element1).perform();
		driver.findElement(By.xpath("//a[text()='New Deal']")).click();
	}
	
	@Then("^user creates new deal$")
	public void create_new_deal(DataTable credantials) {
		List<List<String>> dealData = credantials.raw();
		
		driver.findElement(By.xpath("//input[@id='title']")).sendKeys(dealData.get(0).get(0));
		driver.findElement(By.xpath("//input[@name='client_lookup']")).sendKeys(dealData.get(0).get(1));
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys(dealData.get(0).get(2));
		driver.findElement(By.xpath("//input[@id='probability']")).sendKeys(dealData.get(0).get(3));
		driver.findElement(By.xpath("//input[@id='commission']")).sendKeys(dealData.get(0).get(4));
		driver.findElement(By.xpath("//table//td[@align='center'][@valign='top'][@colspan='2']//input[@value='Save']")).click();
	
		}
	
	@Then("^close the broswer$")
	public void close_browser() {
		driver.close();
	}
	
}
