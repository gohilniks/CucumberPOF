package steps;

import java.util.List;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.actions.CarsGuideHomePageActions;
import pages.actions.CarsSearchPageActions;
import utils.SeleniumDriver;

public class SearchCarsSteps {
	CarsGuideHomePageActions carsGuideHomePageActions = new CarsGuideHomePageActions();
	CarsSearchPageActions carsSearchPageActions = new CarsSearchPageActions();

	@Given("I am on the Home Page {string} of CarsGuide website")
	public void i_am_on_the_Home_Page_of_CarsGuide_website(String websiteURL) {
		SeleniumDriver.openPage(websiteURL);
	}

	@When("I move to the menu")
	public void i_move_to_the_menu(List<String> list) {
		String menu = list.get(1);
		System.out.println("Selected menu is : " + menu);
		carsGuideHomePageActions.moveToBuySellMenu();
	}

	@And("click on {string} link")
	public void click_on_link(String searchCars) {
		carsGuideHomePageActions.clickOnSearchCarsMenu();
	}

	@And("select carbrand as {string} from AnyMake dropdown")
	public void select_carbrand_as_from_AnyMake_dropdown(String carBrand) {
		carsSearchPageActions.selectCarMake(carBrand);
	}

	@And("select carmodel as {string} from SelectModel dropdown")
	public void select_carmodel_as_from_SelectModel_dropdown(String carModel) {
		carsSearchPageActions.selectCarModel(carModel);
	}

	@And("select location as {string} from SelectLocation dropdown")
	public void select_location_as_from_SelectLocation_dropdown(String carLocation) {
		carsSearchPageActions.selectCarLocation(carLocation);
	}

	@And("select price as {string} from Price dropdown")
	public void select_price_as_from_Price_dropdown(String carPrice) {
		carsSearchPageActions.selectCarPrice(carPrice);
	}

	@And("click on Find_My_Next_Car button")
	public void click_on_Find_My_Next_Car_button() {
		carsSearchPageActions.clickFindMyNextCarBtn();
	}

	@Then("I should see list of searched cars")
	public void i_should_see_list_of_searched_cars() {
		System.out.println("Car list found");
	}

	@And("the page title should be {string}")
	public void the_page_title_should_be(String expectedTitle) {
		String actualTitle = SeleniumDriver.getDriver().getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
}
