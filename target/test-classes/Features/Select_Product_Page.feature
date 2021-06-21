

Feature: select the hp and apple laptop models

 
  Scenario: select the HP laptop model
    Given launch the amazon site with property file
    When Enter username and password and click login
    And search hp model in search field
    And click the hp model
    Then hp laptop details page has populated
    

  Scenario: select the Apple laptop model
    Given launch the amazon site with property file
    When Enter username and password and click login
    And search Apple model in search field
    And click the Apple model
    Then Apple laptop details page has populated
    
    
    













 