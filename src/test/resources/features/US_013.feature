Feature: Verify school's email address visibility on the homepage navbar
  As a user
  I want to see the school's email address on the homepage navbar
  So that I can easily access the email contact

  @
  Scenario: TC_001 Verify school's email address visibility
    Given I am on the homepage
    When  I look at the navbar
    Then  I should see the school's email address "email_address" displayed
    And   Close the browser

  @
  Scenario: TC_002 View school's contact information in the footer
    Given I am on the homepage
    Then I should see the school's "phone_number" in the footer
    And I should see the school's email address "email_address" displayed
    And User scrolls down the page
    And I should see the "school_address" in the footer
    And Close the browser

  @
  Scenario: TC_003 Scenario: View school's phone information as "Call Us" in the top bar
    Given I am on the homepage
    Then I should see the school's "phone_number" information as Call Us
    And Close the browser