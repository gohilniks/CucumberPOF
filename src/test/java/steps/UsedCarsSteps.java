package steps;

import java.util.List;

import io.cucumber.java.en.And;
import pages.actions.UsedCarsSearchPageActions;

public class UsedCarsSteps {
	UsedCarsSearchPageActions usedCarsSearchPageActions = new UsedCarsSearchPageActions();
	
	@And("select car model")
	public void select_car_model(List<String> list) {
		String menu = list.get(3);
		System.out.println("Selected model is : " + menu);
		usedCarsSearchPageActions.selectCarModel(menu);
	}
}
