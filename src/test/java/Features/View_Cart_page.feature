
Feature: view the added hp and apple laptop models in view cart


Scenario: view cart the hp laptop model
    Given launch the amazon site with property file
    When Enter username and password and click login
    And search hp model in search field
    And click the hp model
    And click add cart button of hp model
    And click cart button to view the added item of hp model
    Then view cart page has populated

    
Scenario: view cart the Apple laptop model
    Given launch the amazon site with property file
    When Enter username and password and click login
    And search Apple model in search field
    And click the Apple model
    And click add cart button of apple model
    And click cart button to view the added item of apple model
    Then view cart page has populated