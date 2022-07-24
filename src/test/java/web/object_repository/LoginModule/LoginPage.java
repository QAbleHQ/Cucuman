package web.object_repository.LoginModule;

import io.unity.framework.generators.methodsgenerator.methods.MethodsData;
import io.unity.framework.init.base;
import io.unity.performaction.autoweb.Element;
import io.unity.performaction.autoweb.Verify;
import io.unity.performaction.autoweb.Wait;

public class LoginPage  {

    Element element = null;
    Verify verify = null;
    Wait wait = null;


    public LoginPage() {
        element = new Element(base.driver);
        verify = new Verify(base.driver);
        wait = new Wait(base.driver);
    }


    @MethodsData(method_id = "button_1")
    public void verify_Sign_in_button_is_present_on_page() {
        verify.element_is_present("Sign_in_button");
    }

    @MethodsData(method_id = "button_2")
    public void verify_Sign_in_button_is_clickable() {
        verify.element_is_enable("Sign_in_button");
    }

    @MethodsData(method_id = "button_3")
    public void click_on_Sign_in_button() {
        element.click("Sign_in_button");

    }

    @MethodsData(method_id = "button_4")
    public void Verify_Sign_in_button_text_is_equal_to(String button_text) {

        verify.element_text_is_equal_to("Sign_in_button", button_text);
    }

    @MethodsData(method_id = "text_1")
    public void verify_User_name_text_is_equal_to(String button_text) {

        verify.element_text_is_equal_to("User_name", button_text);
    }

    @MethodsData(method_id = "text_box_2")
    public void clear_text_from_Password_textbox() {

        element.clear_text_field("Password_textbox");
    }

    @MethodsData(method_id = "text_box_3")
    public void clear_text_and_enter_text_in_Password_textbox(String text_to_enter) {

        element.clear_and_enter_in_text_field("Password_textbox", text_to_enter);
    }

    @MethodsData(method_id = "text_box_4")
    public void verify_Password_textbox_is_present_on_page() {
        verify.element_is_present("Password_textbox");
    }

    @MethodsData(method_id = "text_box_1")
    public void enter_text_at_Password_textbox(String text_to_enter) {

        element.enter_text("Password_textbox", text_to_enter);
    }

    @MethodsData(method_id = "link_1")
    public void verify_Tracking_page_is_present_on_page() {
        wait.wait_until_element_is_visible("Tracking_page");
        wait.wait_for_second(5);
        verify.element_is_present("Tracking_page");
    }

    @MethodsData(method_id = "link_2")
    public void Verify_Tracking_page_text_is_equal_to(String button_text) {

        verify.element_text_is_equal_to("Tracking_page", button_text);
    }

    @MethodsData(method_id = "link_3")
    public void verify_Tracking_page_is_clickable() {
        verify.element_is_enable("Tracking_page");
    }

    @MethodsData(method_id = "link_4")
    public void click_on_Tracking_page() {

        element.click("Tracking_page");
    }

    @MethodsData(method_id = "text_box_2")
    public void clear_text_from_Email_textbox() {

        element.clear_text_field("Email_textbox");
    }

    @MethodsData(method_id = "text_box_3")
    public void clear_text_and_enter_text_in_Email_textbox(String text_to_enter) {

        element.clear_and_enter_in_text_field("Email_textbox", text_to_enter);
    }

    @MethodsData(method_id = "text_box_4")
    public void verify_Email_textbox_is_present_on_page() {

        verify.element_is_present("Email_textbox");
    }

    @MethodsData(method_id = "text_box_1")
    public void enter_text_at_Email_textbox(String text_to_enter) {

        element.enter_text("Email_textbox", text_to_enter);
    }
}