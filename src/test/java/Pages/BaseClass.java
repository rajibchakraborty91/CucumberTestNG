package Pages;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	int count =0 ;
	public  WebDriver driver=null;
	
	public BaseClass() {
		// TODO Auto-generated constructor stub
		System.out.println("base class constructor");
	}
	
	
	public WebDriver createbrowser()
	
	{
		WebDriverManager.chromedriver().setup();
		
		driver =  new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		count ++;
		
		driver.get("https://www.amazon.in/");
		
	//	System.out.println(count);
		
		return driver;
	}
	
	public WebDriver getDriver()
	{
		return driver;
	}

public WebDriver OpenSauceDemoURL()
	
	{
		WebDriverManager.edgedriver().setup();
		
		driver =  new EdgeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.saucedemo.com/");
		
		//driver.get("https://www.amazon.in/");
		
	//	System.out.println(count);
		
		return driver;
	}
	
	
}
