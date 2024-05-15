
Feature: Test feature
  I want to test hust cucumber style program

  @login
  Scenario: Login functionality test
    Given I  have login page
    When I enter "Sagar" and "Khatua"
    And Click on login button
    Then Home Page should be displayed


  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
      
      

