package demoportal_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Keywords;

public class ConsultationPage {
	private WebDriver driver;
	
	public ConsultationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Back']")
	public WebElement Back_btn;
	
	@FindBy(xpath="//button[text()='Complete Application']")
	public WebElement CompleteApplication_btn;
	
	public void clickBack() {
		Keywords.clickElement(Back_btn);
	}
	
	public void clickCompleteApp() {
		Keywords.jsClick(CompleteApplication_btn);
		
	}

}
