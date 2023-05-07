package org.pages;

import java.awt.AWTException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(d, this);
	}

	@FindBy(name = "location")
	private WebElement LocationName;

	@FindBy(name = "hotels")
	private WebElement HotelName;

	@FindBy(name = "room_type")
	private WebElement RoomType;

	@FindBy(id = "room_nos")
	private WebElement RoomNum;

	@FindBy(id = "datepick_in")
	private WebElement datepick_in;

	@FindBy(id = "datepick_out")
	private WebElement datepick_out;

	@FindBy(name = "adult_room")
	private WebElement AdultPerRoom;

	@FindBy(name = "child_room")
	private WebElement ChildPerRoom;

	@FindBy(id = "Submit")
	private WebElement Submit;

	public WebElement getLocationName(String text) {
		Select s = new Select(LocationName);
		s.selectByVisibleText(text);
		return LocationName;
	}

	public WebElement getHotelName(String text) {
		Select s = new Select(HotelName);
		s.selectByVisibleText(text);
		return HotelName;
	}

	public WebElement getRoomType(String text) {
		Select s = new Select(RoomType);
		s.selectByVisibleText(text);
		return RoomType;
	}

	public WebElement getRoomNum(String text) {
		Select s = new Select(RoomNum);
		s.selectByVisibleText(text);
		return RoomNum;
	}

	public WebElement getDatepick_in(String text) throws AWTException {
		Click(datepick_in);
		datepick_in.clear();
		datepick_in.sendKeys(text);

		return datepick_in;
	}

	public WebElement getDatepick_out(String text) throws AWTException {
		Click(datepick_out);
		datepick_out.clear();
		datepick_out.sendKeys(text);

		return datepick_out;
	}

	public WebElement getAdultPerRoom(String text) {
		Select s = new Select(AdultPerRoom);
		s.selectByVisibleText(text);
		return AdultPerRoom;
	}

	public WebElement getChildPerRoom(String text) {
		Select s = new Select(ChildPerRoom);
		s.selectByVisibleText(text);
		return ChildPerRoom;
	}

	public WebElement getSubmit() {
		return Submit;
	}

}
