package com.testscenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.ReusableFunctions;

public class TS_001_OnewaySearch extends ReusableFunctions {
	@BeforeClass
	public void launchBrowser() {
		chromeBrowserLaunch();
	}

	@Test
	public void tc_001_onewayflightSearch() throws Exception {

		getURL("makeMyTrip_URL");
		clickByAnyLocator(loc.flight_oneway_From);
		sendKeysByAnyLocator(loc.flight_oneway_From_editbox, "fromStattion");
		clickByAnyLocator(loc.flight_oneway_From_Station);
		pressTabKey(loc.flight_oneway_From);
		sendKeysByAnyLocator(loc.flight_oneway_To_editbox, "toStation");
		clickByAnyLocator(loc.flight_oneway_To_Station);
		clickByAnyLocator(loc.flight_oneway_departureDate);
		clickUsingJavaScript(loc.flight_oneway_travellers);
		clickByAnyLocator(loc.flight_oneway_travellers_Adults2);
		clickByAnyLocator(loc.flight_oneway_travellers_Apply_Button);
		clickByAnyLocator(loc.flight_oneway_Search);
		Thread.sleep(80000);

	}

	@AfterMethod
	public void takescreenshotAfterMethod() throws Exception {
		takeScreenshot("tc_001_onewayflightSearch");
	}

	@AfterClass
	public void closeTheBrowser() {
		driver.quit();
	}
}
