Feature: As a customer, I can select which type of building material my home is constructed with

  @wip
 Scenario: Customer successfully submits building material
    Given I am on the Building Material question page
    When I select an option
    And I click the Next button
    Then I should be navigated to the Water Proximity question page

 @wip
 Scenario: Customer submits without selecting an option
   Given I am on the Building Material question page
   When I have not selected any options
   Then the Next button should be disabled
