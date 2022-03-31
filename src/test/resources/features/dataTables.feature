Feature: Examples of Cucumber data table implementations

  @wip
  Scenario: User should see all 12 months
    Given User is on the dropdowns page of practice tool
    Then User should see below info in the month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
