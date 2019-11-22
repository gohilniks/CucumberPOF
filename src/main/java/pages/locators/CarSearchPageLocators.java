package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CarSearchPageLocators {
	@FindBy(how = How.ID, using = "makes")
	public WebElement carMakeDropDown;
	
	@FindBy(how = How.ID, using = "models")
	public WebElement carModelDropDown;
	
	@FindBy(how = How.ID, using = "locations")
	public WebElement carLocationDropDown;
	
	@FindBy(how = How.ID, using = "priceTo")
	public WebElement carPriceDropDown;
	
	@FindBy(how = How.ID, using = "search-submit")
	public WebElement findMyNextCarBtn;
}
