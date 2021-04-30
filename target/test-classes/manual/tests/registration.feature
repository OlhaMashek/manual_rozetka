Feature: INCORRECT REGISTRATION
  Scenario: Check error display without entering email
    # BaseStep.java
    Given Url of "https://rozetka.com.ua" is open
      # HomePage.java
    When Click on the icon "Войти в личный кабинет"
    And Click "Зарегистрироваться"
    And Enter "Влад" to Name field
    And Enter "Иванов" to Last name field
    And Enter "<0972222222>" to Phone number field
    And Enter "<A1111111111a>" to password field
    And Click on the Register button
    Then The error that you need to enter the email is displayed