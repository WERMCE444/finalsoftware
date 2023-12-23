package org.example.AcceptanceTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.*;

import javax.naming.Name;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;
public class feature3 {

    @Given("the customer is logged in")
    public void theCustomerIsLoggedIn() {

    }
    @When("the customer selects a product for installation")
    public void theCustomerSelectsAProductForInstallation() {
        Product product1 = new Product("car1", 89, 24, "image1.jpg");
        Product product2 = new Product("car2", 499, 444, "image2.jpg");
        //InstallationRequest installationSelection = new InstallationRequest();

        //int choice=0;
        InstallationRequest.selectProduct(product1 , 1);
        InstallationRequest.selectProduct(product2 , 2);

    }

    @When("fills out the installation request form")
    public void fillsOutTheInstallationRequestForm() {
        InstallationRequest installationRequestForm = new InstallationRequest();
        Product product1 = new Product("car1", 89, 24, "image1.jpg");
        //Product product2 = new Product("car2", 499, 444, "image2.jpg");
        installationRequestForm.fillForm(product1 );

        //installationRequestForm.fillForm(carMakeModel, preferredDate);

    }
    @Then("the customer should be able to submit the installation request")
    public void theCustomerShouldBeAbleToSubmitTheInstallationRequest() {
    }

    @When("the customer navigates to the {string} section")
    public void theCustomerNavigatesToTheSection(String string) {
    }

    @When("the customer fills out the installation request form with the following details:")
    public void theCustomerFillsOutTheInstallationRequestFormWithTheFollowingDetails(io.cucumber.datatable.DataTable dataTable) {
    }

    @When("the customer submits the installation request")
    public void theCustomerSubmitsTheInstallationRequest() {
    }

    @Then("the installation request details should be saved in the system")
    public void theInstallationRequestDetailsShouldBeSavedInTheSystem() {
    }

    @Given("the installer is logged in")
    public void theInstallerIsLoggedIn() {
    }

    @When("the installer checks their current availability")
    public void theInstallerChecksTheirCurrentAvailability() {
        Installer installer = new Installer();
        installer.checkAvailability();
        installer.available = false;
        installer.checkAvailability();
    }

    @When("reviews the details of the installation request")
    public void reviewsTheDetailsOfTheInstallationRequest() {
    }

    @Then("the installer should be able to schedule an appointment")
    public void theInstallerShouldBeAbleToScheduleAnAppointment() {
    }

}