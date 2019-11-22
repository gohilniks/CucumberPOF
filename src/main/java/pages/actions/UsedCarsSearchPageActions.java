package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.UsedCarSearchPageLocators;
import utils.SeleniumDriver;

public class UsedCarsSearchPageActions {

	UsedCarSearchPageLocators usedCarSearchPageLocators = null;
	
	public UsedCarsSearchPageActions() {
		this.usedCarSearchPageLocators = new UsedCarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), usedCarSearchPageLocators);
	}
	
	public void selectCarModel(String carModel) {
		Select selectCarModel = new Select(usedCarSearchPageLocators.carModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}
}
