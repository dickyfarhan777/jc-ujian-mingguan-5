Feature: Add cart
  #1
  Scenario: Admin addcart product
    Given Admin login web saucedemo
    When Admin click add cart product 1
    Then Admin click add cart product 2
#2
    Scenario: Admin checkout product
      Given Admin click cart button
      When Admin click checkout button
      And Admin enter firstname and lastname and postalcode
      And Admin click continue button
      And Admin click finish button
      Then User finish checkout product