Feature: As a: User
  I want: Search by Baidu
  So I can: get a lot of information


  Scenario: I want to learn how to use cucumber.
    Given a key
    When I visit http://www.baidu.com
    Then I should check the url

    Given a key
    When I visit http://www.google.com
    Then I should check the url

    Given a key
    When I choose http://www.baiduaaa.com
    Then I should check the url
