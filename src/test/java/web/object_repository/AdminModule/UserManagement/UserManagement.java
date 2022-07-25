package web.object_repository.AdminModule.UserManagement;

import io.unity.framework.init.base;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;
import org.openqa.selenium.WebDriver;
import io.unity.framework.generators.methodsgenerator.methods.MethodsData;

public class UserManagement  {

	WebDriver driver = null;
	Element element = null;
	Verify verify = null;
	Wait wait = null;

	public UserManagement() {

		element = new Element(base.driver);
		verify = new Verify(base.driver);
		wait = new Wait(base.driver);
	}

	@MethodsData(method_id = "button_1")
	public void verify_user_client_manager_role_is_present_on_page() {
		verify.element_is_present("user_client_manager_role");
	}

	@MethodsData(method_id = "button_2")
	public void verify_user_client_manager_role_is_clickable() {
		verify.element_is_enable("user_client_manager_role");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_user_client_manager_role() {
		element.click("user_client_manager_role");
	}

	@MethodsData(method_id = "button_4")
	public void Verify_user_client_manager_role_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("user_client_manager_role", button_text);
	}

	@MethodsData(method_id = "button_1")
	public void verify_user_cancel_button_is_present_on_page() {
		verify.element_is_present("user_cancel_button");
	}

	@MethodsData(method_id = "button_2")
	public void verify_user_cancel_button_is_clickable() {
		verify.element_is_enable("user_cancel_button");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_user_cancel_button() {
		element.click("user_cancel_button");
	}

	@MethodsData(method_id = "button_4")
	public void Verify_user_cancel_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("user_cancel_button", button_text);
	}

	@MethodsData(method_id = "text_box_2")
	public void clear_text_from_user_email() {
		element.clear_text_field("user_email");
	}

	@MethodsData(method_id = "text_box_3")
	public void clear_text_and_enter_text_in_user_email(String text_to_enter) {
		element.clear_and_enter_in_text_field("user_email", text_to_enter);
	}

	@MethodsData(method_id = "text_box_4")
	public void verify_user_email_is_present_on_page() {
		verify.element_is_present("user_email");
	}

	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_user_email(String text_to_enter) {
		element.enter_text("user_email", text_to_enter);
	}

	@MethodsData(method_id = "text_box_2")
	public void clear_text_from_user_password() {
		element.clear_text_field("user_password");
	}

	@MethodsData(method_id = "text_box_3")
	public void clear_text_and_enter_text_in_user_password(String text_to_enter) {
		element.clear_and_enter_in_text_field("user_password", text_to_enter);
	}

	@MethodsData(method_id = "text_box_4")
	public void verify_user_password_is_present_on_page() {
		verify.element_is_present("user_password");
	}

	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_user_password(String text_to_enter) {
		element.enter_text("user_password", text_to_enter);
	}

	@MethodsData(method_id = "button_1")
	public void verify_user_tab_is_present_on_page() {
		verify.element_is_present("user_tab");
	}

	@MethodsData(method_id = "button_2")
	public void verify_user_tab_is_clickable() {
		verify.element_is_enable("user_tab");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_user_tab() {
		element.click("user_tab");
		wait.wait_for_second(5);
	}

	@MethodsData(method_id = "button_4")
	public void Verify_user_tab_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("user_tab", button_text);
	}

	@MethodsData(method_id = "button_1")
	public void verify_user_role_dropdown_is_present_on_page() {
		verify.element_is_present("user_role_dropdown");
	}

	@MethodsData(method_id = "button_2")
	public void verify_user_role_dropdown_is_clickable() {
		verify.element_is_enable("user_role_dropdown");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_user_role_dropdown() throws InterruptedException {

		element.click("user_role_dropdown");
	wait.wait_for_second(3);
	}

	@MethodsData(method_id = "button_4")
	public void Verify_user_role_dropdown_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("user_role_dropdown", button_text);
	}

	@MethodsData(method_id = "text_box_2")
	public void clear_text_from_user_name() {
		element.clear_text_field("user_name");
	}

	@MethodsData(method_id = "text_box_3")
	public void clear_text_and_enter_text_in_user_name(String text_to_enter) {
		element.clear_and_enter_in_text_field("user_name", text_to_enter);
	}

	@MethodsData(method_id = "text_box_4")
	public void verify_user_name_is_present_on_page() {
		verify.element_is_present("user_name");
	}

	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_user_name(String text_to_enter) {
		element.enter_text("user_name", text_to_enter);
	}

	@MethodsData(method_id = "button_1")
	public void verify_user_developer_role_is_present_on_page() {
		verify.element_is_present("user_developer_role");
	}

	@MethodsData(method_id = "button_2")
	public void verify_user_developer_role_is_clickable() {
		verify.element_is_enable("user_developer_role");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_user_developer_role() {
		element.click("user_developer_role");
	}

	@MethodsData(method_id = "button_4")
	public void Verify_user_developer_role_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("user_developer_role", button_text);
	}

	@MethodsData(method_id = "button_1")
	public void verify_user_create_button_is_present_on_page() {
		verify.element_is_present("user_create_button");
	}

