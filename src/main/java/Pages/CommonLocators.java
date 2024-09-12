package Pages;

import com.microsoft.playwright.Locator;

import Utils.PlaywrightDriver;

public class CommonLocators extends PlaywrightDriver{
	
	public static ThreadLocal<CommonLocators> commonLocators=new ThreadLocal<CommonLocators>();
	
	public Locator ClaimTypeDropValue(String ClaimType) {
		return page.locator("//span[text()='"+ClaimType+"']/parent::span");
	}
	
	
	public CommonLocators() {
		commonLocators.set(new CommonLocators());
	}
}
