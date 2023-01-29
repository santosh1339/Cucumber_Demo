package cucumbertest;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Login_Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
				System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
				//System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
				//WebDriver driver = new ChromeDriver();
				WebDriver driver = new EdgeDriver();
				//WebDriver driver = new FirefoxDriver();
				driver.get("http://adactinhotelapp.com");
				driver.manage().window().maximize();
				//driver.navigate().to("http://google.com");
				//driver.navigate().back();
				//driver.navigate().forward();
				//driver.navigate().refresh();
				//driver.quit();
				// Find the user name element 
				
				WebElement uName= driver.findElement(By.id("username"));
			    uName.sendKeys("santosh13");
			    driver.findElement(By.id("password")).sendKeys("Snoopy1234");
			    driver.findElement(By.id("login")).click();
				
				
				//Exit the browser  
			    driver.quit();


	}
	
	

}
