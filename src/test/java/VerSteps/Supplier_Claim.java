package VerSteps;

import VermeerPOM.SRC_pages;
import io.cucumber.java.en.*;

public class Supplier_Claim extends SRC_pages {
	@Given("Click on AppLauncher and serach Supplier Recovery Claims")
	public void click_on_app_launcher_and_serach_supplier_recovery_claims() {
		login();
	   
	}

	@When("select the VIN\\/PIN and select Initiate Supplier Claim")
	public void select_the_vin_pin_and_select_initiate_supplier_claim() {
	    Warrenty_claim_number();
	}

	@Then("Enter the Required feild value and Submit It")
	public void enter_the_required_feild_value_and_submit_it() {
	   submit();
	}


}
