package web.object_repository.AdminModule.ClientManagement;

import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.framework.init.base;
import io.unity.performaction.autoweb.Browser;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;

public class ClientManagement {
    Element element = null;
    Verify verify = null;
    Wait wait = null;
    Browser browser = null;

    public ClientManagement() {
        element = new Element(base.driver);
        verify = new Verify(base.driver);
        wait = new Wait(base.driver);
        browser = new Browser(base.driver);
    }

    @MethodsData(method_id = "link_1")
    public void verify_Admin_tab_is_present_on_page() {
        verify.element_is_present("Admin_tab");
    }

    @MethodsData(method_id = "link_2")
    public void Verify_Admin_tab_text_is_equal_to(String button_text) {
        verify.element_text_is_equal_to("Admin_tab", button_text);
    }

    @MethodsData(method_id = "link_3")
    public void verify_Admin_tab_is_clickable() {
        verify.element_is_enable("Admin_tab");
    }

    @MethodsData(method_id = "link_4")
    public void click_on_Admin_tab() {
        element.click("Admin_tab");
        wait.wait_for_second(1);

    }

    @MethodsData(method_id = "text_box_2")
    public void clear_text_from_client_phone() {
        element.clear_text_field("client_phone");
    }

    @MethodsData(method_id = "text_box_3")
    public void clear_text_and_enter_text_in_client_phone(String text_to_enter) {
        element.clear_and_enter_in_text_field("client_phone", text_to_enter);
    }

    @MethodsData(method_id = "text_box_4")
    public void verify_client_phone_is_present_on_page() {
        verify.element_is_present("client_phone");
    }

    @MethodsData(method_id = "text_box_1")
    public void enter_text_at_client_phone(String text_to_enter) {
        element.enter_text("client_phone", text_to_enter);
    }

    @MethodsData(method_id = "text_1")
    public void verify_client_management_title_text_is_equal_to(String button_text) {
        verify.element_text_is_equal_to("client_management_title", button_text);
    }

    @MethodsData(method_id = "text_box_2")
    public void clear_text_from_client_email() {
        element.clear_text_field("client_email");
    }

    @MethodsData(method_id = "text_box_3")
    public void clear_text_and_enter_text_in_client_email(String text_to_enter) {
        element.clear_and_enter_in_text_field("client_email", text_to_enter);
    }

    @MethodsData(method_id = "text_box_4")
    public void verify_client_email_is_present_on_page() {
        verify.element_is_present("client_email");
    }

