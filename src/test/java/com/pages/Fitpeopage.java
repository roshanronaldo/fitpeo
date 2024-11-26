package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.library.Baseclass;

public class Fitpeopage extends Baseclass {
	
	
	public Fitpeopage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[text()='Revenue Calculator']")
	WebElement Revenuecalculatorlink;
	
	@FindBy(xpath = "//h4[text()='Medicare Eligible Patients']")
	WebElement Revenuecalculatorpage;
	
	@FindBy(xpath = "//input[@value='200']//parent::span")
	WebElement theslidermoveto820;
	
	@FindBy(xpath = "//input[@value='820']//parent::span")
	WebElement theslider820displayed;
	
	@FindBy(xpath = "//input[@type='number']")
	WebElement textfield;
	
	@FindBy(xpath = "//input[@value='560']//parent::span")
	WebElement validatetextfield;
	
	@FindBy(xpath = "//p[text()='CPT-99091']")
	WebElement scrolltocheckbox;
	
	@FindBy(xpath = "//input[@type='checkbox']//parent::span//parent::label//following-sibling::span[text()='57']")
	WebElement cpt99091;
	
	@FindBy(xpath = "//input[@type='checkbox']//parent::span//parent::label//following-sibling::span[text()='19.19']")
	WebElement cpt99453;
	
	@FindBy(xpath = "//input[@type='checkbox']//parent::span//parent::label//following-sibling::span[text()='63']")
	WebElement cpt99454;
	
	@FindBy(xpath = "//p[text()='CPT-99474']")
	WebElement scrolltocpt99474;
	
	@FindBy(xpath = "//input[@type='checkbox']//parent::span//parent::label//following-sibling::span[text()='15']")
	WebElement cpt99474;
	
	@FindBy(xpath = "//p[text()='Total Recurring Reimbursement for all Patients Per Month:']//child::p[text()='$' and text()='110700']")
	WebElement totalrecurring;

	public WebElement getTotalrecurring() {
		return totalrecurring;
	}

	public WebElement getRevenuecalculatorlink() {
		return Revenuecalculatorlink;
	}

	public WebElement getRevenuecalculatorpage() {
		return Revenuecalculatorpage;
	}

	public WebElement getTheslidermoveto820() {
		return theslidermoveto820;
	}

	public WebElement getTheslider820displayed() {
		return theslider820displayed;
	}

	public WebElement getTextfield() {
		return textfield;
	}

	public WebElement getValidatetextfield() {
		return validatetextfield;
	}

	public WebElement getScrolltocheckbox() {
		return scrolltocheckbox;
	}

	public WebElement getCpt99091() {
		return cpt99091;
	}

	public WebElement getCpt99453() {
		return cpt99453;
	}

	public WebElement getCpt99454() {
		return cpt99454;
	}

	public WebElement getScrolltocpt99474() {
		return scrolltocpt99474;
	}

	public WebElement getCpt99474() {
		return cpt99474;
	}

}
