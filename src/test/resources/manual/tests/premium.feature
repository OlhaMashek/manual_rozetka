Feature: ROZETKA PREMIUM
  Scenario: Check the button for subscribing
    # HomePage.java
    Given Url of "https://rozetka.com.ua" is open
    When Press on the button "Попробуйте PREMIUM"
    Then Button "Оформить подписку" is displayed