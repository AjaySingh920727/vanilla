@amazon 
Feature: Amazon

  Scenario: Amazon - Verify second highest priced Samsung television
    Given user launches "https://www.amazon.in" web application
    When user selects "Television" section from hamburger menu in "TV, Appliances and Electronics" section
    And scroll down and filter the results by Brand "Samsung"
    And sort the Samsung results with price "High to Low"
    And selects the second highest priced item from the sorting result
    Then user should navigate to second highest priced item page in new window
    And user should "About this item" section with all item details
    And user closes the browser
    
    

