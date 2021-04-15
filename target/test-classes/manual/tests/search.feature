Feature: EMPTY SEARCH
  Scenario Outline: Check that search result is empty for irrelevant search queries
    Given Url https://rozetka.com.ua/ is open
    When Enter "<text>" in search
    And An error is displayed "По вашему запросу ничего не найдено"
    Then Search result should be empty
    Examples:
      | text              |
      | синхрофазотрон    |
      | зілля невидимості |
      | індульгенція      |