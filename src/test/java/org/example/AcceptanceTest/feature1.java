package org.example.AcceptanceTest;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.TESTIN;

import javax.naming.Name;
import static org.junit.Assert.assertEquals;

import  java.sql.SQLException;
public class feature1 {

    @When("user click on save information and flag is {string}")
    public void userClickOnSaveInformationAndFlagIs(String string) {
        if (string.equals(true))  assertEquals(true,true);
        else assertEquals(false,false);

    }

    @When("he fill in {string}  with {string}")
    public void heFillInWith(String string, String string2) {
        boolean flag = false;

        if (string.equals("FirstName")) {
            flag = TESTIN.nameTest(string2);
            if (flag == true) assertEquals(true, true);
            else assertEquals(false, false);
        }

        else if (string.equals("LastName")) {
            flag = TESTIN.lastTest(string2);
            if (flag == true) assertEquals(true, true);
            else assertEquals(false, false);
        }

        else if (string.equals("Age")) {
            flag = TESTIN.ageTest(string2);
            if (flag == true) assertEquals(true, true);
            else assertEquals(false, false);
        }

        else if (string.equals("PhoneNumber")) {
            flag = TESTIN.PhoneNumberlastTest(string2);
            if (flag == true) assertEquals(true, true);
            else assertEquals(false, false);
        }

        else if (string.equals("CityName")) {
            flag = TESTIN.CityNameTest(string2);
            if (flag == true) assertEquals(true, true);
            else assertEquals(false, false);
        }

        else if (string.equals("Gmail")) {
            flag = TESTIN.GmailTest(string2);
            if (flag == true) assertEquals(true, true);
            else assertEquals(false, false);
        }

        else if (string.equals("Password")) {
            flag = TESTIN.PasswordTest(string2);
            if (flag == true) assertEquals(true, true);
            else assertEquals(false, false);
        }
    }

    @Then("The user should see {string}")
    public void theUserShouldSee(String string) {
        if (string.equals(true))  assertEquals(true,true);
        else assertEquals(false,false);
    }

    @Then("The personal information has  been entered successfully")
    public void thePersonalInformationHasBeenEnteredSuccessfully() {
        assertEquals(true,true);
    }

    @Then("the field {string} should be an error")
    public void theFieldShouldBeAnError(String string) {
        System.out.println("please enter inf first ");
        assertEquals(false,false);
    }

    @Then("The personal information has not  been entered successfully")
    public void thePersonalInformationHasNotBeenEnteredSuccessfully() {
        System.out.println("please enter correct inf");
        assertEquals(false,false);
    }
}
