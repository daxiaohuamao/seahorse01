Feature: As a: User
  I want: Search by Baidu
  So I can: get a lot of information


  Scenario: I want to learn how to use cucumber.
    Given a url
    When I use http://www.baidu.com
    Then I check the url

    Given a url
    When I use http://www.google.com
    Then I check the url

    Given a url
    When I use http://www.baiduaaa.com
    Then I check the url

    Given a url
    When I use http://www.163.com
    Then I check the url

