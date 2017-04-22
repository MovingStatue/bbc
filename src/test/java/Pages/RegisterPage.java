package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class RegisterPage {
	
	@FindBy(how=How.ID, using="email-input")
	public static WebElement myemail;



	@FindBy(how=How.ID, using="password-input")
	public static WebElement mypassword;


	@FindBy(how=How.ID, using="postcode-input")
	public static WebElement mypostcode;


	@FindBy(how=How.CSS, using="div.button_text")
	public static WebElement mypersonalised_email;


	@FindBy(how=How.ID, using="submit-button")
	public static WebElement reg_submit_button;
	
	//public void verify_over_18(){
		//Assert.assertEquals("18 or over", over_standard_age.getText());
	//}
public void type_email(String email){
	myemail.sendKeys(email);
}
public void type_password(String password){
	mypassword.sendKeys(password);
}
public void type_postcode(String postcode){
	myemail.sendKeys(postcode);
}

}

