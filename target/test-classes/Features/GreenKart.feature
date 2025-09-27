
Feature: Validating common vegetables on both dashboard and offers page

  @smoke
  Scenario: verifying
  
  Given user open the application in any browser
  When user provide the veg table name in "tom" search field
  And click on the Topdeals link and provide the veg name "tom" in search field
  Then validating vegetables are availables on both dashboard and offers page
    

