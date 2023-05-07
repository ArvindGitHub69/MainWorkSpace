package org.pages;

public class PageObjectManager {

	private HomePage a;
	private SearchHotelPage s;
	private SelectHotelType se;
	private BookAHotel b;

	

	public PageObjectManager() {
		super();
	}

	public HomePage getHomePage() {
		if(a==null) {
			a = new HomePage();
		}
		return a;
//		return (a == null) ? a = new HomePage() : a;

	}

	public SearchHotelPage getSearchHotelPage() {
		return (s == null) ? s = new SearchHotelPage() : s;

	}

	public SelectHotelType getSelectHotelType() {
		return (se == null) ? se = new SelectHotelType() : se;
	}

	public BookAHotel getBookAHotel() {
		return (b == null) ? b = new BookAHotel() : b;
	}

}
