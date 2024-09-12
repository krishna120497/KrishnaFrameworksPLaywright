package step;

import Base.BasePage;
import io.cucumber.java.en.*;

public class TrimbleLogin extends BasePage {

	@Given("User is on TrimbleLogin page")
	public void loginTest() {
		OpenPage("url");
	}

	@When("User enters username as {string} and password as {string}")
	public void goToHomePage(String userName, String passWord) {
		Text_field("UN_txt_xpath",userName);
		Text_field("PWD_txt_xpath",passWord);
		Click_Button("login_button_xpath");
		

	}

	@Then("User should be able to login sucessfully open homepage")
	public void verifyLogin() {
		System.out.println("sucessfully open homepage");

	}

	@Then("User should be able to see error message {string}")
	public void verifyErrorMessage(String expectedErrorMessage) {
		System.out.println(expectedErrorMessage+"sucessfully not open homepage");
	}

}
