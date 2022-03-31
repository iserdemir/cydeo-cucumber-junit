Feature: Smart Bear order process

  Scenario: User should order something from SmartBear
    Given User is on the SmartBear homepage
    When User is logged into SmartBear username "Tester" password "test"
    When User fills out the form
    And   User should put in a quantity "4"
    And  User should write a name "Jayson Tatum"
    And  User should write a street "Mallard Pointe Dr"
    And User should write a city "O'Fallon"
    And User should write a state "MO"
    And  User should write a zipcode "63368"
    And user should click one of the card types
    And User should write a card number "1905190519051905"
    And  User should write an expire date "03/25"
    When User clicks process button
    Then User verifies "Jayson Tatum" is in the list