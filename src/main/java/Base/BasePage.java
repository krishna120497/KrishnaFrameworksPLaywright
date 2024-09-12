package Base;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import org.apache.commons.io.FileUtils;
import org.testng.Assert;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page.TypeOptions;

import Utils.PlaywrightDriver;

public class BasePage extends PlaywrightDriver {

	public Object[][] JasonDataRead(String File_path) throws IOException {
		// read Json to string
		String jsonData = FileUtils.readFileToString(new File(File_path), StandardCharsets.UTF_8);

		// String to Json object conversion
		ObjectMapper mapper = new ObjectMapper();
		List<HashMap<String, String>> data = mapper.readValue(jsonData,
				new TypeReference<List<HashMap<String, String>>>() {
				});
		return new Object[][] { { data.get(0), data.get(1) } };
	}

	public void OpenPage(String URL) {
		try {
			getPage().navigate(config.getProperty(URL));
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

	}

	public void User_Name(String locatorKey, String value) {
		try {
			page.type(PlaywrightDriver.prop.getProperty(locatorKey), PlaywrightDriver.config.getProperty(value),
					new TypeOptions().setDelay(200));
		} catch (Throwable t) {
			t.getMessage();
		}
	}

	public void PassWord(String locatorKey, String value) {
		try {
			page.type(PlaywrightDriver.prop.getProperty(locatorKey), PlaywrightDriver.config.getProperty(value),
					new TypeOptions().setDelay(200));
		} catch (Throwable t) {
			t.getMessage();
		}
	}

	public void Text_field(String locatorKey, String value) {
		try {
			page.type(PlaywrightDriver.prop.getProperty(locatorKey), value, new TypeOptions().setDelay(200));
		} catch (Throwable t) {
			t.getMessage();
		}
	}

	public void Click_Button(String locatorKey) {
		try {
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).click();
		} catch (Throwable t) {
			t.getMessage();
		}
	}

	public void TextField(String locatorKey, String value) {
		try {
			page.type(PlaywrightDriver.prop.getProperty(locatorKey), PlaywrightDriver.data.getProperty(value),
					new TypeOptions().setDelay(200));
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

	public void clear(String locatorKey) {
		try {
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).clear();
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

	public void GlobalSearchClick(String locatorKey) {
		try {
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).click();
			page.keyboard().press("Enter");
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void GlobalSearch(String locatorKey, String value) {
		try {
			Page_Load(1000);
			page.type(PlaywrightDriver.prop.getProperty(locatorKey), PlaywrightDriver.data.getProperty(value),
					new TypeOptions().setDelay(200));
			Page_Load(5000);
			page.keyboard().press("Enter");
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void Warranty_Registration_button(String locatorKey) {
		try {
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).click();
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void New_claim_button(String locatorKey) {
		try {
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).click();
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void keybaord_ArrowDown() {
		try {
			page.keyboard().press("ArrowDown");
			Page_Load(1000);
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void Enter() {
		try {

			Page_Load(1000);
			page.keyboard().press("Enter");
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

	public void shift_action(String locatorKey, String value) {
		try {
			page.type(PlaywrightDriver.prop.getProperty(locatorKey), value, new TypeOptions().setDelay(200));
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

	public void Registration_Type_dropdown(String value) {
		try {
			page.locator("//label[text()='Registration Type']/following::button[@data-value='--None--']").click();
			Page_Load(2000);
			if (value.equalsIgnoreCase("Rental")) {
				page.locator("//span[text()='Rental']/parent::span").click();
			} else if (value.equalsIgnoreCase("Standard Registration")) {
				page.locator("//span[text()='Standard Registration']/parent::span").click();
			} else if (value.equalsIgnoreCase("Planned Maintenance")) {
				page.locator("//span[text()='Planned Maintenance']/parent::span").click();
			} else if (value.equalsIgnoreCase("Extended")) {
				page.locator("//span[text()='Extended']/parent::span").click();
			} else if (value.equalsIgnoreCase("Preowned")) {
				page.locator("//span[text()='Preowned']/parent::span").click();
			} else {
				System.out.println("Please select proper Registration_Type");
			}
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void Claim_Type_dropdown(String value) {

		try {
			page.locator("//span[text()='Claim Type :']/following::button[@data-value='Machine']").click();
			Page_Load(2000);
			if (value.equalsIgnoreCase("Part")) {
				page.locator("//span[text()='Part']/parent::span").click();
			} else if (value.equalsIgnoreCase("Campaign")) {
				page.locator("//span[text()='Campaign']/parent::span").click();
			} else if (value.equalsIgnoreCase("Planned Maintenance")) {
				page.locator("//span[text()='Planned Maintenance']/parent::span").click();
			} else {
				System.out.println(" Plese Select the correct value");
			}

		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

//used for part claim creation
	public void Host_NonHost_dropdown(String value) {
		try {
			page.locator("//label[text()='Host-NonHost']/following::button[@data-value='Installed on OEM machine']")
					.click();
			Page_Load(2000);
			if (value.equalsIgnoreCase("Not Installed")) {
				page.locator("//span[text()='Not Installed']/parent::span").click();
				Page_Load(2000);
				page.locator("//span[text()='--None--']/parent::button[@aria-label='Parts Location']").click();
				Page_Load(1000);
				keybaord_ArrowDown();
			} else if (value.equalsIgnoreCase("Installed on OEM machine")) {
				page.locator("//span[text()='Installed on OEM machine']/parent::span").click();
			}

		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

	public void Save_and_next_button(String locatorKey) {
		try {
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).click();
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

	public void save_button(String locatorKey) {
		try {
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).click();
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void Next_button(String locatorKey) {
		try {
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).click();
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void Submit_button(String locatorKey) {
		try {
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).click();
			;
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

	public void validate_button(String locatorKey) {
		try {
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).click();
			;
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

	public void Date_selector(String locatorKey, String value) {
		try {
			// date_froamt mon-dd-yyyy
			Thread.sleep(1000);
			page.locator(PlaywrightDriver.prop.getProperty(locatorKey)).fill(value);
			Thread.sleep(1000);
			page.keyboard().press("Enter");

		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

	public void navigateBack() {
		try {
			page.goBack();
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void navigateForward() {
		try {
			page.goForward();
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void reload() {
		try {
			page.reload();
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void getCurrentURL() {
		try {
			page.url();
			System.out.println(page.url());
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}

	}

	public void getText(Locator locator) {
		try {
			locator.first().textContent();
		} catch (Throwable t) {
			Assert.fail(t.getMessage());
		}
	}

	public void Page_Load(double time) {
		try {
			page.waitForTimeout(time);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

	}

	public void Current_date() {
		try {
			@SuppressWarnings("unused")
			LocalDate today = LocalDate.now();

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

	}

	public void privous_date(int value) {
		try {
			@SuppressWarnings("unused")
			LocalDate old_date = LocalDate.now().minusDays(value);

		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	public void get_Title() {
		try {
			page.title();
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}

	}

	public void singleFileUpload(String path) {
		try {
			page.setInputFiles("(//span[@part='button'])[1]", Paths.get(path));
			Page_Load(2000);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

	public void MultipleFileUpload(String path1,String path2) {
		try {
			page.setInputFiles("(//span[@part='button'])[1]", new Path[] { Paths.get(path1), Paths.get(path2) });
			Page_Load(2000);
		} catch (Exception e) {
			Assert.fail(e.getMessage());
		}
	}

}
