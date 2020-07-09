package pomJOB;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public static WebDriver driver = null;


	 @BeforeSuite
	 public void initialize() throws IOException{
	
	 //System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Lib\\geckodriver.exe");
	//driver = new FirefoxDriver();
	 
      System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Lib\\chromedriver(version83).exe");
	   driver = new ChromeDriver();
	 
	 //System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\Lib\\IEDriverServer.exe");
	//driver = new InternetExplorerDriver();
	 

	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 
	
	 driver.get("https://my.naukri.com");
	 
	 
	 }
	 
	/*@AfterSuite
	 public void TeardownTest(){
		TestBase.driver.quit();
	 }*/
	 
	 
}



