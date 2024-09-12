package VermeerPOM;

import Base.BasePage;

public class WRPage extends BasePage {
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
		TextField("Search_value", "WR_Inventory");
		Page_Load(2000);
		keybaord_ArrowDown();
		Page_Load(1000);
		Enter();
		Page_Load(1000);
		Click_Button("WR_button");
		Page_Load(10000);
		
	}
	public void Basic_information() {
		clear("Units_Usage");
		Page_Load(2000);
		Text_field("Units_Usage", "0");
		Page_Load(2000);
		clear("Registration_Date");
		Page_Load(2000);
		Text_field("Registration_Date","Jul 31, 2024");
		Page_Load(2000);
		clear("First_Use_Date");
		Page_Load(2000);
		Text_field("First_Use_Date","Aug 01, 2024");
		Page_Load(2000);
		clear("Retail_Sale_Date");
		Page_Load(2000);
		Text_field("Retail_Sale_Date","Jul 31, 2024");
		Page_Load(2000);
		Registration_Type_dropdown("Rental");
		Page_Load(2000);
		Text_field("Sales_Person", "Jack");
		Page_Load(2000);
		Click_Button("save&next");
		Page_Load(5000);
		
	}
	public void Customer_information() {
		shift_action("Customer", "%%%");
		Page_Load(2000);
		keybaord_ArrowDown();
		keybaord_ArrowDown();
		Enter();
		Page_Load(5000);
		Click_Button("next");
		Page_Load(5000);
		Click_Button("trade_next");
		Page_Load(5000);
		Click_Button("component_next");
		Page_Load(5000);
		Click_Button("attached_next");
		Page_Load(5000);		
	}
	public void submit() {
		Page_Load(5000);
		Click_Button("Review_save");
		Page_Load(10000);
		Click_Button("submitt");
	}
	

}
