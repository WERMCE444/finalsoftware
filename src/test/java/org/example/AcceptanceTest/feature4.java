package org.example.AcceptanceTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.*;

import javax.naming.Name;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
public class feature4 {

    @Given("a customer has purchased a product or installation service")
    public void aCustomerHasPurchasedAProductOrInstallationService() {
        Product product = new Product("Smartphone", 78,44,"image2.jpg");
        int purchasedQuantity = 2;
        product.price=88;
        Customer customer = new Customer("ahmad", "ufvn");
        customer.makePurchase("car",454);
    }

    @When("they access the Reviews and Ratings feature")
    public void theyAccessTheReviewsAndRatingsFeature() {
        System.out.println("User is accessing the Reviews and Ratings feature.");
    }

    @Then("they should be able to leave reviews and ratings for the purchased item")
    public void theyShouldBeAbleToLeaveReviewsAndRatingsForThePurchasedItem() {

        System.out.println("Please leave your reviews and ratings for the purchased item:");
        System.out.print("review = great.....");
        int ratings = 3;
        System.out.print("rating = ");
        System.out.print( ratings);
        System.out.println("........ Thank you for leaving your reviews and ratings.");
    }

    @Given("a new product or installation service is added to the catalog")
    public void aNewProductOrInstallationServiceIsAddedToTheCatalog() {
    }

    @Then("there should be no reviews or ratings displayed initially")
    public void thereShouldBeNoReviewsOrRatingsDisplayedInitially() {
        System.out.println("Displaying reviews and ratings on the product page.");
    }

    @Given("a product has received multiple reviews and ratings")
    public void aProductHasReceivedMultipleReviewsAndRatings() {
        String productName = "Car1";
        String productDescription = "A high-performance.";

        // adding multiple reviews and ratings
        ReviewsAndRating.leaveReviewsAndRatings( "Customer1", "Great product!");
        ReviewsAndRating.leaveReviewsAndRatings("Customer2", "bad product!");

        //viewing the product page
        ReviewsAndRating.viewMultiReview();
    }
    @When("customers view the product page")
    public void customersViewTheProductPage() {

    }
    @Then("the average ratings and reviews should be prominently displayed")
    public void theAverageRatingsAndReviewsShouldBeProminentlyDisplayed() {

    }

}
