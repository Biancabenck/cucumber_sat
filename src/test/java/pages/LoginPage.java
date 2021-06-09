package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.ConfigReader;
import utilities.Driver;

public class LoginPage {

	public LoginPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}

	@FindBy(id = "txtUsername")
	public WebElement usernameBox;

	@FindBy(id = "txtPassword")
	public WebElement passwordBox;

	@FindBy(id = "btnLogin")
	public WebElement LoginButton;

	@FindBy(xpath = "//*[@id=\"content\"]/div/div[1]/h1")
	public WebElement dashboardMessage;

	// -------------- invalid login

	@FindBy(xpath = "//*[@id=\"spanMessage\"]")
	public WebElement invalidMessage;

	// --------------- methods

	public void login() {
		usernameBox.sendKeys(ConfigReader.getProperty("username"));
		passwordBox.sendKeys(ConfigReader.getProperty("password"));
	}
	
	public void InvalidLogin(String username, String password) {
		usernameBox.sendKeys(username);
		passwordBox.sendKeys(password);
		LoginButton.click();
		
	}

	public void button() {
		LoginButton.click();
	}

	public void dashboard() {
		String expected = dashboardMessage.getText();
		Assert.assertEquals(expected, "Dashboard");
	}

}
