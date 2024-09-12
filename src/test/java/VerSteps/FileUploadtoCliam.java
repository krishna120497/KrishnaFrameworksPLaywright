package VerSteps;

import VermeerPOM.FileuploadClaimPage;
import io.cucumber.java.en.*;

public class FileUploadtoCliam extends FileuploadClaimPage {
	@Given("Login as Admin")
	public void login_as_admin() {
		login();
	}

	@When("User enters an claim in SerachBox")
	public void user_enters_an_inventory_in_serach_box() {
		inventory_Serach_box();

	}

	@Then("Verify user able upload the files.")
	public void verify_user_able_upload_the_files() {
		verifyUploads();
	}

}
