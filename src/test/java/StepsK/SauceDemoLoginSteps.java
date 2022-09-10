package StepsK;

import org.openqa.selenium.WebDriver;

import Pages.BaseClass;
import Pages.SauceDemoPage;
import io.cucumber.java.en.*;

public class SauceDemoLoginSteps extends BaseClass {
	
	
	WebDriver driver=null;;
	SauceDemoPage sp=null;
	public SauceDemoLoginSteps()
	{
		super();
	}
	
	@Given("open saucedemo website")
	public void open_saucedemo_website() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Given------------------ steps");
	  
	    driver = OpenSauceDemoURL();
	    
	}
	@When("user enters login id")
	public void user_enters_login_id() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login----------------------- Id steps");
		sp = new SauceDemoPage(driver);
		sp.enterloginid();
		
	}
	@Then("user enters password")
	public void user_enters_password() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("PASSWORD  -------------------------STEPS");
	    sp.enterPassword();
	    
	}
	
	
	

}
