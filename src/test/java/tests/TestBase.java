package tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import utilities.Helper;

public class TestBase {

	public static WebDriver driver;
	
	@BeforeSuite
	@Parameters(("Browser"))
	public void StartDriver(@Optional("firefox") String BrowserName) {
		if (BrowserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if (BrowserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://em.alqemam.com/ET_Test_v12.8.25/login.aspx");
	}
	
	@AfterMethod
	public void ScreenshotOnFailure(ITestResult result) {
		if (result.getStatus() == ITestResult.FAILURE) {
			System.out.println("Failed");
			System.out.println("Taking Screenshot.....");
			Helper.CaptureScreenShot(driver, result.getName());
		}
	}

	@AfterSuite
	public void StopDriver() {
		driver.quit();
	}
}
