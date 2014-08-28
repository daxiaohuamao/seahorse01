 Feature: As a: User
  I want: Test the telstra register page
  So I can: register

  Scenario: I want to open the page of telstra and register it
    Given a website named telstra register
    When I open the link http://localhost:9500/register
    Then I should see the page
    When write your email lifei_polly@163.com
    When write your password 1qaz2wsx
    When re-enter your password 1qaz2wsx
    When write your first name Li
    When write your last name Fei
    When write your birthday day 17
    When write your birthday month 07
    When write your birthday year 1989
    When write your telstra numbers 0400000000





