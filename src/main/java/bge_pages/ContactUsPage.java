package bge_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Keywords;

public class ContactUsPage {
	private WebDriver driver;
	
	public ContactUsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(@class,'container-fluid')]/h1[text()='Contact us']")
	public WebElement ContactUs_header;
	
	@FindBy(xpath="//div[contains(@class,'container-fluid')]/div/p[1]/strong")
	public WebElement ContactUs_msg1;
	
	@FindBy(xpath="//div[contains(@class,'container-fluid')]/div/p[2]")
	public WebElement ContactUs_msg2;
	
	@FindBy(xpath="//label[@for='root_name']/following-sibling::input[@id='root_name']")
	public WebElement YourName_txt;
	
	@FindBy(xpath="//label[@for='root_email']/following-sibling::input[@id='root_email']")
	public WebElement EmailAddress_txt;
	
	@FindBy(xpath="//label[@for='root_phone']/following-sibling::input[@id='root_phone']")
	public WebElement Phone_txt;
	
	@FindBy(xpath="//label[@for='root_contactMessage']/following-sibling::textarea[@id='root_contactMessage']")
	public WebElement Question_txt;
	
	@FindBy(xpath="//button[text()='Submit']")
	public WebElement Submit_btn;
	
	public void validateContactUsPageFields(String msg1,String msg2) {
		Keywords.verifyElement(ContactUs_header);
		Keywords.verifyElementText(ContactUs_msg1, msg1);
		Keywords.verifyElementText(ContactUs_msg2, msg2);
		Keywords.verifyElement(YourName_txt);
		Keywords.verifyElement(EmailAddress_txt);
		Keywords.verifyElement(Phone_txt);
		Keywords.verifyElement(Question_txt);
		Keywords.verifyElement(Submit_btn);
		
	}
	
	
}
