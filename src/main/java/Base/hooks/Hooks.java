package Base.hooks;

import com.microsoft.playwright.Page;

import Utils.PlaywrightDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	public Page page;

	@Before
	public void setUp() {
		PlaywrightDriver.setUpDriver();

	}

	@After
	public void tearDown() {
		PlaywrightDriver.closeBrowser();
		PlaywrightDriver.quitplayWrite();

	}

}
