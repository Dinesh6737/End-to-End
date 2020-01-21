package org.step;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.objectrepository.Pojo1;
import org.objectrepository.Pojo2;
import org.openqa.selenium.interactions.Actions;
import org.resources.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition extends BaseClass {
	Pojo1 p1= new Pojo1();
	
	@Given("click the login button and enter the valid credentials")
	public void click_the_login_button_and_enter_the_valid_credentials(io.cucumber.datatable.DataTable dataTable) {
	
		launch("https://www.faballey.com/");
		Hooks.driver.manage().window().maximize();
		press(p1.getLog());
		List<String> li = dataTable.asList(String.class);
		type(p1.getEmail(), li.get(0));
		press(p1.getCont());
		type(p1.getPass(),li.get(1));
		press(p1.getSign_in());
	}
	

	@When("Go to dresses and click Bodycon Dresses")
	public void go_to_dresses_and_click_Bodycon_Dresses() {
		Actions a = new Actions(Hooks.driver);
		a.moveToElement(p1.getDresses()).perform();
		p1.getBodycon_dresses().click();
		
	
	}

	@When("scroll down and click any product")
	public void scroll_down_and_click_any_product() {
		
	Hooks.driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		scroll(p1.getShoulder_dress());
		press(p1.getCold_click());
	}
	Pojo2 p2 = new Pojo2();
	@When("Select size and add to bag and click")
	public void select_size_and_add_to_bag_and_click() {
		String pw = Hooks.driver.getWindowHandle();
		System.out.println(pw);
		Set<String> cw= Hooks.driver.getWindowHandles();
		System.out.println(cw);
		for(String x:cw) {
			if(!(x.equals(pw))) {
				Hooks.driver.switchTo().window(x);
			}
		}
		press(p2.getSize());
		press(p2.getAdd());
	
	}

	@Then("go to bag and place the order and click deliver to this address")
	public void go_to_bag_and_place_the_order_and_click_deliver_to_this_address() {
		press(p2.getBag());
		press(p2.getPlace_order());
		press(p2.getDeliver_address());
	
	}

	@Then("Enter the credit card details and screenshot and click Faballey and log out your acc")
	public void enter_the_credit_card_details_and_screenshot_and_click_Faballey_and_log_out_your_acc(io.cucumber.datatable.DataTable dataTable) {
		List<String> ls = dataTable.asList(String.class);
		type(p2.getId(), ls.get(0));
		type(p2.getCard_name(), ls.get(1));
		type(p2.getCard_expiry(), ls.get(2));
		type(p2.getCvv(), ls.get(3));
		press(p2.getFaballey());
		press(p2.getDrop_down());
		press(p2.getLogout());
		}



}
