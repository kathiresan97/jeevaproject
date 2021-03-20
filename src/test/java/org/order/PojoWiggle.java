package org.order;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PojoWiggle extends Login{
	public PojoWiggle() {
		PageFactory.initElements(d,this);
	}
	
	@FindBy(xpath="//a[text()='Your Account']")
	private WebElement btnYourAccount;
	@FindBy(id="LogOnModel_UserName")
	private WebElement txtEmail;
	
	@FindBy(id="LogOnModel_Password")
	private WebElement txtPass;
	
	@FindBy(id="qa-login")
	private WebElement btnSign;
	
	@FindBy(id="DualRegisterEmailModel_Email")
	private WebElement txtcreateAccmail;
	
	@FindBy(id="qa-dual-register")
	private WebElement btnContn;
	
	@FindBy(id="rs")
	private WebElement txtsearch;
	
	@FindBy (xpath="(//button[@type='submit'])[1]")
	private WebElement btnsearch;

	public WebElement getBtnYourAccount() {
		return btnYourAccount;
	}

	public WebElement getTxtEmail() {
		return txtEmail;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getBtnSign() {
		return btnSign;
	}

	public WebElement getTxtcreateAccmail() {
		return txtcreateAccmail;
	}

	public WebElement getBtnContn() {
		return btnContn;
	}

	public WebElement getTxtsearch() {
		return txtsearch;
	}

	public WebElement getBtnsearch() {
		return btnsearch;
	}
	
	
}
