package Steps_Definitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Helper.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Register extends TestBase{

	@Before
	
	public void setup() throws IOException{
		initialize();
	}

@Given("^I am on the BBC HomePage$")
public void i_am_on_the_BBC_HomePage() throws Throwable {
  driver.get(CONFIG.getProperty("testSiteName"));
  driver.manage().window().maximize();
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Given("^I click sign in$")
public void i_click_sign_in() throws Throwable {
    
}

@When("^I click Register now$")
public void i_click_Register_now() throws Throwable {
    
}

@When("^I verify that am above the standard age$")
public void i_verify_that_am_above_the_standard_age() throws Throwable {

}

@When("^I choose the option that i am over the standard age$")
public void i_choose_the_option_that_i_am_over_the_standard_age() throws Throwable {
    
}

@When("^I type my email \"([^\"]*)\" address$")
public void i_type_my_email_address(String arg1) throws Throwable {
    
}

@Then("^I type password \"([^\"]*)\" in the password field$")
public void i_type_password_in_the_password_field(String arg1) throws Throwable {
    
}

@Then("^I type postcode \"([^\"]*)\" in the postcode field$")
public void i_type_postcode_in_the_postcode_field(String arg1) throws Throwable {
    
}

@Then("^I select No email personification$")
public void i_select_No_email_personification() throws Throwable {
    
}

@When("^I click Register button$")
public void i_click_Register_button() throws Throwable {

}

@When("^I verify that i am registered successfully$")
public void i_verify_that_i_am_registered_successfully() throws Throwable {
    
}

@Then("^I close the browser$")
public void i_close_the_browser() throws Throwable {
   
}



}
