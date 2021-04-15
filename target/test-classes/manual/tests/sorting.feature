Feature: SORTING
  Scenario: 1 Check the sorting of items by price from expensive to cheap
    Given Url https://rozetka.com.ua/ is open
    When Enter in the search field "iPhone 12 Pro Max 256GB"
    And Press the button "Enter"
    And Click on the checkbox "По релевантности"
    And Click on the button "От дорогих к дешевым"
    Then Sorting items from expensive to cheap is displayed

  Scenario: 2 Check the sorting of items by price from cheap to expensive
    Given Url https://rozetka.com.ua/ is open
    When Enter in the search field "iPhone 12 Pro Max 256GB"
    And Press the button "Enter"
    And Click on the checkbox "По релевантности"
    And Click on the button "От дешевых к дорогим"
    Then Sorting items from cheap to expensive is displayed