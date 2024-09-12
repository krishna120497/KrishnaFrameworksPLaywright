package VermeerPOM;

import java.nio.file.Paths;

import com.microsoft.playwright.Page;

import Base.BasePage;

public class FileuploadClaimPage extends BasePage {
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
		Text_field("PMSearch_inventory", "0001304222");
		Page_Load(2000);
		keybaord_ArrowDown();
		Page_Load(1000);
		Enter();
		Page_Load(5000);
		MultipleFileUpload("./TEST1.txt", "./test2");
		Page_Load(5000);

	}

	public void verifyUploads() {
		page.waitForPopup(() -> {
			String text = page.locator("//h1[contains(text(),'Upload Files')]").innerText();
			if (text.equalsIgnoreCase("Upload Files")) {
				page.screenshot(new Page.ScreenshotOptions()
					      .setPath(Paths.get("./target/Filescreenshot-${new Date().toDateString()}.png"))
					      .setFullPage(true));
				Click_Button("//span[contains(text(),'Done')]");
			};
		});
		page.screenshot(new Page.ScreenshotOptions()
			      .setPath(Paths.get("./target/Filescreenshot-${new Date().toDateString()}.png"))
			      .setFullPage(true));

	}

}
