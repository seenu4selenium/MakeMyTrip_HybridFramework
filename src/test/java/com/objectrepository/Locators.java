package com.objectrepository;

import org.openqa.selenium.By;

//Locators
public class Locators {

	// public final By pageName_attributeName_TypeofAttribute = By.xpath("asdfds");

	public final By flight_oneway_From = By.id("fromCity");
	public final By flight_oneway_From_editbox = By.xpath("//*[@placeholder='From']");
	public final By flight_oneway_From_Station = By.xpath(
			"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/div/div/ul/li[1]/div/div[1]/p[1]");
	public final By flight_oneway_To_editbox = By.xpath("//*[@placeholder='To']");
	public final By flight_oneway_To_Station = By.xpath(
			"/html/body/div[1]/div/div[2]/div/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/div/div[1]/ul/li/div/div[1]/p[1]");
	public final By flight_oneway_departureDate = By.xpath("(//*[text()='30'])[1]");
	public final By flight_CalenderNextMonth_ArrowMark = By.xpath("//span[@aria-label='Next Month']");
	public final By flight_oneway_travellers = By.xpath("//p[@data-cy='travellerText']");
	public final By flight_oneway_travellers_Adults2 = By.xpath("//li[@data-cy='adults-2']");
	public final By flight_oneway_travellers_Apply_Button = By.xpath("//button[@data-cy='travellerApplyBtn']");
	public final By flight_oneway_Search = By.xpath("//a[text()='Search']");

	// round trip locators
	public final By flight_roundtrip_radiobutton = By.xpath("//li[@data-cy='roundTrip']");
	public final By flight_RoundTrip_returnDate = By.xpath("//*[text()='28']");
	public final By flight_RoundTrip_travellers = By.xpath("//span[@data-cy='travellerText']");

	// Multi city locators
	public final By flight_multicity_radiobutton = By.xpath("//li[@data-cy='mulitiCityTrip']");
	
	

}
