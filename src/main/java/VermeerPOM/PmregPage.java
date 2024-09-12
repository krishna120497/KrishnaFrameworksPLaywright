package VermeerPOM;

import Base.BasePage;

public class PmregPage extends BasePage {

	public void inventory_Serach_box() {
		OpenPage("UAT_url");
		Page_Load(1000);
		User_Name("UN_txt_xpath", "UAT_username");
		Page_Load(1000);
		PassWord("PWD_txt_xpath", "UAT_password");
		Page_Load(1000);
		Click_Button("login_button_xpath");
		Page_Load(10000);
		Click_Button("Gloabl_Search");
		Page_Load(2000);
		TextField("PMSearch_inventory", "WR_Inventory");
		Page_Load(2000);
		keybaord_ArrowDown();
		Page_Load(1000);
		Enter();
		Page_Load(1000);
		Click_Button("PMR");
		Page_Load(10000);

	}

	public void Enter_value() {
		Text_field("ContractDate", "Aug 02, 2024");
		Page_Load(2000);
		Text_field("PurchaseDate", "Aug 02, 2024");
		Page_Load(2000);
		Text_field("RegistrationDate", "Aug 01, 2024");
		Page_Load(2000);
		Click_Button("pmNext");
		Page_Load(10000);
	}

	public void select_pm_schedule() {
		Click_Button("chkbox2");
		Page_Load(2000);
		Click_Button("chkbox3");
		Page_Load(2000);
		Click_Button("pmsubmit");
		Page_Load(5000);

	}

}


