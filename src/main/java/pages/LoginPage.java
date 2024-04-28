package pages;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "txtUserName")
	WebElement UserNameTextBox;
	
	@FindBy(id = "txtUserPass")
	WebElement PasswordTextBox;
	
	@FindBy(id = "btnLogin")
	WebElement LoginButton;
	
	@FindBy(id = "btnActivationCode")
	WebElement ForgetPasswordButton;
	
	public void Login(String UserName, String Password) {
		SetText(UserNameTextBox, UserName);
		SetText(PasswordTextBox, Password);
		ClickButton(LoginButton);
	}
	
	public void ForgetPassword() {
		ClickButton(ForgetPasswordButton);
	}


}
