package VerSteps;

import VermeerPOM.C2C_Page;
import io.cucumber.java.en.*;

public class C2C_steps extends C2C_Page {
	@Given("Admin enters an inventory in Serach box and select perform C2C")
	public void admin_enters_an_inventory_in_serach_box_and_select_perform_c2c() {
		login();
	}

	@When("Enters Required feilds of Transfer Details apge")
	public void enters_required_feilds_of_transfer_details_apge() {
		inventory_Serach_box();
	}

	@Then("Check acknowledge checkbox and submit it")
	public void check_acknowledge_checkbox_and_submit_it() {
		VerifyANDsubmit();
	   
	}


}
