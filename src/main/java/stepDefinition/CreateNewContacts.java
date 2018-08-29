package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreateNewContacts {


	public WebDriver driver;
	
	@Given("^user on login page$")
	public void user_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "/Users/himanshu.dubey/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.freecrm.com");

	}
	
	@Then("^user enters un and pwd$")
	public void user_enters_un_pwd() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("naveenk");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("test@123");
	}
	
	@Then("^user click log btn$")
	public void user_click_log_btn() {
		driver.findElement(By.xpath("//input[@type='submit']")).submit();
	}


	@Then("^user click on contacts link$")
	public void click_on_contacts_link() throws InterruptedException {
		Thread.sleep(5000);
		driver.switchTo().frame("mainpanel");
		WebElement element = driver.findElement(By.xpath("//a[text()='Contacts']"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	@Then("^user click on new contacts link$")
	public void click_on_new_contacts_link() {
		driver.findElement(By.xpath("//a[text()='New Contact']")).click();
		String text = driver.findElement(By.xpath("//legend[text()='Contact Information']")).getText();
		System.out.println(text);
		Assert.assertEquals("Contact Information", text);
	}

}
