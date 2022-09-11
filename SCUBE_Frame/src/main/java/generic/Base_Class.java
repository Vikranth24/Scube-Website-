package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;

/**
 * 
 * Vikranth
 *
 */

public class Base_Class implements FrameworkConstants {

	public static WebDriver driver;

	@org.testng.annotations.Parameters("browser")
	@BeforeClass(alwaysRun= true)
	public void Open_Browser(@Optional("chrome") String Browser)
	{
		
		if (Browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty(CHROME_KEY,CHROME_PATH);
			driver=new ChromeDriver();
			
		}
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty(FIREFOX_KEY,FIREFOX_PATH);
			driver=new FirefoxDriver();
		}
		/*else if(Browser.equals("opera"))
		{
			
			System.setProperty(Opera_Key,Opera_Path);
			driver=new OperaDriver();
		}
	
		else if(Browser.equals("edge"))
		{
			
			System.setProperty(edge_Key,edge_Path);
			driver=new EdgeDriver();
		}
		else if(Browser.equals("safari"))
		{
			
			System.setProperty(Safari_Key,Safari_Path);
			driver=new EdgeDriver();
		}*/
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.MINUTES);
		driver.get(URL);
		driver.manage().window().maximize();
	}
	@BeforeMethod(alwaysRun = true)
	public void login() {
	}

	@AfterMethod(alwaysRun = true)
	public void logout() {
	}

	@AfterClass(alwaysRun = true)

	public void CloseApp() throws IOException {

		// Generic_Screenshots Screen =new Generic_Screenshots();
		// Screen.screenShotMethod(driver);

		driver.quit();
	}

}
