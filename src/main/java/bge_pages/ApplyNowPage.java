package bge_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Keywords;

public class ApplyNowPage {
	private WebDriver driver;
	
	public ApplyNowPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h2[contains(text(),'BGE EV Fleet Rate Discount Eligibility & Requirements')]")
	public WebElement FleetRateDiscount_header;
	
	@FindBy(xpath="//div[@class='text-widget']/ul/li[1]/p")
	public WebElement DiscountElig_msg1;
	
	@FindBy(xpath="//div[@class='text-widget']/ul/li[2]/p")
	public WebElement DiscountElig_msg2;
	
	@FindBy(xpath="//div[@class='text-widget']/ul/li[3]/p")
	public WebElement DiscountElig_msg3;
	
	@FindBy(xpath="//div[@class='text-widget']/ul/li[3]/ul//p")
	public WebElement DiscountElig_msg4;
	
	@FindBy(xpath="//div[@class='text-widget']/p[text()='Are you ready to begin your application?']")
	public WebElement BeginApp_msg;
	
	@FindBy(xpath="//a[text()='Begin Application']")
	public WebElement BeginApplication_btn;
	
	public void validateApplyNowPageFields(String msg1,String msg2,String msg3,String msg4) {
		Keywords.verifyElement(FleetRateDiscount_header);
		Keywords.verifyElementText(DiscountElig_msg1, msg1);
		Keywords.verifyElementText(DiscountElig_msg2, msg2);
		Keywords.verifyElementText(DiscountElig_msg3, msg3);
		Keywords.verifyElementText(DiscountElig_msg4, msg4);
		Keywords.verifyElement(BeginApp_msg);
		Keywords.verifyElement(BeginApplication_btn);
		
	}
	
	public void clickBeginApplication() {
		Keywords.jsClick(BeginApplication_btn);
	}
	
}
