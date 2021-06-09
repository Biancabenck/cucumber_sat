package step_def;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class InvalidLogin {
	LoginPage lp = new LoginPage();
//
//@Given("User is at login page")
//public void user_is_at_login_page() {
//}

@When("User enters {string} and {string} and click login")
public void user_enters_and_and_click_login(String username, String password) {
	lp.InvalidLogin(username, password);
	
	
}

@Then("User should be able to verify invalid text")
public void user_should_be_able_to_verify_invalid_text() {
	
String message =lp.invalidMessage.getText();
Assert.assertEquals(message, "Invalid credentials");
	
	
	
	
}

}
