Feature: Admin

  @Test1
  Scenario: login Scenario
    When User opens the url enter the valid details & click on login button

  @Test2
  Scenario Outline:Invalid login Scenario
    Given  user opens the url
    When  user Enter <userId> and <password>
    Then User is not navigated to the next page
    Examples:-
      | userId                       |  | password   |
      | pradnya.ash@coditas.com      |  | Pradnya@12 |
      | pradnya.ashte@coditas.com    |  | Pradnya78  |
      | Pradnya.Ashte+PM@coditas.com |  | Pradnya@1  |

  @Test3
  Scenario: Blank login
    Given user opens the url
    Then users clicks on login button

  @Test4
  Scenario: Forgot password
    Given user is on the login page
    Then user clicks on forgot password link text
    And user enters the email id
    Then user clicks on reset password link buttton
@Test8
Scenario: Verify Grid Data
    Given  When User opens the url enter the valid details & click on login button
    Then Verify the data from dashboard
































