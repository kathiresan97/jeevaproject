package org.stepdefinition;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.base.Base;
import org.order.PojoWiggle;

import cucumber.api.java.en.*;

public class StepDefinitionClass extends Base{

	@Given("user has to launch the browser and hit the url")
	public void user_has_to_launch_the_browser_and_hit_the_url() {
	    launchBrowser("chrome");
	    driver.get("https://www.wiggle.com/");
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	}

	@When("user has to click the your account button")
	public void user_has_to_click_the_your_account_button() {
	    PojoWiggle p=new PojoWiggle();
	    p.getBtnYourAccount().click();
	}

	@When("user has to enter the email and password field")
	public void user_has_to_enter_the_email_and_password_field() {
	   PojoWiggle p=new PojoWiggle();
	   p.getTxtEmail().sendKeys("jeevak230697@gmail.com");
	   p.getTxtPass().sendKeys("12345");
	}

	@When("click the signin button")
	public void click_the_signin_button() {
	    PojoWiggle p=new PojoWiggle();
	    p.getBtnSign().click();
	}

	@Then("user unable to sign in")
	public void user_unable_to_sign_in() {
	  System.out.println("AS expected captcha arrives");
	}

	@When("user has to click the your account")
	public void user_has_to_click_the_your_account() {
		PojoWiggle p=new PojoWiggle();
	    p.getBtnYourAccount().click();
	    }

	@When("user has to enter the email")
	public void user_has_to_enter_the_email() {
	   PojoWiggle p=new PojoWiggle();
	   p.getTxtcreateAccmail().sendKeys("jeevak230697@gmail.com");
	}

	@When("click the continue button")
	public void click_the_continue_button() {
	    PojoWiggle p=new PojoWiggle();
	    p.getBtnContn().click();
	}

	@Then("confirm the emailid page has to be visible")
	public void confirm_the_emailid_page_has_to_be_visible() {
	System.out.println("Confirm your email id");
	}
	    


	@When("Enter the text in Search field")
	public void enter_the_text_in_Search_field() {
		PojoWiggle p=new PojoWiggle();
		p.getTxtsearch().sendKeys("bikes");
		
	}

	@When("Click Search button")
	public void click_Search_button() {
	    PojoWiggle p=new PojoWiggle();
	    p.getBtnsearch().click();
	}

	@Then("search results will be displayed")
	public void search_results_will_be_displayed() {
	   System.out.println("as expected Search results will arrive");
	}

	@When("use mouseover in cycle")
	public void use_mouseover_in_cycle() {
	   
	}

	@When("use mouse over in swim")
	public void use_mouse_over_in_swim() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("use mouse over in trialthon")
	public void use_mouse_over_in_trialthon() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("use mouse over in outdoors")
	public void use_mouse_over_in_outdoors() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("use mouse over in gymand")
	public void use_mouse_over_in_gymand() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("use mouse over in nutrition and welness")
	public void use_mouse_over_in_nutrition_and_welness() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("check the mouse over working results")
	public void check_the_mouse_over_working_results() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Mouse over the Cycles")
	public void mouse_over_the_Cycles() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("in cycles mouseover the bikes")
	public void in_cycles_mouseover_the_bikes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("select road bikes")
	public void select_road_bikes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("road bikes will appear")
	public void road_bikes_will_appear() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}



}
