package VerSteps;

import VermeerPOM.PmregPage;
import io.cucumber.java.en.*;

public class Pm_RegStep extends PmregPage {
	@Given("Admin enters an inventory in Serach box and select PM Registartion")
	public void admin_enters_an_inventory_in_Serach_box_and_select_PM_Registartion() {
		inventory_Serach_box();
	}

	@When("Enters Required feilds Contract Date ,Purchase Date and Registration Date")
	public void enters_required_feilds_contract_date_purchase_date_and_registration_date() {
		Enter_value();

	}

	@Then("click on next button ,select Planned Maintenance Packages and submit it")
	public void click_on_next_button_select_planned_maintenance_packages_and_submit_it() {
		select_pm_schedule();

	}

}
