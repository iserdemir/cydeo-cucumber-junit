Feature: Etsy website testings

  Scenario: Etsy Title Verification
    When user is on ets homepage
    Then user should see title that Etsy is

  Scenario:
    When user is on ets homepage
    When user types Wooden Spoon in the search box
    When user clicks search button
    Then user sees Wooden Spoon is in the title