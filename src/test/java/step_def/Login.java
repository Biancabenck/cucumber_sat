package step_def;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class Login {
	LoginPage lp = new LoginPage();
	
	@Given("User is at the login page")
	public void user_is_at_the_login_page() {
		Driver.getDriver().get(ConfigReader.getProperty("url"));
		Driver.getDriver().manage().window().maximize();
		Driver.getDriver().manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	}

	@When("User enters a valid username and password")
	public void user_enters_a_valid_username_and_password() {
		lp.login();
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		lp.button();
	}

	@Then("User should be able to verify dashboard text")
	public void user_should_be_able_to_verify_dashboard_text() {
		lp.dashboard();
	}


}
