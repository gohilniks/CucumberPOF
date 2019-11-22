package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UsedCarSearchPageLocators {
	@FindBy(how = How.ID, using = "models")
	public WebElement carModelDropDown;
}
