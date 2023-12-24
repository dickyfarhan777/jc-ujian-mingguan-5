Feature: Admin Login
  #scenario test case
  #1
  Scenario: Admin Login Valid
    Given Admin enter url web saucedemo
    When Admin enter username
    And Admin enter password
    And Admin click login button
    Then Admin login succesful redirect page dashboard

  #2
  Scenario: Admin Login invalid without input username and password
    Given Admin enter url web saucedemo or admin logout
    When Admin click login button
    Then Admin login can not login redirect page dashboard

  #3
  Scenario: Admin Login invalid with wrong username
    Given Admin enter url web saucedemo
    When Admin enter wrong username
    And Admin enter password
    And Admin click login button wrong username
    Then Admin login can not login redirect page dashboard
#  #4
#  Scenario: Admin Login invalid with wrong password
#    Given Admin enter url web saucedemo
#    When Admin enter username
#    And Admin enter wrong password
#    And Admin click login button
#    Then Admin login can not login redirect page dashboard
