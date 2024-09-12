package VerSteps;

import VermeerPOM.MachineClaimPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MachieclaimTest extends MachineClaimPage {
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		Login_to_Application();
	}

	@When("Dealer enters an inventory in Serach box")
	public void dealer_enters_an_inventory_in_serach_box() {
		Enter_Inventory();

	}

	@And("Enters a value for all the required field")
	public void enters_a_value_for_all_the_required_feild() {
		create_machine_calim();
		parts_page();
		Labour_page();

	}

	@Then("click on validate")
	public void click_on_validate() {
		validate_the_claim();
	}

	@And("submit the New claim")
	public void submit_the_newcalim() {
		submit_the_claim();
	}

}
