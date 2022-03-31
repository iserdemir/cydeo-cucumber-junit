Feature: Wikipedia search functionality and verifications

  #WSF-45324 --> potential jira ticket number

  Scenario: Wikipedia Search Functionality Title Verification
    Given User is on wikipedia home page
    When User types "Steve Jobs" on the wiki search box
    And User clicks wiki search button
    Then User sees "Steve Jobs" is in wiki title
    Then User sees "Steve Jobs" is in the main header

  @scenarioOutline
  Scenario Outline:  Wikipedia Search Functionality Title Verification
    Given User is on wikipedia home page
    When User types "<searchValue>" on the wiki search box
    And User clicks wiki search button
    Then User sees "<expectedTitle>" is in wiki title
    Then User sees "<expectedMainHeader>" is in the main header

    Examples: search values we are going to be using in this scenario is as below
      | searchValue  | expectedTitle | expectedMainHeader |
      | Fatih Terim  | Fatih Terim   | Fatih Terim        |
      | Lana Del Rey | Lana Del Rey  | Lana Del Rey       |
      | Rihanna      | Rihanna       | Rihanna            |
      | Jayson Tatum | Jayson Tatum  | Jayson Tatum       |
      | Karsu        | Karsu         | Karsu              |