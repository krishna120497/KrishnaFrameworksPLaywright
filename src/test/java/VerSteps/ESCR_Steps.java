package VerSteps;

import VermeerPOM.ESCR_page;
import io.cucumber.java.en.*;

public class ESCR_Steps extends ESCR_page {
	@Given("Admin enters an inventory in Serach box and select Extended Service Contracts Registration")
	public void admin_enters_an_inventory_in_serach_box_and_select_extended_service_contracts_registration() {
		login();
	}

	@When("Enters Required feilds Purchase Date and Registration Date")
	public void enters_required_feilds_purchase_date_and_registration_date() {
		inventory_Serach_box() ;
	}

	@When("Select Policy Table value and click on next button")
	public void select_policy_table_value_and_click_on_next_button() {
		Enter_value();
	}

	@Then("select Planned Maintenance Packages and Extended Service Contracts Registration submit it")
	public void select_planned_maintenance_packages_and_extended_service_contracts_registration_submit_it() {
		select_pm_schedule();
	}

}
