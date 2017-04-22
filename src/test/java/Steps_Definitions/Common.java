package Steps_Definitions;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import Helper.TestBase;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class Common extends TestBase {
	
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

}
