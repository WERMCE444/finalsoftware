Feature: User Roles

  Scenario: Adding a New Product
    Given the Admin is logged in
    When the Admin navigates to the product management section
    And adds a new product with relevant details
    Then the new product should be successfully added to the system.

  Scenario: Creating a New Product Category
    Given the Admin is logged in
    When the Admin goes to the category management section
    And creates a new product category
    Then the system should have the newly added category available for product classification.

  Scenario: Making a Purchase    //
    Given the Customer is logged in
    When the Customer selects a product to purchase
    And completes the payment process
    Then the system should confirm the purchase and update the order history.

  Scenario: Browsing Products    //
    Given the Customer is browsing the product catalog
    When the Customer navigates through different categories
    Then the Customer should be able to view products in those categories.

  Scenario: Viewing Order Details      //
    Given the Customer has completed a purchase
    When the Customer goes to the order history
    Then the Customer should be able to view the details of the placed order.

  Scenario: Viewing Installation Requests and Scheduling Appointments
    Given The Installer has logged into the system and has the necessary credentials.
    When The Installer navigates to the "Installation Requests" section of the system.
    Then The system displays a list of all pending installation requests, including relevant details such as customer information, requested products, and preferred dates for installation.
