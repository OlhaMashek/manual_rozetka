Feature: SORTING
  Scenario: 1 Check the sorting of items by price from expensive to cheap
    # BaseStep.java
    Given Url of "https://rozetka.com.ua" is open
    # HomePage.java
    When Enter in the search field "iPhone 12 Pro Max 256GB"
     # SearchPage.java
    And Click by the checkbox "От дорогих к дешевым"
    Then Sorting items from expensive to cheap is displayed

  Scenario: 2 Check the sorting of items by price from cheap to expensive
    # BaseStep.java
    Given Url of "https://rozetka.com.ua" is open
    # HomePage.java
    When Enter in the search field "iPhone 12 Pro Max 256GB"
    # SearchPage.java
    And Press on the checkbox "От дешевых к дорогим"
    Then Sorting items from cheap to expensive is displayed