Feature: Search hotel

  @smoke
  Scenario: User should be able to search hotel in expedia
    Given User in expedia home page
    When Click cheap hotel
    Then User on expedia hotel page