package utilities;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {

	public static void CaptureScreenShot(WebDriver driver, String ScreenshotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./screenshots/"+ ScreenshotName +".png"));
		} catch (Exception e) {
			System.out.println("Failed While Taking Screenshot." + e.getMessage());
		}

	}
	
	public static boolean ContainsValuesIgnoringCapitalLetters(String FullValue,String PartValue) {
		return FullValue.toLowerCase().contains(PartValue.toLowerCase());	
	}


}
