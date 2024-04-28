package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageBase {
	protected WebDriver driver;
	public PageBase (WebDriver driver) {
		PageFactory.initElements(driver	, this);
	}

	public static void ClickButton(WebElement Element) {
		Element.click();
	}

	public static void SetText(WebElement Element, String Value) {
		Element.sendKeys(Value);
	}

}
