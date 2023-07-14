package bge_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import utils.Keywords;

public class ManageApplicationsPage {
private WebDriver driver;

public ManageApplicationsPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

@FindBy(xpath="//h1[contains(text(),'Sign in')]")
public WebElement SignIn_header;

@FindBy(xpath="//label[contains(text(),'Email Address:')]/following-sibling::input[@id='root_userName']")
public WebElement EmailAddress_txt;

@FindBy(xpath="//button[text()='Continue']")
public WebElement Continue_btn;

@FindBy(xpath="//a[text()='Forgot Password']")
public WebElement ForgotPassword_lnk;

@FindBy(xpath="//a[text()='Create Account']")
public WebElement CreateAccount_lnk;

public void validateManageAppsFields() {
	Keywords.verifyElement(SignIn_header);
	Keywords.verifyElement(EmailAddress_txt);
	Keywords.verifyElement(Continue_btn);
	Keywords.verifyElement(ForgotPassword_lnk);
	Keywords.verifyElement(CreateAccount_lnk);
}


}
