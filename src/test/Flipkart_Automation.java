package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flipkart_Automation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-search-dropdown-card")).click();
		/*try {
		Thread.sleep(10000);
		}
		catch (Exception e) {
			
		}*/
		new Select(driver.findElement(By.id("searchDropdownBox"))).selectByValue("search-alias=todays-deals");
				
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)"); //x-axis and y-axis values for the location
		
		//Find all elements
		List<WebElement> results = 
	   driver.findElements(By.xpath("//span[text()='boAt Wave Call Smart Watch, Smart Talk with Advanced Dedicated Bluetooth Calling Chip, 1.69” HD Display with 550 NITS & 70% Color Gamut, 150+ Watch Faces, Multi-Sport Modes,HR,SpO2, IP68(Active Black)']"));
	   //driver.findElements(By.cssSelector(".a-size-medium a-color-base a-text-normal"));
	   // driver.findElements(By.className("a-size-medium a-color-base a-text-normal"));

		
		//Get title of all the product on the results page
		System.out.println(results.size());
		
		for (int i = 0; i<results.size();i++)
		{
			System.out.println(results.get(i).getText());
		}
		
		
		//driver.quit();
		/*
		 * //Drop down - 3 methods to select the elements - LOCATION
        //new Select(driver.findElement(By.className("search_combobox"))).selectByValue("Sydney");
        //new Select(driver.findElement(By.className("search_combobox"))).selectByIndex(3);
        new Select(driver.findElement(By.className("search_combobox"))).selectByVisibleText("Melbourne");
		 */
		
			
		
		
		
		
		

	}

}
