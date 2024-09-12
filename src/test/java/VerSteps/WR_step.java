package VerSteps;

import VermeerPOM.WRPage;
import io.cucumber.java.en.*;

public class WR_step extends WRPage {
	@Given("Admin is on Login page")
	public void admin_is_on_login_page() {
		login();
	}

	@When("Admin enters an inventory in Serach box")
	public void admin_enters_an_inventory_in_serach_box() {
		inventory_Serach_box();
	}

	@When("Enters Required feilds of Basic Information")
	public void enters_required_feilds_of_basic_information() {
		Basic_information();
	}

	@When("Enters Required feilds of Customer Information")
	public void enters_required_feilds_of_customer_information() {
		Customer_information();

	}

	@Then("click on Review and submit Warranty Registartion")
	public void click_on_review_and_submit_warranty_registartion() {
		submit();
	}

}
