package org.stepdefinition;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.pages.BaseClass;
import org.pages.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.ta.அப்பொழுது;
import io.cucumber.java.en.Then;

public class Stepdefinition extends BaseClass {

	static PageObjectManager POM = new PageObjectManager();

	@அப்பொழுது("Launch the Browser")
	public void launch_the_browser() {
		LaunchBrowser("Chrome", "https://adactinhotelapp.com/");
		// SugiArvindTMG
		// I21YZU
	}

	@When("User gives the valid User name and Password")
	public void user_gives_the_valid_user_name_and_password() {
		enterText(POM.getHomePage().getUsername(), "SugiArvindTMG");
		enterText(POM.getHomePage().getPassword(), "I21YZU");
	}

	@Then("User should get logged in and navigate to another page.")
	public void user_should_get_logged_in_and_navigate_to_another_page() {
		Click(POM.getHomePage().getLogin());
	}

	@Given("User will wait for the page to load from the hotel Select page")
	public void user_will_wait_for_the_page_to_load_from_the_hotel_select_page() {
		time();
	}

	@When("user will give the first name")
	public void user_will_give_the_first_name() {
		enterText(POM.getBookAHotel().getFirstName(), "Alvin");
	}

	@Then("user will give the last name")
	public void user_will_give_the_last_name() {
		enterText(POM.getBookAHotel().getLastName(), "Chipmunks");
	}

	@Then("user will give the address")
	public void user_will_give_the_address() {
		enterText(POM.getBookAHotel().getAddress(), "123 Blvd Ave, Grover St, Omaha, NE, 68106");
	}

	@Then("user will give the CreditCard Number")
	public void user_will_give_the_credit_card_number() {
		enterText(POM.getBookAHotel().getCreditCareNumber(), "4801 2585 3599 1005");
	}

	@Then("user will give the CrediCard Type")
	public void user_will_give_the_credi_card_type() {
		POM.getBookAHotel().getCreditCareType("VISA");
	}

	@Then("user will give the CrediCard exp month")
	public void user_will_give_the_credi_card_exp_month() {
		POM.getBookAHotel().getCreditCareExpMonth("June");
	}

	@Then("user will give the CrediCard exp year")
	public void user_will_give_the_credi_card_exp_year() {
		POM.getBookAHotel().getCreditCareExpYear("2022");
	}

	@Then("user will give the CrediCard CVV")
	public void user_will_give_the_credi_card_cvv() {
		enterText(POM.getBookAHotel().getCreditCareCVV(), "058");
	}

	@Then("user will click book now")
	public void user_will_clink_book_now() {
		Click(POM.getBookAHotel().getBook_now());
	}

	@Given("User will wait for the page to load from the login page")
	public void user_will_wait_for_the_page_to_load_from_the_login_page() {
		time();
	}

	@When("user will select hotel location")
	public void user_will_select_hotel_location() {
		POM.getSearchHotelPage().getLocationName("Brisbane");
	}

	@Then("user will select which hotel to stay")
	public void user_will_select_which_hotel_to_stay() {
		POM.getSearchHotelPage().getHotelName("Hotel Hervey");
	}

	@Then("user will select the type of room")
	public void user_will_select_the_type_of_room() {
		POM.getSearchHotelPage().getRoomType("Deluxe");
	}

	@Then("user will select the number of rooms")
	public void user_will_select_the_number_of_rooms() {
		POM.getSearchHotelPage().getRoomNum("1 - One");
	}

	@Then("user will select the check in date")
	public void user_will_select_the_check_in_date() throws AWTException {
		POM.getSearchHotelPage().getDatepick_in("01/01/2024");

	}

	@Then("user will select the check out date")
	public void user_will_select_the_check_out_date() {
		try {
			POM.getSearchHotelPage().getDatepick_out("05/01/2024");
		} catch (AWTException e) {

			e.printStackTrace();
		}

	}

	@Then("user will select the Adult per room")
	public void user_will_select_the_adult_per_room() {
		POM.getSearchHotelPage().getAdultPerRoom("2 - Two");
	}

	@Then("user will select if Child present per room")
	public void user_will_select_if_child_present_per_room() {
		POM.getSearchHotelPage().getChildPerRoom("0 - None");
	}

	@Then("user will select Search to  see the list of hotels in the next page")
	public void user_will_select_search_to_see_the_list_of_hotels_in_the_next_page() {
		Click(POM.getSearchHotelPage().getSubmit());
	}

	@Given("User will wait for the page to load from the hotel search page")
	public void user_will_wait_for_the_page_to_load_from_the_hotel_search_page() {
		time();
	}

	@When("user will select hotel button")
	public void user_will_select_hotel_button() {
		Click(POM.getSelectHotelType().getButton0());
	}

	@Then("user will click the continue")
	public void user_will_click_the_continue() {
		Click(POM.getSelectHotelType().getContinue());
	}

	// Print the order ID in console(try using POM implementation),(create POJO for
	// print order and add it in PageObjectManager and call below)
	@Then("the order id will print in the console")
	public void the_order_id_will_print_in_the_console() throws InterruptedException {
		WebElement OrderID = locators("name", "order_no");
		String getatt = getatt(OrderID, "value");
		System.out.println(getatt);
		Thread.sleep(1000l);
		d.quit();
	}
}
