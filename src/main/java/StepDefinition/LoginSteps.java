package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import Pages.LoginPage;

public class LoginSteps {
    LoginPage loginPage;

    public LoginSteps() {
        loginPage = new LoginPage();
    }

    @Given("I'm on the login page")
    public void goToLoginPage() {
        loginPage.getTitle();
    }

    @And("I fill username with {string} and password with {string}")
    public void fillUsernamePassword(String username, String password){
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);
    }

    @And("I click login")
    public void clickLogin(){
        loginPage.clickLogin();
    }
}
