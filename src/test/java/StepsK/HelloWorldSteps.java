package StepsK;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.BaseClass;
import Pages.BestSellers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HelloWorldSteps extends BaseClass{
	
	
	public WebDriver driver=null;
	
	public HelloWorldSteps()
	{
		super();
	}
	
	//=null;
	
	String cardnum = "";
	@Given("you are ready to learn")
	public void you_are_ready_to_learn() {
	   
	    System.out.println("You are Ready");
	    driver = createbrowser();
	}
	
	@Given("^Print hello world$")
	public void print_hello_world() throws Throwable {
	    
	   System.out.println("Hello World ");
	  
	  BestSellers bs  = new BestSellers(driver);
	  bs.openurl();
	  bs.openbestsellerpage();
	   
	}
	

@When("you enter a sixteen digit number as {string}")
public void you_enter_a_sixteen_digit_number_as(String string) {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("-------"+string);
    cardnum = string.substring(0, 4);
    if (string.substring(0, 4).startsWith("1") || string.substring(0, 4).startsWith("2"))
    {
    	System.out.println("visa");
    }
    else
    {
    	System.out.println("master");
    }
}

	
	
	@Then("Verify it is visa or master")
	public void verify_it_is_visa_or_master() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	
	
	
	
	@Then("Print your name as {string}")
	public void print_your_name_as(String nameval) {
	    // Write code here that turns the phrase above into concrete actions
	    String newname="";
		String[] namearr =  nameval.split(" ");
		int c=0;
	    for (String s: namearr)
	    {
	    
	    	if(c==0) newname = s;
	    	
	    	else newname = s +","+ newname;	 
	   
	     c++;
	    }
	    
	    System.out.println("The person's name is "+newname);
	}


	@Given("Print hello india again")
	public void print_hello_india_again() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Hello India");
	}
	@Then("Print your wife's name")
	public void print_your_wife_s_name() {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println("Hello Esha Naskar Chakraborty");
	}

	
}
