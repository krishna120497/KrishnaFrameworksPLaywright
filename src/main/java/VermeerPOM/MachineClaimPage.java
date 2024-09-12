package VermeerPOM;

import Base.BasePage;

public class MachineClaimPage extends BasePage {
	public void Login_to_Application() {
		OpenPage("Dealer_url");
		Page_Load(1000);
		User_Name("UN_txt_xpath", "Dealer_Username");
		Page_Load(1000);
		PassWord("PWD_txt_xpath", "Dealer_Password");
		Page_Load(1000);
		Click_Button("login_button_xpath");
		Page_Load(10000);
	}

	public void Enter_Inventory() {
		Page_Load(10000);
		Click_Button("Search_bar");
		Page_Load(3000);
		GlobalSearch("Search_bar", "Machine_Inventory");
		Page_Load(1000);
		Click_Button("Inventory_link_machine");
		Page_Load(2000);
	}

	public void create_machine_calim() {
		Click_Button("new_claim");
		Page_Load(5000);	
		Click_Button("Search_dealer");
		Page_Load(2000);
		TextField("Search_dealer", "Dealer");
		Page_Load(2000);
		keybaord_ArrowDown();
		Page_Load(5000);
		Text_field("failure_date", "Jul 10, 2024");
		Page_Load(2000);
		Text_field("repair_date", "Jul 11, 2024");
		Page_Load(2000);
		shift_action("casual_part", "%%%");
		Page_Load(1000);
		keybaord_ArrowDown();
		Page_Load(2000);
		Text_field("unit_usage", "100");
		Page_Load(2000);
		Click_Button("save_next_button");
		Page_Load(10000);
	}

	public void parts_page() {
		Click_Button("Add_part");
		Page_Load(2000);
		shift_action("enter_part_number", "%%%");
		Page_Load(1000);
		keybaord_ArrowDown();
		Page_Load(2000);
		Click_Button("click_save");
		Page_Load(2000);
		Click_Button("click_next");
		Page_Load(5000);
	}

	public void Labour_page() {
		Click_Button("Add_job");
		Page_Load(2000);
		shift_action("job_code", "%%%");
		Page_Load(1000);
		keybaord_ArrowDown();
		Page_Load(2000);
		Click_Button("click_save");
		Page_Load(2000);
		Click_Button("next_click");
		Page_Load(5000);
	}

	public void validate_the_claim() {
		Click_Button("Other_cost_next");
		Page_Load(2000);
		Click_Button("click_validate");
		Page_Load(5000);
	}

	public void submit_the_claim() {
		Click_Button("click_submit");
	}

}
