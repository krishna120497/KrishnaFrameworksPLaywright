package Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class PlaywrightDriver {
	public static PlaywrightDriver playwrightDriver;
	public Playwright playwright;
	public Browser browser;
	public Page page;
	public static Properties prop = new Properties();
	public static Properties config = new Properties();
	public static Properties data = new Properties();
	public static Properties logs = new Properties();
	private static FileInputStream fis;
	

	private static ThreadLocal<Playwright> pw = new ThreadLocal<Playwright>();
	private static ThreadLocal<Browser> br = new ThreadLocal<Browser>();
	private static ThreadLocal<Page> pg = new ThreadLocal<Page>();

	public static Playwright getPlaywright() {
		return pw.get();

	}

	public static Browser getBrowser() {
		return br.get();

	}

	public static Page getPage() {
		return pg.get();

	}

	
	

	public PlaywrightDriver() {
		try {
			fis = new FileInputStream("src/main/resources/properties/prop.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			prop.load(fis);
		//	log.info("Prop properties file loaded");
		} catch (IOException e) {
			e.printStackTrace();
		}

		try {
			fis = new FileInputStream("src/main/resources/properties/config.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			config.load(fis);
		//	log.info("Prop properties file loaded");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fis = new FileInputStream("src/main/resources/properties/data.properties");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			data.load(fis);
	    //	log.info("Prop properties file loaded");
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			fis = new FileInputStream("./Log4j.properties");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			logs.load(fis);
	 //   	log.info("Loggers properties file loaded");
		} catch (IOException e) {
			e.printStackTrace();
		}

		playwright = Playwright.create();
		pw.set(playwright);

		if (config.getProperty("browser").equalsIgnoreCase("chrome")) {
			browser = getPlaywright().chromium().launch(new BrowserType.LaunchOptions().setChannel("chrome")
					.setHeadless(false).setArgs(List.of("--start-maximized")));
		//	log.info(browser + "Browser suscusfully launched with maximized screen");
		} else if (config.getProperty("browser").equalsIgnoreCase("firefox")) {
			browser = getPlaywright().firefox().launch(new BrowserType.LaunchOptions().setChannel("firefox")
					.setHeadless(false).setArgs(List.of("--start-maximized")));
		//	log.info(browser + "Browser suscusfully launched with maximized screen");
		}

		br.set(browser);
		page = getBrowser().newContext(new Browser.NewContextOptions().setViewportSize(null)).newPage();
		pg.set(page);
		

	}

	public static void setUpDriver() {
		playwrightDriver = new PlaywrightDriver();
	}
	
	
	public static void closeBrowser() {
		getBrowser().close();
		getPage().close();
		//log.info("browser and page closed sucssfully");
	}

	public static void quitplayWrite() {
		if (getPage() != null) {
			getPlaywright().close();
	//		log.info("Playwright and browser object closed sucssfully");
		}
	}
	
	

}
