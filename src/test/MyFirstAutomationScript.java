package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyFirstAutomationScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		//System.setProperty("webdriver.edge.driver", "C:\\Drivers\\msedgedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new EdgeDriver();
		//WebDriver driver = new FirefoxDriver();
		/*
		driver.get("http://adactinhotelapp.com");
		driver.navigate().to("https://Google.com");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.quit();
		*/
		//Open Browser
		driver.get("http://adactinhotelapp.com");
		driver.manage().window().maximize();
		WebElement uName= driver.findElement(By.id("username"));
		uName.sendKeys("Jayakishore");
		driver.findElement(By.id("password")).sendKeys("Test@12345");
		//driver.findElement(By.id("login")).click();
		//click and register link
		//driver.findElement(By.cssSelector(".login_register")).click();
		//driver.findElement(By.cssSelector("input#login")).click();
		//driver.findElement(By.cssSelector("input.login_button")).click();
		//driver.findElement(By.cssSelector("input[name=login]")).click();
		//driver.findElement(By.cssSelector("input.login_button[type=Submit]")).click();
		//driver.findElement(By.cssSelector("input.login_button[value=Login]")).click();
		//Click on forget password 
		//driver.findElement(By.cssSelector("a:contains('ForgotPassword')")).click();
		//driver.findElement(By.linkText("New User Register Here")).click();
		// USing CSS selectors for Links
		driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(7) > td > a")).click();
		
		
		
		
		
		
		

	}

}
