Feature: ROZETKA PREMIUM
  Scenario: Check the button for subscribing
    # BaseStep.java
    Given Url of "https://rozetka.com.ua" is open
    #HomePage.java
    When Click on the button Try Premium
    Then Button is displayed