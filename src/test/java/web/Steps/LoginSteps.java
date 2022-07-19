package web.Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.object_repository.LoginModule.LoginPage;

public class LoginSteps {

    LoginPage loginpage = new LoginPage();

    @When("I submit username and password")
    public void i_submit_username_and_password() {


        loginpage.enter_text_at_Email_textbox("ankitpatel@qable.io");
        loginpage.enter_text_at_Password_textbox("dbai@ankit1");
        loginpage.click_on_Sign_in_button();

    }

    @Then("I should be logged in")
    public void i_should_be_logged_in() {
        loginpage.verify_Tracking_page_is_present_on_page();
    }

}
