package BootCamp.PageObjectModelHomeDepot;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Base {
	public WebDriver driver;
 
	 @Parameters ({"browser", "url"})
	  @BeforeClass
	  public void browser(String browser, String url) throws InterruptedException {
			
			if(browser.equalsIgnoreCase("Chrome")) {
				String userdirectoriespath=System.getProperty("user.dir");
				System.out.println(userdirectoriespath);
			System.setProperty("webdriver.chrome.driver", userdirectoriespath+ "\\chrome\\chromedriver.exe");
		    driver =new ChromeDriver();
		    driver.navigate().to(url);
			Thread.sleep(6000);
			driver.manage().window().maximize(); // How to maximise the window.
			
			}else if(browser.equalsIgnoreCase("Firefox")) {
				String userdirectoriespath=System.getProperty("user.dir");
				System.out.println(userdirectoriespath);	
			System.setProperty("webdriver.gecko.driver", userdirectoriespath+ "\\chrome\\geckodriver.exe");
	      driver=new FirefoxDriver();
		    driver.navigate().to(url);
	   	Thread.sleep(6000);
		    driver.manage().window().maximize(); // How to maximise the window.
		    driver.navigate().back(); // How to go back.
		    driver.navigate().forward();  // How to go forward.
			}else{
				System.out.println("Wrong browser name");
			
			
			}
  
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
