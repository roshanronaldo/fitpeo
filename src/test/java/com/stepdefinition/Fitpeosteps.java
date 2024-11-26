package com.stepdefinition;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.junit.Assert;

import com.pages.Fitpeopage;

import com.seleniumutlites.Reusable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Fitpeosteps extends Reusable{
	
	Fitpeopage ft;
	@Given("To launch the Fitpeo application")
	public void to_launch_the_fitpeo_application() throws IOException {
		Browserlaunch();
	}

	@When("To click Revenue Calculator link in the application")
	public void to_click_revenue_calculator_link_in_the_application() {
		ft=new Fitpeopage(driver);
		toClick(ft.getRevenuecalculatorlink());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("To Validate the Revenue Calculator page")
	public void to_validate_the_revenue_calculator_page() {
	  boolean displayed = ft.getRevenuecalculatorpage().isDisplayed();
	  Assert.assertTrue(displayed);
	}

	@When("To scroll down and adjust the patient slider eighttwenty patient")
	public void to_scroll_down_and_adjust_the_patient_slider_eighttwenty_patient() throws AWTException {
	   toScrollDown(ft.getRevenuecalculatorpage());
	   mouseactionclass(ft.getTheslidermoveto820(),93,0);
	   for (int i = 0; i <3; i++) {
		robotclassright();
	}
	}

	@Then("To validate the patient is eighttwenty in the text field")
	public void to_validate_the_patient_is_eighttwenty_in_the_text_field() {
	   boolean displayed = ft.getTheslider820displayed().isDisplayed();
	   Assert.assertTrue(displayed);
	}

	@When("To enter the value fivesixty in the given text field")
	public void to_enter_the_value_fivesixty_in_the_given_text_field() throws AWTException {
	    toClick(ft.getTextfield());
	    for (int i = 0; i < 3; i++) {
			robotclassbackspace();
		}
	    enterValue(ft.getTextfield(), "560");
	}

	@Then("To validate the slider the range is move on fivesixty")
	public void to_validate_the_slider_the_range_is_move_on_fivesixty() {
	   boolean displayed = ft.getValidatetextfield().isDisplayed();
	   Assert.assertTrue(displayed);
	}

	@When("To enter the value eighttwenty in the given text field")
	public void to_enter_the_value_eighttwenty_in_the_given_text_field() throws AWTException, InterruptedException {
		Thread.sleep(3000);
	   mouseactionclass(ft.getValidatetextfield(), 39, 0);
	   
	   for (int i = 0; i < 3; i++) {
		   
		   robotclassright();
		
	}
	}

	@When("To select the cpt codes as per as mentioned")
	public void to_select_the_cpt_codes_as_per_as_mentioned() {
	    toScrollDown(ft.getScrolltocheckbox());
	    toClick(ft.getCpt99091());
	    toClick(ft.getCpt99453());
	    toClick(ft.getCpt99454());
	    toScrollDown(ft.getScrolltocpt99474());
	    toClick(ft.getCpt99474());
	}

	@Then("To validate the Total Recurring Reimbursement for all Patients per Month")
	public void to_validate_the_total_recurring_reimbursement_for_all_patients_per_month() {
	   boolean displayed = ft.getTotalrecurring().isDisplayed();
	   String text = ft.getTotalrecurring().getText();
	   System.out.println("Total Recurring Reimbursement for all Patients Per Month:" + text);
	   Assert.assertTrue(displayed);
	   closebrowser();
	}

}
