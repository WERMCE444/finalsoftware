
package org.example.AcceptanceTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.*;

import java.util.List;
import java.util.Scanner;

import java.util.ArrayList;

import static org.example.ShoppingCart.*;
import static org.junit.Assert.assertEquals;

public class feature2 {
    Admin Admin = new Admin();
    private org.example.Product Product;

    //Product Product = new Product();
    public void Product(String Name, Integer ID, Integer price, String image) {
    }

    ArrayList<Product> ListProduct = new ArrayList<>();

    @Given("the Admin is logged in")
    public void theAdminIsLoggedIn() {
    }

    @When("the Admin navigates to the product management section")
    public void theAdminNavigatesToTheProductManagementSection() {
    }

    @When("adds a new product with relevant details")
    public void addsANewProductWithRelevantDetails() {
        //ListProduct.add(Product);
    }

    @Then("the new product should be successfully added to the system.")
    public void theNewProductShouldBeSuccessfullyAddedToTheSystem() {
       boolean flag = true;
        String productnew = "car";
        flag = Product.successfuladd(productnew);

        for (Product str : ListProduct) {
            if (str.equals(productnew)) {
                if (flag == true) System.out.println("product successfully added");

                else if (flag = false) System.out.println("product not successfully added");
            }
        }
    }

    @When("the Admin goes to the category management section")
    public void theAdminGoesToTheCategoryManagementSection() {
    }

    @When("creates a new product category")
    public void createsANewProductCategory() {
        Product product1 = new Product("car1", 89, 24, "image1.jpg");
        Product product2 = new Product("car2", 499, 444, "image2.jpg");

        Category car = new Category("car");
        car.addProductToList1(product1);
        car.addProductToList2(product2);

        // Display category information
        System.out.println(car);
    }

    @Then("the system should have the newly added category available for product classification.")
    public void theSystemShouldHaveTheNewlyAddedCategoryAvailableForProductClassification() {
    }

    @Given("the Customer is logged in")
    public void theCustomerIsLoggedIn() {
    }

    @When("the Customer selects a product to purchase")
    public void theCustomerSelectsAProductToPurchase() {
       Product product1 = new Product("car1", 89, 24, "image1.jpg");
        Product product2 = new Product("car2", 499, 444, "image2.jpg");

        // Create a shopping cart
        ShoppingCart shoppingCart = new ShoppingCart();
        // add to cart
        shoppingCart.addToCart(product1);
        shoppingCart.addToCart(product2);

    }
    @When("completes the payment process")
    public void completesThePaymentProcess() {
    }

    @Then("the system should confirm the purchase and update the order history.")
    public void theSystemShouldConfirmThePurchaseAndUpdateTheOrderHistory() {
    }

    @Given("the Customer is browsing the product catalog")
    public void theCustomerIsBrowsingTheProductCatalog() {
    }

    @When("the Customer navigates through different categories")
    public void theCustomerNavigatesThroughDifferentCategories() {
    }

    @Then("the Customer should be able to view products in those categories.")
    public void theCustomerShouldBeAbleToViewProductsInThoseCategories() {

        Product product1 = new Product("car1", 89, 24, "image1.jpg");
        Product product2 = new Product("car2", 499, 444, "image2.jpg");

        Category car = new Category("car");

        car.addProductToList1(product1);
        car.addProductToList2(product2);

        // view the product in category
        Customer.viewProducts(car);
    }

    @Given("the Customer has completed a purchase")
    public void theCustomerHasCompletedAPurchase() {

       Product product1 = new Product("car1", 89, 24, "image1.jpg");
        Product product2 = new Product("car2", 499, 444, "image2.jpg");

        Category car = new Category("car");

        Customer.addToCart(product1, 1);
        Customer.addToCart(product2, 2);

        // Customer completes the purchase
        Customer.purchase();
    }

    @When("the Customer goes to the order history")
    public void theCustomerGoesToTheOrderHistory() {
        Customer.viewOrderHistory();
    }

    @Then("the Customer should be able to view the details of the placed order.")
    public void theCustomerShouldBeAbleToViewTheDetailsOfThePlacedOrder() {
        Customer.viewOrderDetails(1);
    }

    @Given("The Installer has logged into the system and has the necessary credentials.")
    public void theInstallerHasLoggedIntoTheSystemAndHasTheNecessaryCredentials() {

        Installer installer = new Installer();

        installer.login( "ahmad", "56AA37582");
        System.out.println("Login failed. Invalid credentials.");

    }

    @When("The Installer navigates to the {string} section of the system.")
    public void theInstallerNavigatesToTheSectionOfTheSystem(String string) {

        Installer.navigateToSection(1);
    }

    @Then("The system displays a list of all pending installation requests, including relevant details such as customer information, requested products, and preferred dates for installation.")
    public void theSystemDisplaysAListOfAllPendingInstallationRequestsIncludingRelevantDetailsSuchAsCustomerInformationRequestedProductsAndPreferredDatesForInstallation() {
        System.out.println("messege__ displays a list of all pending installation requests,");

        }
    }
