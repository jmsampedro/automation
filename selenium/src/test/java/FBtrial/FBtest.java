package FBtrial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FBtest {
	public WebDriver driver;
	public String WebURL = "https://www.facebook.com/";

	@Test (priority = 0)
	public void openFB()
	{
		//chromedriver
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\JM\\Documents\\chromedriver\\chromedriver.exe");
	    			
	    driver = new ChromeDriver();
	    driver.get(WebURL);
	    driver.manage().window().maximize();
	}
	    
	@Test (priority = 1)
	public void login() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@id='email'])[1]")).sendKeys("sampedro.johnmichael@yahoo.com");
	    driver.findElement(By.xpath("(//input[@id='pass'])[1]")).sendKeys("Jm_416528720");
	    driver.findElement(By.name("login")).click();
	    Thread.sleep(7000);
	}
}