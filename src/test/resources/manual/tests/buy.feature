Feature: BUY
  Scenario: Check correct item added to the cart
    # HomePage.java
    Given Url of "https://rozetka.com.ua" is open
    When Enter in the search field "iPhone 12 Pro Max 256GB" click ENTER
    # SearchPage.java
    And Click on the first product found
    # ItemPage.java
    And Check that url contains "apple_iphone_12_pro_max_256gb_gold"
    And Click on the button "Купить"
    # PopupPage.java
    And Close the displayed pop-up
    # HomePage.java
    And Click on the button "Корзина"
    Then The item with title "iPhone" displayed in the cart