
Feature: Add cart the hp and apple laptop models

Scenario: Add to cart the hp laptop model
    Given launch the amazon site with property file
    When Enter username and password and click login
    And search hp model in search field
    And click the hp model
    And click add cart button of hp model
    Then cart added page has populated
    
    Scenario: Add to cart the Apple(mac) laptop model
    Given launch the amazon site with property file
    When Enter username and password and click login
    And search Apple model in search field
    And click the Apple model
    And click add cart button of apple model
    Then cart added page has populated
    
    
