@Regression
Feature: As a sports user, I would like to read about all articles related to sports
 Scenario: Use the search option to find all articles related to ‘sports’. Output the first heading and the last heading returned on the page.
    Given I am on homepage of BBC Website
    When I Search for "sports"
    And I click on Search tab
    Then I can see sports news List