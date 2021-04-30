Feature: BUY
  Scenario: Check correct item added to the cart
    # BaseStep.java
    Given Url of "https://rozetka.com.ua" is open
      #HomePage.java
    When Enter in the search field "iPhone 12 Pro Max 256GB"
    # SearchPage.java
    And Click on the first product found
    And Check for a search query in the title
    # ItemPage.java
    And Click on the Buy button
    And Close the displayed pop-up
    # HomePage.java
    Then The item with count "1" displayed on the cart icon