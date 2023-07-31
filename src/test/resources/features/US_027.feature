Feature: As an administrator (admin), I want to view and update fee types in the system

  @
  Scenario: TC_001  Redirect to "feetype" page from "Fees Type" link
  Clicking on "Fees Type" link in the sidebar

    * I am logged in as an admin user "admin_SuleymanDervisoglu"
    * I click on the "Fees Collection" menu in the sidebar
    * I click on the "Fees Type" page link
    * I should be redirected to the "feetype" page
    * Close the browser

  @
  Scenario: TC_002 Adding Fees Type
    * I am logged in as an admin user "admin_SuleymanDervisoglu"
    * I click on the "Fees Collection" menu in the sidebar
    * I click on the "Fees Type" page link
    * I have to see "Add Fees Type section" is available
    * Close the browser

  @
  Scenario: TC_003  The "Add Fees Type" window,
  when clicking the "Save" button, a new Fees Type record should be created
    * I am logged in as an admin user "admin_SuleymanDervisoglu"
    * I click on the "Fees Collection" menu in the sidebar
    * I click on the "Fees Type" page link
    * I have to see "Add Fees Type section" is available
    * On the Add Fees Type section "Solomon Derwise" must be entered as the name
    * On the Add Fees Type section "downpayment" must be entered as the Fees Code
    * On the Add Fees Type section "reward for regular payments" must be entered Description
    * On the Add Fees Type section click the save button
    * Close the browser

    @
    Scenario: TC_004 Editing a Fees Type
      * I am logged in as an admin user "admin_SuleymanDervisoglu"
      * I click on the "Fees Collection" menu in the sidebar
      * I click on the "Fees Type" page link
      * I have to see "Add Fees Type section" is available
      * On the Add Fees Type section "Solomon Derwise" must be entered as the name
      * On the Add Fees Type section "downpayment" must be entered as the Fees Code
      * On the Add Fees Type section "reward for regular payments" must be entered Description
      * On the Add Fees Type section click the save button
      * User scrolls down the page
      * User click the last beam's edit button
      * Change the in name box "Solomon Derwise" to "Suleyman Dervisoglu"
      * Change the in Fees code box "downpayment" to "prepayment"
      * Change the in Description box "reward for regular payments" to "all payments"
      * On the Add Fees Type section click the save button
      * Make sure edit is done
      * Close the browser

      @
      Scenario: TC_005 Delete a fees type from the list
        * I am logged in as an admin user "admin_SuleymanDervisoglu"
        * I click on the "Fees Collection" menu in the sidebar
        * I click on the "Fees Type" page link
        When User scrolls down the page
        Then the last record should be removed from the list
        * Given I wait for and press Enter key
        * Confirm the delete procedures
        And Close the browser