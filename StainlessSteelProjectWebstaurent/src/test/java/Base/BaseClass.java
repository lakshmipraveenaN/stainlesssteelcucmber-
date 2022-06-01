package Base;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static Properties prop;
	public static  WebDriver driver;

	public BaseClass()
	{
		try {
			prop=new Properties();
			FileInputStream fis =new FileInputStream("/Users/chelak/eclipse-workspace/StainlessSteelProjectWebstaurent/src/test/java/Base/config.properties");
			prop.load(fis);
			
		}
		catch(Exception e)
		{
			e.getMessage();
		}
		
	}
	@BeforeClass
	public static void browserinitialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
		}
	}
	@AfterClass
	public void closingbrowser()
	{
	driver.quit();
	}	

}
