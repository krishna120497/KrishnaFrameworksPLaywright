package VerSteps;

import VermeerPOM.RMTPage;
import io.cucumber.java.en.*;

public class RMT_Steps extends RMTPage{
	
	@Given("Admin enters an inventory in Serach box and select perform RMT")
	public void admin_enters_an_inventory_in_serach_box_and_select_perform_rmt() {
		login();
	}

	@When("Enters Required feilds of Transfer Details page")
	public void enters_required_feilds_of_transfer_details_page() {
		inventory_Serach_box();
	}

	@Then("Submit It")
	public void submit_it() {
		submit();
	    
	}

}
