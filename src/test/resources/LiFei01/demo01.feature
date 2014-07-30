Feature: As a: User
  I want: Search by Baidu
  So I can: get a lot of information


  Scenario: I want to learn how to use cucumber.
    Given a key
    When I visit http://www.baidu.com
    Then I should check the url