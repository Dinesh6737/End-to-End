package org.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.step.Hooks;

public class Pojo1 {
	public Pojo1() {
	PageFactory.initElements(Hooks.driver, this);
	}
	@FindBy(xpath="//a[text()='Login']")
	private WebElement log;
	@FindBy(id="cust-email")
	private WebElement email;
	@FindBy(id="verifyEmail")
	private WebElement cont;
	@FindBy(id="cust-pass")
	private WebElement pass;
	@FindBy(xpath="//input[@value='Sign In']")
	private WebElement sign_in;
	@FindBy(xpath="(//a[@title='Dresses'])[4]")
	private WebElement dresses;
	@FindBy(xpath="//a[text()='Bodycon Dresses']")
	private WebElement bodycon_dresses;
	@FindBy(xpath="//p[text()='Embroidered Cold Shoulder Dress ..']")
	private WebElement shoulder_dress;
	@FindBy(xpath="(//img[@class='lazy'])[20]")
	private WebElement cold_click;
	public WebElement getLog() {
		return log;
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getCont() {
		return cont;
	}
	public WebElement getPass() {
		return pass;
	}
	public WebElement getSign_in() {
		return sign_in;
	}
	public WebElement getDresses() {
		return dresses;
	}
	public WebElement getBodycon_dresses() {
		return bodycon_dresses;
	}
	public WebElement getShoulder_dress() {
		return shoulder_dress;
	}
	public WebElement getCold_click() {
		return cold_click;
	}
	
	

}
