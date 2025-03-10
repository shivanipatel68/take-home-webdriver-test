package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import testbase.TestBase;

public class FloatingMenuPage {

	WebDriver driver;

	public FloatingMenuPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Elements or locators
	@FindBy(xpath = "//div[@id='menu']")
	WebElement floatingMenu;

	public Boolean isFloatingMenuDisplayed() {
		return floatingMenu.isDisplayed();
	}

	// get url
	public FloatingMenuPage getUrl() {
		driver.navigate().to(TestBase.url + "/floating_menu");
		return this;
	}
}
