package org.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.step.Hooks;

public class Pojo2 {
	public Pojo2() {
		PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath="//*[@id=\"wrapper\"]/div[4]/div/div[2]/div[2]/div[1]/ul/li[3]/a")
	private WebElement size;
	@FindBy(xpath="//a[text()='Add to Bag']")
	private WebElement add;
	@FindBy(xpath="//div[@class='headBagitem']")
	private WebElement bag;
	@FindBy(xpath="//a[text()='Place Order']")
	private WebElement place_order;
	@FindBy(xpath="//input[@value='Deliver to this address']")
	private WebElement deliver_address;
	@FindBy(id="card_number")
	private WebElement id;
	@FindBy(id="card_name")
	private WebElement card_name;
	@FindBy(id="card_expiry")
	private WebElement card_expiry;
	@FindBy(id="card_cvv")
	private WebElement cvv;
	@FindBy(xpath="//img[@src='/images/logo.png']")
	private WebElement faballey;
	@FindBy(xpath="//i[@class='fa fa-caret-down']")
	private WebElement drop_down;
	@FindBy(xpath="//a[text()='LogOut']")
	private WebElement logout;
	public WebElement getSize() {
		return size;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getBag() {
		return bag;
	}
	public WebElement getPlace_order() {
		return place_order;
	}
	public WebElement getDeliver_address() {
		return deliver_address;
	}
	public WebElement getId() {
		return id;
	}
	public WebElement getCard_name() {
		return card_name;
	}
	public WebElement getCard_expiry() {
		return card_expiry;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getFaballey() {
		return faballey;
	}
	public WebElement getDrop_down() {
		return drop_down;
	}
	public WebElement getLogout() {
		return logout;
	}
	
	
	

}
