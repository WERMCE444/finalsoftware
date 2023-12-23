Feature: Installation Requests

  Scenario: Customer Requests Installation for a Product
    Given the customer is logged in
    When the customer selects a product for installation
    And fills out the installation request form
    Then the customer should be able to submit the installation request

  Scenario: Customer submits an installation request with specified details
    Given the customer is logged in
    When the customer navigates to the "Installation Requests" section
    And the customer fills out the installation request form with the following details:
      | Car Make/Model   | Preferred Date |
      | Toyota Camry      | 2023-12-15      |
    And the customer submits the installation request
    Then the installation request details should be saved in the system

  Scenario: Installer availability and appointment scheduling
    Given the installer is logged in
    When the installer checks their current availability
    And reviews the details of the installation request
    Then the installer should be able to schedule an appointment