package StepDefinition;

import Pages.LoginPage;
import Pages.SecureAreaPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class SecureAreaSteps {
    SecureAreaPage secureAreaPage;

    public SecureAreaSteps() {
        secureAreaPage = new SecureAreaPage();
    }

    @Then("I logged in to secure area")
    public void logged() {
        secureAreaPage.checkIfLoginSuccess();
    }

    @And("I click logout")
    public void logout() {
        secureAreaPage.clickLogout();
    }
}
