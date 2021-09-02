package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PriorityTestNG {
	
	WebDriver driver;
	 @Test (priority=1)
		public void test() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			System.out.println("Welcome  to Google...");
			System.out.println("Priority 1");
			driver.get("http://www.google.com");
			
			
		}
	 	
	    @Test (priority=2)		
	    public void launchGoogle() {		
	    	System.out.println("Priority 2");
	    	
			driver.get("http://www.google.co.in");
			
	    }		

	 		
	    @Test (priority=3)		
	    public void peformSeachAndClick1stLink() {
	    	System.out.println("Priority 3");
	    	
	        WebElement element = driver.findElement(By.xpath(".//*[@title='Search']"));
	        element.sendKeys("facebook");
	        //Thread.sleep(4000);
	        element.submit();
	    }
	    @Test (priority=4)		
	    public void FacebookPageTitleVerification() throws Exception {	
	    	System.out.println("Priority 4");
	    	
	        
	        Assert.assertEquals(driver.getTitle().contains("facebook - Google Search"), true);
	        driver.close();
	    }	
	   
	    	
	}