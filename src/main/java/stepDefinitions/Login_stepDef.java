package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_stepDef {
	WebDriver driver;

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Desktop\\Selenium\\chromedriver.exe" );
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("^The user check logo of the Login Page$")
	public void the_user_check_logo_of_the_Login_Page()  {
		WebElement Login_logo = driver.findElement(By.xpath("//a[@class = 'navbar-brand']//img[@class = 'img-responsive'][1]"));
		boolean loginLogo = Login_logo.isDisplayed();
		Assert.assertTrue(loginLogo);
	}

	//Without Paramaterization:
	@When("^The User enters UserName and Password$")
	public void the_User_enters_UserName_and_Password() {
		driver.findElement(By.xpath("//input[contains(@name ,'username')]")).sendKeys("batchautomation");
		driver.findElement(By.xpath("//input[contains(@name , 'password')]")).sendKeys("Test@12345");
		WebElement loginbtn =driver.findElement(By.xpath("//input[contains(@type , 'submit')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginbtn);

	}
	
	//With Paramaterization
	@And("^The User enters \"(.*)\" and \"(.*)\"$")
  public void the_User_enters_UserName_and_Password(String username , String password) {		
		driver.findElement(By.xpath("//input[contains(@name ,'username')]")).sendKeys(username);
		driver.findElement(By.xpath("//input[contains(@name , 'password')]")).sendKeys(password);
		WebElement loginbtn =driver.findElement(By.xpath("//input[contains(@type , 'submit')]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", loginbtn);
		
	}	

	@Then("^The user is on Home Page$")
	public void the_user_is_on_Home_Page() {
		String homepage_title = driver.getTitle();
		Assert.assertEquals("CRMPRO",homepage_title );
	}
	
	@Then("^Close the Browser$")
	public void close_the_Browser() {
		driver.quit();
	}

}
