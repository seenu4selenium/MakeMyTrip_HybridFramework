package com.testscenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.ReusableFunctions;

public class TS_003_MultiCitySearch extends ReusableFunctions {
	@BeforeClass
	public void launchBrowser() {
		chromeBrowserLaunch();
	}

	@Test
	public void tc_01_RoundTripSearch() throws Exception {

		getURL("makeMyTrip_URL");
		clickByAnyLocator(loc.flight_multicity_radiobutton);		
		

	}

	@AfterMethod
	public void takescreenshotAfterMethod() throws Exception {
		takeScreenshot("tc_02_onewayflightSearch");
	}

	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}
}
