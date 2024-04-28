package tests;

import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.MakeenMainPage;

public class LoginTest extends TestBase {
	
	LoginPage Login;
	MakeenMainPage Home;
	
	@Test
	public void UserCanLogin() {
		Login = new LoginPage(driver);
		Home = new MakeenMainPage(driver);
		Login.Login("9990001", "24602460");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		assertTrue(Home.LogoutButton.isDisplayed());
	}

}
