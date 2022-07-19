package web.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.unity.framework.data.TestData;
import org.junit.Test;
import web.object_repository.AdminModule.ClientManagement.ClientManagement;
import web.object_repository.LoginModule.LoginPage;

public class AddNewClientSteps {

    LoginPage loginPage = new LoginPage();
    ClientManagement adminPage = new ClientManagement();

    static String client_name = "";
    String email;

    @Given("Admin is on tracking page")
    public void admin_is_on_tracking_page() {

        loginPage.verify_Tracking_page_is_present_on_page();

    }

    @When("Admin click on admin tab")
    public void admin_click_on_admin_tab() {

        adminPage.click_on_Admin_tab();

    }

    @Then("Admin redirect on admin page")
    public void admin_redirect_on_admin_page() {
        adminPage.verify_Admin_tab_is_present_on_page();

    }

    @Then("Create a new client button should display")
    public void create_a_new_client_button_should_display() {
        adminPage.verify_create_new_client_button_is_clickable();

    }

    @When("I click on Create a new client button")
    public void i_click_on_create_a_new_client_button() {

        adminPage.click_on_create_new_client_button();
    }

    @Then("New create a client page should open")
    public void new_create_a_client_page_should_open() {

    }

    @When("Admin enters client name {string}")
    public void admin_enters_client_name(String client_name) {

        AddNewClientSteps.client_name = "A_"+TestData.first_name()+ " " + TestData.last_name();
        adminPage.enter_text_at_client_name(AddNewClientSteps.client_name);

    }

    @When("Admin select Line Of Business {string}")
    public void admin_select_line_of_business(String string) {
        adminPage.click_on_line_business_dropdown();
        adminPage.click_on_fleet_option();

    }

    @When("Admin enters email {string}")
    public void admin_enters_email(String string) {
        email = TestData.email();
        adminPage.enter_text_at_client_email(email);

    }

    @When("Admin enters phone number {string}")
    public void admin_enters_phone_number(String string) {
        adminPage.enter_text_at_client_phone(string);
    }

    @When("Admin enters Address {string}")
    public void admin_enters_address(String string) {
        adminPage.enter_text_at_client_address(string);

    }

    @When("Admin enters city {string}")
    public void admin_enters_city(String string) {
        adminPage.enter_text_at_client_city(string);
    }

    @When("Admin enters state {string}")
    public void admin_enters_state(String string) {
        adminPage.enter_text_at_client_state(string);

    }

    @When("Admin select country {string}")
    public void admin_select_country(String string) {

        adminPage.click_on_country_dropdown();
        adminPage.click_on_india_option();
    }

    @When("Admin clicks create button")
    public void admin_clicks_create_button() {
        adminPage.click_on_create_button();

    }

    @Then("Client created successfully message should display")
    public void client_created_successfully_message_should_display() {
        adminPage.verify_client_added_message_text_is_equal_to("Client Added Successfully.");

    }

    @Then("Created client should display in client list")
    public void created_client_should_display_in_client_list() {

        adminPage.verify_client_name_list_contains(AddNewClientSteps.client_name);
    }



    @When("Admin enters client name")
    public void admin_enters_client_name() {
        AddNewClientSteps.client_name = "A_"+TestData.first_name()+ " " + TestData.last_name();
        adminPage.enter_text_at_client_name(AddNewClientSteps.client_name);
    }
    @When("Admin enters email")
    public void admin_enters_email() {
        email = TestData.email();
        adminPage.enter_text_at_client_email(email);
    }
}
