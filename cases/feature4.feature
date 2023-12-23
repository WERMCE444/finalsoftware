
Feature: Reviews and Ratings

  Scenario: Leaving Reviews and Ratings for a Product
    Given a customer has purchased a product or installation service
    When they access the Reviews and Ratings feature
    Then they should be able to leave reviews and ratings for the purchased item

  Scenario: No Reviews for a New Product
    Given a new product or installation service is added to the catalog
    When customers view the product page
    Then there should be no reviews or ratings displayed initially

  Scenario: Displaying Average Ratings on Product Pages
    Given a product has received multiple reviews and ratings
    When customers view the product page
    Then the average ratings and reviews should be prominently displayed