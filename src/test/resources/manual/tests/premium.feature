Feature: ROZETKA PREMIUM
  Scenario: Check the button for subscribing
    # HomePage.java
    Given Url https://rozetka.com.ua/ is open
    When Click on the button "Попробуйте PREMIUM"
    Then Button "Оформить подписку" is displayed