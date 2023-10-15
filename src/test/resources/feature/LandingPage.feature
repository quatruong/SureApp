Feature: As a customer, I can enter a 5-digit zip code to begin the quote process
  @wip
  Scenario: Customer enters valid zip code
    Given I am on the landing page
    When I enter any 5-digit zip code
    And I submit the form
    Then I should be navigated to the Building Material question page

  @wip
  Scenario: Customer submits blank zip code field
    Given I am on the landing page
    When I leave the zip code field empty
    And I submit the form
    Then I should see a validation message "Required"
  @wip
  Scenario: Customer submits invalid zip code
    Given I am on the landing page
    When I enter "1234" in the zip code field
    And I submit the form
    Then I should see a validation message is "Invalid zip code"

