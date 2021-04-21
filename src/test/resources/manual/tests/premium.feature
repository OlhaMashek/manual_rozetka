Feature: ROZETKA PREMIUM
  Scenario: Check the button for subscribing
    # BaseStep.java
    Given Url of "https://rozetka.com.ua" is open
    #HomePage.java
    When Press on the button "Попробуйте PREMIUM"
    Then Button "Оформить подписку" is displayed