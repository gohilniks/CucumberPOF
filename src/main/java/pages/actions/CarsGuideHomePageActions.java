package pages.actions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pages.locators.CarsGuideHomePageLocators;
import utils.SeleniumDriver;

public class CarsGuideHomePageActions {
	CarsGuideHomePageLocators carsGuideHomePageLocators = null;

	public CarsGuideHomePageActions() {
		this.carsGuideHomePageLocators = new CarsGuideHomePageLocators();
		PageFactory.initElements(SeleniumDriver.getDriver(), carsGuideHomePageLocators);
	}

	public void moveToBuySellMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.buySell).perform();
	}

	public void clickOnSearchCarsMenu() {
		carsGuideHomePageLocators.searchCars.click();
	}

	public void clickOnUsedMenu() {
		carsGuideHomePageLocators.used.click();
	}

	public void moveToReviewsMenu() {
		Actions action = new Actions(SeleniumDriver.getDriver());
		action.moveToElement(carsGuideHomePageLocators.reviews).perform();
	}
}
