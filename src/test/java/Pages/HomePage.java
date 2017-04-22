package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage {
	WebDriver driver;
	
	@FindBy(how=How.LINK_TEXT, using="Sign in")
	public static WebElement sign_in;
	
	@FindBy(how=How.ID, using="orb-serach-q")
	public static WebElement search;
	
	public void mysign_in(){
		sign_in.click();
	}
 
	public void mysearch(){
		search.sendKeys("Premier League");
	}
}
