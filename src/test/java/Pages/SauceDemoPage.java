package Pages;

import org.checkerframework.checker.interning.qual.FindDistinct;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.Assert;

public class SauceDemoPage {
	
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	public WebElement loginid;
	
	@FindBy(id="password")
	public WebElement Pass;
	
	@FindBy(id="login-button")
	public WebElement login;
	
	@FindBy(xpath="//span[text()='Products']")
	public WebElement Homepagever;
	
	
	public SauceDemoPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterloginid()
	{
		loginid.sendKeys("standard_user");
	}
	public void enterPassword()
	{
		Pass.sendKeys("secret_sauce");
		login.click();
	}
	
	public void verifyHomepage()
	{
			Assert.assertTrue(Homepagever.isDisplayed());
	}
	
}
