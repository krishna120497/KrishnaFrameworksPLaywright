package VermeerPOM;

import Base.BasePage;

public class SRC_pages extends BasePage {
	 public void login() {
		OpenPage("UAT_url");
		Page_Load(1000);
		User_Name("UN_txt_xpath", "UAT_username");
		Page_Load(1000);
		PassWord("PWD_txt_xpath", "UAT_password");
		Page_Load(1000);
		Click_Button("login_button_xpath");
		Page_Load(10000);
		Click_Button("AppLauncher");
		Page_Load(1000);
		Text_field("App_Serach_Feild", "Supplier Recovery Claim");
		Page_Load(3000);
		Click_Button("(//p/b[contains(text(),'Supplier Rec')])[2]");
		Page_Load(10000);
		Click_Button("SRC_claim_number");
		Page_Load(10000);
	}
	
	 public void Warrenty_claim_number() {
		Click_Button("warrenty_claim_number");
		Page_Load(2000);
		Click_Button("drop");
		Page_Load(2000);
		Click_Button("Initiate_Supplier_Claim");
		Page_Load(10000);
		Click_Button("remove_claim_part");
		Page_Load(2000);
		Click_Button("Eligible_Contract_List");
		Page_Load(2000);
			
	}
	 public void submit() {
		Click_Button("Create_claim");
		Page_Load(10000);
	}
	

}
