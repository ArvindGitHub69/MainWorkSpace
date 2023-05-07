package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class BookAHotel extends BaseClass{

public BookAHotel() {
	PageFactory.initElements(d, this);
	}
	
@FindBy(id="first_name")
private WebElement FirstName;

@FindBy(id="last_name")
private WebElement LastName;

@FindBy(id="address")
private WebElement Address;

@FindBy(id="cc_num")
private WebElement CreditCareNumber;

@FindBy(name="cc_type")
private WebElement CreditCareType;

@FindBy(name="cc_exp_month")
private WebElement CreditCareExpMonth;

@FindBy(name="cc_exp_year")
private WebElement CreditCareExpYear;

@FindBy(id="cc_cvv")
private WebElement CreditCareCVV;

@FindBy(id="book_now")
private WebElement book_now;



public WebElement getFirstName() {
	
	return FirstName;
}

public WebElement getLastName() {
	return LastName;
}

public WebElement getAddress() {
	return Address;
}

public WebElement getCreditCareNumber() {
	return CreditCareNumber;
}

public WebElement getCreditCareType(String text) {
	Select s = new Select(CreditCareType);
	s.selectByVisibleText(text);
	return CreditCareType;
}

public WebElement getCreditCareExpMonth(String text) {
	Select s = new Select(CreditCareExpMonth);
	s.selectByVisibleText(text);
	return CreditCareExpMonth;
}

public WebElement getCreditCareExpYear(String text) {
	Select s = new Select(CreditCareExpYear);
	s.selectByVisibleText(text);
	return CreditCareExpYear;
}

public WebElement getCreditCareCVV() {
	return CreditCareCVV;
}

public WebElement getBook_now() {
	return book_now;
}



	
}