	@MethodsData(method_id = "button_2")
	public void verify_user_create_button_is_clickable() {
		verify.element_is_enable("user_create_button");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_user_create_button() {
		element.click("user_create_button");
	}

	@MethodsData(method_id = "button_4")
	public void Verify_user_create_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("user_create_button", button_text);
	}

	@MethodsData(method_id = "text_1")
	public void verify_new_user_title_text_is_equal_to(String button_text) throws InterruptedException {
base.		driver.wait(6000);
		verify.element_text_is_equal_to("new_user_title", button_text);
	}

	@MethodsData(method_id = "button_1")
	public void verify_user_support_staff_role_is_present_on_page() {
		verify.element_is_present("user_support_staff_role");
	}

	@MethodsData(method_id = "button_2")
	public void verify_user_support_staff_role_is_clickable() {
		verify.element_is_enable("user_support_staff_role");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_user_support_staff_role() {
		element.click("user_support_staff_role");
	}

	@MethodsData(method_id = "button_4")
	public void Verify_user_support_staff_role_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("user_support_staff_role", button_text);
	}

	@MethodsData(method_id = "text_1")
	public void verify_user_management_title_text_is_equal_to(String button_text) {
		wait.wait_for_second(5);
		verify.element_text_is_equal_to("user_management_title", button_text);
	}

	@MethodsData(method_id = "button_1")
	public void verify_user_default_role_is_present_on_page() {
		verify.element_is_present("user_default_role");
	}

	@MethodsData(method_id = "button_2")
	public void verify_user_default_role_is_clickable() {
		verify.element_is_enable("user_default_role");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_user_default_role() {
		element.click("user_default_role");
	}

	@MethodsData(method_id = "button_4")
	public void Verify_user_default_role_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("user_default_role", button_text);
	}

	@MethodsData(method_id = "button_1")
	public void verify_user_operation_admin_role_is_present_on_page() {
		verify.element_is_present("user_operation_admin_role");
	}

	@MethodsData(method_id = "button_2")
	public void verify_user_operation_admin_role_is_clickable() {
		verify.element_is_enable("user_operation_admin_role");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_user_operation_admin_role() {
		element.click("user_operation_admin_role");
	}

	@MethodsData(method_id = "button_4")
	public void Verify_user_operation_admin_role_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("user_operation_admin_role", button_text);
	}

	@MethodsData(method_id = "button_1")
	public void verify_user_client_role_is_present_on_page() {
		verify.element_is_present("user_client_role");
	}

	@MethodsData(method_id = "button_2")
	public void verify_user_client_role_is_clickable() {
		verify.element_is_enable("user_client_role");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_user_client_role() {
		element.click("user_client_role");
	}

	@MethodsData(method_id = "button_4")
	public void Verify_user_client_role_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("user_client_role", button_text);
	}

	@MethodsData(method_id = "text_1")
	public void verify_success_message_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("success_message", button_text);
	}

	@MethodsData(method_id = "text_box_2")
	public void clear_text_from_user_phone() {
		element.clear_text_field("user_phone");
	}

	@MethodsData(method_id = "text_box_3")
	public void clear_text_and_enter_text_in_user_phone(String text_to_enter) {
		element.clear_and_enter_in_text_field("user_phone", text_to_enter);
	}

	@MethodsData(method_id = "text_box_4")
	public void verify_user_phone_is_present_on_page() {
		verify.element_is_present("user_phone");
	}

	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_user_phone(String text_to_enter) {
		element.enter_text("user_phone", text_to_enter);
	}

	@MethodsData(method_id = "text_box_2")
	public void clear_text_from_role_search_box() {
		element.clear_text_field("role_search_box");
	}

	@MethodsData(method_id = "text_box_3")
	public void clear_text_and_enter_text_in_role_search_box(String text_to_enter) {
		element.clear_and_enter_in_text_field("role_search_box", text_to_enter);
	}

	@MethodsData(method_id = "text_box_4")
	public void verify_role_search_box_is_present_on_page() {
		verify.element_is_present("role_search_box");
	}

	@MethodsData(method_id = "text_box_1")
	public void enter_text_at_role_search_box(String text_to_enter) {
		element.enter_text("role_search_box", text_to_enter);
	}

	@MethodsData(method_id = "button_1")
	public void verify_new_user_button_is_present_on_page() {
		verify.element_is_present("new_user_button");
	}

	@MethodsData(method_id = "button_2")
	public void verify_new_user_button_is_clickable() {
		verify.element_is_enable("new_user_button");
	}

	@MethodsData(method_id = "button_3")
	public void click_on_new_user_button() {
		element.click("new_user_button");
	}

	@MethodsData(method_id = "button_4")
	public void Verify_new_user_button_text_is_equal_to(String button_text) {
		verify.element_text_is_equal_to("new_user_button", button_text);
	}
	@MethodsData(method_id = "button_1")
	public void verify_mapping_label_button_is_present_on_page() {
		verify.element_is_present("client_mapping_no");
	}
}