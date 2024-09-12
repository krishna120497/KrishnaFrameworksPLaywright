package step;

import Pages.PartClaimPage;
import io.cucumber.java.en.*;

public class PartClaimTest extends PartClaimPage {
	@Given("User Login to an application")
	public void User_Login_to_an_application() {	
		Login_to_Application();	
	}

	@When("Dealer enters an inventory in SerachBox")
	public void dealer_enters_an_inventory_in_serach_box() {
		Enter_Inventory();

	}

	@And("Enters a value for all the required Field")
	public void enters_a_value_for_all_the_required_field() {
		create_machine_claim();
		parts_page();
		Labour_page();
	}

	@Then("click on validate button")
	public void click_on_validate_button() {
		validate_the_claim();

	}

	@Then("submit the NewClaim")
	public void submit_the_newcalim() {
		submit_the_claim();
	}

}
