package org.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelType extends BaseClass{
	
public SelectHotelType(){
	PageFactory.initElements(d, this);
	}

@FindBy(id="radiobutton_0")
private WebElement Button0;

@FindBy(id="continue")
private WebElement Continue;


public WebElement getButton0() {
	return Button0;
}

public WebElement getContinue() {
	return Continue;
}





}
