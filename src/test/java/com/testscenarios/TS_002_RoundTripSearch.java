package com.testscenarios;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.utilities.ReusableFunctions;

public class TS_002_RoundTripSearch extends ReusableFunctions {
	@BeforeClass
	public void launchBrowser() {
		chromeBrowserLaunch();
	}

	@Test
	public void tc_01_RoundTripSearch() throws Exception {

		getURL("makeMyTrip_URL");
		clickByAnyLocator(loc.flight_roundtrip_radiobutton);		
		
		clickByAnyLocator(loc.flight_oneway_From);
		sendKeysByAnyLocator(loc.flight_oneway_From_editbox, "fromStattion");
		clickByAnyLocator(loc.flight_oneway_From_Station);
		pressTabKey(loc.flight_oneway_From);
		sendKeysByAnyLocator(loc.flight_oneway_To_editbox, "toStation");
		clickByAnyLocator(loc.flight_oneway_To_Station);
		Thread.sleep(3000);
		clickByAnyLocator(loc.flight_oneway_departureDate);	
		Thread.sleep(1000);
		clickByAnyLocator(loc.flight_CalenderNextMonth_ArrowMark);
		Thread.sleep(1000);
		clickByAnyLocator(loc.flight_RoundTrip_returnDate);	
		Thread.sleep(1000);
		clickUsingJavaScript(loc.flight_RoundTrip_travellers);
		clickByAnyLocator(loc.flight_oneway_travellers_Adults2);
		clickByAnyLocator(loc.flight_oneway_travellers_Apply_Button);
		clickByAnyLocator(loc.flight_oneway_Search);
		Thread.sleep(8000);

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
