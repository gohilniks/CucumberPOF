package pages.actions;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pages.locators.CarSearchPageLocators;
import utils.SeleniumDriver;

public class CarsSearchPageActions {
	CarSearchPageLocators carSearchPageLocators = null;

	public CarsSearchPageActions() {
		this.carSearchPageLocators = new CarSearchPageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carSearchPageLocators);
	}

	public void selectCarMake(String carBrand) {
		Select selectCarMaker = new Select(carSearchPageLocators.carMakeDropDown);
		selectCarMaker.selectByVisibleText(carBrand);
	}

	public void selectCarModel(String carModel) {
		Select selectCarModel = new Select(carSearchPageLocators.carModelDropDown);
		selectCarModel.selectByVisibleText(carModel);
	}

	public void selectCarLocation(String carLocation) {
		Select selectCarLocation = new Select(carSearchPageLocators.carLocationDropDown);
		selectCarLocation.selectByVisibleText(carLocation);
	}

	public void selectCarPrice(String carPrice) {
		Select selectCarPrice = new Select(carSearchPageLocators.carPriceDropDown);
		selectCarPrice.selectByVisibleText(carPrice);
	}

	public void clickFindMyNextCarBtn() {
		carSearchPageLocators.findMyNextCarBtn.click();
	}
}
