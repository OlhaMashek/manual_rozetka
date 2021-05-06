Feature: EMPTY SEARCH
  Scenario Outline: Check that search result is empty for irrelevant search queries
    # BaseStep.java
    Given Url of "https://rozetka.com.ua" is open
    # HomePage.java
    When Enter "<text>" in search field
    Then The error is that nothing was found for the request
    Examples:
      | text              |
      | синхрофазотрон    |
      | зілля невидимості |
      | індульгенція      |