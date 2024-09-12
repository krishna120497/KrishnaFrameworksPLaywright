package VermeerPOM;

import Base.BasePage;

public class RMTPage extends BasePage {
	public void login() {
		OpenPage("UAT_url");
		Page_Load(1000);
		User_Name("UN_txt_xpath", "UAT_username");
		Page_Load(1000);
		PassWord("PWD_txt_xpath", "UAT_password");
		Page_Load(1000);
		Click_Button("login_button_xpath");
		Page_Load(10000);

	}

	public void inventory_Serach_box() {

		Click_Button("Gloabl_Search");
		Page_Load(2000);
		TextField("PMSearch_inventory", "WR_Inventory");
		Page_Load(2000);
		keybaord_ArrowDown();
		Page_Load(1000);
		Enter();
		Page_Load(1000);
		Click_Button("Dropdownbutton");
		Page_Load(1000);
		Click_Button("performRMT");
		Page_Load(5000);
		Text_field("Servicing_Dealer", "%%%");
		Page_Load(5000);
		keybaord_ArrowDown();
		Page_Load(1000);
		keybaord_ArrowDown();
		Page_Load(1000);
		Enter();
		Page_Load(5000);
		Date_selector("transfer_date", "Aug 16, 2024");
		Page_Load(2000);

	}
	public void submit() {
		Click_Button("submitRMT");
		Page_Load(10000);
	}

}
