package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestSellers extends BaseClass {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[contains(@class,'nav-a')][contains(text(),'Best Seller')]")
	public WebElement BestSellerLink;
	
	
	public BestSellers(WebDriver driver)
	{

		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void openurl()
	{
		System.out.println(driver.getCurrentUrl());
	}
	
	public void openbestsellerpage()
	{
	BestSellerLink.click();
		
	}
	
	
}
