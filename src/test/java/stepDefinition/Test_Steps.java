package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.junit.*;
import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Test_Steps {
	
	WebDriver driver;
	String expectedGreeting = "Hello santosh13!";
	String expectedTitle = "Adactin.com - Search Hotel";
	
	@Given("when the user is on the login page")
	public void when_the_user_is_on_the_login_page() {
		System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
		driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	  // System.out.println(" I am in login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println(" user Details are keyed in ");
		WebElement uName= driver.findElement(By.id("username"));
	    uName.sendKeys("santosh13");
	    driver.findElement(By.id("password")).sendKeys("Snoopy1234");
	}
	
	@When("user enters \"(.*)\", \"(.*)\"$")
	public void user_enters_username_and_password(String username, String password) {
	    // Write code here that turns the phrase above into concrete actions
	    //System.out.println(" user Details are keyed in ");
		WebElement uName= driver.findElement(By.id("username"));
	    uName.sendKeys(username);
	    driver.findElement(By.id("password")).sendKeys(password);
	}

	@When("user clicks on the login button")
	public void user_clicks_on_the_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.id("login")).click();
	    
	    //System.out.println(" User clicks on login button ");
	}

	@Then("login is successful")
	public void login_is_successful() {
	    // Write code here that turns the phrase above into concrete actions
		String actualGreeting  = driver.findElement(By.xpath("//input[@id='username_show']")).getAttribute("value");
		assertEquals(expectedGreeting,actualGreeting);
	    //System.out.println(" User has logged in successfully ");
	}

	@Then("search page is displayed")
	public void search_page_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	  
	 String actualTitle = driver.getTitle();
	 assertEquals(expectedTitle, actualTitle);}
	  
	  //driver.getTitle()
		//System.out.println(" User is able to view the search option ");
	 
	 @Given("This is the blank test")
	 public void this_is_the_blank_test() {
	     // Write code here that turns the phrase above into concrete actions
	     System.out.println("check blank test ");
	 
	}


}
