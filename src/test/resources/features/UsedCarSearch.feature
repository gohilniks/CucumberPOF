@Used-Search-Cars
Feature: Acceptance testing to validate Used Search Cars page is working fine.
  In order to validate that 
  the Used search cars page is working fine
  we will do the acceptance testing

  @Used-Search-Cars-Positive
  Scenario: Validate used search cars page
    Given I am on the Home Page "http://www.carsguide.com.au" of CarsGuide website
    When I move to the menu
      | Menu       |
      | buy + sell |
      | reviews    |
    And click on "Used" link
    And select carbrand as "Ford" from AnyMake dropdown
    And select car model
      | carModel |
      | Capri    |
      | Coupe    |
      | Mustang  |
    And select location as "ACT - All" from SelectLocation dropdown
    And select price as "$100,000" from Price dropdown
    And click on Find_My_Next_Car button
    Then I should see list of searched cars
    And the page title should be "Used Ford Mustang Under 100000 for Sale ACT | carsguide"
