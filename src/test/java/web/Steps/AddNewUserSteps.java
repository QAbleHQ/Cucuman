package web.Steps;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import web.object_repository.AdminModule.UserManagement.UserManagement;

public class AddNewUserSteps {

    UserManagement userPage = new UserManagement();

    @When("Admin click on User module")
    public void admin_click_on_user_module() {
   userPage.click_on_user_tab();
     
    }
    @Then("Super Admin redirect to User page")
    public void super_admin_redirect_to_user_page() throws InterruptedException {
        userPage.verify_user_management_title_text_is_equal_to("User Management");
     
    }
    @When("Admin click on new user")
    public void admin_click_on_new_user() {
     userPage.click_on_new_user_button();
     
    }
    @Then("Super Admin redirect to create a new User page")
    public void verify_user_management_title_text_is_equal_to() throws InterruptedException {
     userPage.verify_new_user_title_text_is_equal_to("New User");
     
    }
    @When("Admin enters name")
    public void admin_enters_name() {
     userPage.clear_text_and_enter_text_in_user_name("QA_testing");
     
    }
    @When("Admin enter email")
    public void admin_enter_email() {
     userPage.clear_text_and_enter_text_in_user_email("QA_testing@mailinator.com");

    }

 @When("Admin enters phone number")
 public void admin_enter_phone_number() {
  userPage.clear_text_and_enter_text_in_user_phone("9033660580");

 }
    @When("Admin enter password")
    public void admin_enter_password() {
     userPage.clear_text_and_enter_text_in_user_password("QAble@2020");
     
    }
    @When("Admin select client admin role")
    public void admin_select_client_admin_role() throws InterruptedException {
     userPage.click_on_user_role_dropdown();
     userPage.click_on_user_client_role();
     
    }
    @When("Admin click on create button")
    public void admin_click_on_create_button() {
     userPage.click_on_user_create_button();
     
    }
    @Then("Created user shows in user list with details")
    public void created_user_shows_in_user_list_with_details() {
        userPage.verify_mapping_label_button_is_present_on_page();
     
    }


}
