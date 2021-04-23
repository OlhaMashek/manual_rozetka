Feature: INCORRECT REGISTRATION
  Scenario Outline: Check error display without entering email
    # BaseStep.java
    Given Url of "https://rozetka.com.ua" is open
      # HomePage.java
    When Click on the icon "Войти в личный кабинет"
    And Click "Зарегистрироваться"
    And Enter "<name>" to Name field
    And Enter "<surname>" to Last name field
    And Enter "<number>" to Phone number field
    And Enter "<password>" to password field
    And Click on icon "Зарегистрироваться"
    Then An error "Введите свою эл. почту" is displayed

    Examples:
      | name | surname | number     | password   |
      | Влад | Иванов  | 0972222222 | A1111111111a |
      | Егор | Морозов | 0982222222 | A2222222222a |
      | Петр | Петров  | 0732222222 | A3333333333a |