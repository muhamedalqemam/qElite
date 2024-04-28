package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MakeenMainPage extends PageBase{

	public MakeenMainPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id = "btn_session_time_out")
	public WebElement LogoutButton;
	
	@FindBy(id = "div_home_title")
	public WebElement MainPageLink;
	

}