    @MethodsData(method_id = "text_box_1")
    public void enter_text_at_client_email(String text_to_enter) {
        element.enter_text("client_email", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void verify_line_business_dropdown_is_present_on_page() {
        verify.element_is_present("line_business_dropdown");
    }

    @MethodsData(method_id = "button_2")
    public void verify_line_business_dropdown_is_clickable() {
        verify.element_is_enable("line_business_dropdown");
    }

    @MethodsData(method_id = "button_3")
    public void click_on_line_business_dropdown() {
        element.click("line_business_dropdown");
    }

    @MethodsData(method_id = "button_4")
    public void Verify_line_business_dropdown_text_is_equal_to(String button_text) {
        verify.element_text_is_equal_to("line_business_dropdown", button_text);
    }

    @MethodsData(method_id = "button_1")
    public void verify_create_new_client_button_is_present_on_page() {
        verify.element_is_present("create_new_client_button");
    }

    @MethodsData(method_id = "button_2")
    public void verify_create_new_client_button_is_clickable() {
        verify.element_is_enable("create_new_client_button");
        wait.wait_for_second(1);
    }

    @MethodsData(method_id = "button_3")
    public void click_on_create_new_client_button() {
        element.click("create_new_client_button");
    }

    @MethodsData(method_id = "button_4")
    public void Verify_create_new_client_button_text_is_equal_to(String button_text) {
        verify.element_text_is_equal_to("create_new_client_button", button_text);
    }

    @MethodsData(method_id = "button_1")
    public void verify_fleet_option_is_present_on_page() {
        verify.element_is_present("fleet_option");
    }

    @MethodsData(method_id = "button_2")
    public void verify_fleet_option_is_clickable() {
        verify.element_is_enable("fleet_option");
    }

    @MethodsData(method_id = "button_3")
    public void click_on_fleet_option() {
        element.click("fleet_option");
    }

    @MethodsData(method_id = "button_4")
    public void Verify_fleet_option_text_is_equal_to(String button_text) {
        verify.element_text_is_equal_to("fleet_option", button_text);
    }

    @MethodsData(method_id = "text_box_2")
    public void clear_text_from_client_address() {
        element.clear_text_field("client_address");
    }

    @MethodsData(method_id = "text_box_3")
    public void clear_text_and_enter_text_in_client_address(String text_to_enter) {
        element.clear_and_enter_in_text_field("client_address", text_to_enter);
    }

    @MethodsData(method_id = "text_box_4")
    public void verify_client_address_is_present_on_page() {
        verify.element_is_present("client_address");
    }

    @MethodsData(method_id = "text_box_1")
    public void enter_text_at_client_address(String text_to_enter) {
        element.enter_text("client_address", text_to_enter);
    }

    @MethodsData(method_id = "text_box_2")
    public void clear_text_from_client_name() {
        element.clear_text_field("client_name");
    }

    @MethodsData(method_id = "text_box_3")
    public void clear_text_and_enter_text_in_client_name(String text_to_enter) {
        element.clear_and_enter_in_text_field("client_name", text_to_enter);
    }

    @MethodsData(method_id = "text_box_4")
    public void verify_client_name_is_present_on_page() {
        verify.element_is_present("client_name");
    }

    @MethodsData(method_id = "text_box_1")
    public void enter_text_at_client_name(String text_to_enter) {
        element.enter_text("client_name", text_to_enter);
    }

    @MethodsData(method_id = "text_box_2")
    public void clear_text_from_client_city() {
        element.clear_text_field("client_city");
    }

    @MethodsData(method_id = "text_box_3")
    public void clear_text_and_enter_text_in_client_city(String text_to_enter) {
        element.clear_and_enter_in_text_field("client_city", text_to_enter);
    }

    @MethodsData(method_id = "text_box_4")
    public void verify_client_city_is_present_on_page() {
        verify.element_is_present("client_city");
    }

    @MethodsData(method_id = "text_box_1")
    public void enter_text_at_client_city(String text_to_enter) {
        element.enter_text("client_city", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void verify_india_option_is_present_on_page() {
        verify.element_is_present("india_option");
    }

    @MethodsData(method_id = "button_2")
    public void verify_india_option_is_clickable() {
        verify.element_is_enable("india_option");
    }

    @MethodsData(method_id = "button_3")
    public void click_on_india_option() {
        element.click("india_option");
    }

    @MethodsData(method_id = "button_4")
    public void Verify_india_option_text_is_equal_to(String button_text) {
        verify.element_text_is_equal_to("india_option", button_text);
    }

    @MethodsData(method_id = "text_box_2")
    public void clear_text_from_client_state() {
        element.clear_text_field("client_state");
    }

    @MethodsData(method_id = "text_box_3")
    public void clear_text_and_enter_text_in_client_state(String text_to_enter) {
        element.clear_and_enter_in_text_field("client_state", text_to_enter);
    }

    @MethodsData(method_id = "text_box_4")
    public void verify_client_state_is_present_on_page() {
        verify.element_is_present("client_state");
    }

    @MethodsData(method_id = "text_box_1")
    public void enter_text_at_client_state(String text_to_enter) {
        element.enter_text("client_state", text_to_enter);
    }

    @MethodsData(method_id = "button_1")
    public void verify_create_button_is_present_on_page() {
        verify.element_is_present("create_button");
    }

    @MethodsData(method_id = "button_2")
    public void verify_create_button_is_clickable() {
        verify.element_is_enable("create_button");
    }

    @MethodsData(method_id = "button_3")
    public void click_on_create_button() {
        element.click("create_button");
    }

    @MethodsData(method_id = "button_4")
    public void Verify_create_button_text_is_equal_to(String button_text) {
        verify.element_text_is_equal_to("create_button", button_text);
    }

    @MethodsData(method_id = "button_1")
    public void verify_country_dropdown_is_present_on_page() {
        verify.element_is_present("country_dropdown");
    }

    @MethodsData(method_id = "button_2")
    public void verify_country_dropdown_is_clickable() {
        verify.element_is_enable("country_dropdown");
    }

    @MethodsData(method_id = "button_3")
    public void click_on_country_dropdown() {
        element.click("country_dropdown");
    }

    @MethodsData(method_id = "button_4")
    public void Verify_country_dropdown_text_is_equal_to(String button_text) {
        verify.element_text_is_equal_to("country_dropdown", button_text);
    }

    @MethodsData(method_id = "text_1")
    public void verify_client_added_message_text_is_equal_to(String button_text) {
        wait.wait_for_second(1);
        verify.element_text_is_equal_to("client_added_message", button_text);
    }

    @MethodsData(method_id = "text_1")
    public void verify_client_name_list_text_is_equal_to(String button_text) {
        verify.element_text_is_equal_to("client_name_list", button_text);
    }

    @MethodsData(method_id = "text_1")
    public void verify_client_name_list_contains(String button_text) {

        browser.refresh_page();
		wait.wait_for_second(3);
        verify.element_text_is_available_in_list("client_name_list", button_text);

    }
}