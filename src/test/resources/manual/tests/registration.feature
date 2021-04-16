Feature: INCORRECT REGISTRATION
  Scenario Outline: Check error display without entering email
    # HomePage.java
    Given Url of "https://rozetka.com.ua" is open
    When Click on the icon "Войти в личный кабинет"
    And Click "Зарегистрироваться"
    And Enter "<name>" to Name field
    And Enter "<surname>" to Last name field
    And Enter "<number>" to Phone number field
    And Enter "<password>" to password field
    And Click on icon "Зарегистрироваться"
    Then An error without entering an email is displayed
    Examples:
      | name | surname | number     | password   |
      | Vlad | Ivanov  | 0972222222 | 1111111111 |
      | Egor | Morozov | 0982222222 | 2222222222 |
      | Petr | Petrov  | 0732222222 | 3333333333 |