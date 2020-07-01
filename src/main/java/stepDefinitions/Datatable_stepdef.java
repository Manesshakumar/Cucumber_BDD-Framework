package stepDefinitions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Datatable_stepdef {
	
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

	@Given("^The User enters UserName and Password$")
	public void the_User_enters_UserName_and_Password(DataTable credentials) {
		List<List<String>> data = credentials.raw();
		driver.findElement(By.xpath("//input[contains(@name ,'username')]")).sendKeys(data.get(0).get(0));
		driver.findElement(By.xpath("//input[contains(@name , 'password')]")).sendKeys(data.get(0).get(1));
		
	}

	@Then("^Click Login button$")
	public void click_Login_button() {
		WebElement loginbtn =driver.findElement(By.xpath("//input[contains(@type , 'submit')]"));
		loginbtn.click();
	}


}
