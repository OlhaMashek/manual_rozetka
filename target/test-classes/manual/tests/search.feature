Feature: EMPTY SEARCH
  Scenario Outline: Check that search result is empty for irrelevant search queries
    # HomePage.java
    Given Url of "https://rozetka.com.ua" is open
    When Enter "<text>" in search field
    Then Error is displayed "По вашему запросу ничего не найдено"
    Examples:
      | text              |
      | синхрофазотрон    |
      | зілля невидимості |
      | індульгенція      |