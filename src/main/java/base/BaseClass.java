package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ExcelReader;

public class BaseClass {
	public static String browser="Chrome";
	public static WebDriver driver;
	public static String url="https://npateltest.customerapplication.com/";//"https://bgeev-dcc.customerapplication.com";//"https://npateltest.customerapplication.com";///////"https://bgeev-dcc.customerapplication.com";//"https://npateltest.customerapplication.com";
	public static ExcelReader excl;
	public static String myTestName;
	public static String sheetName;
	
	public static void initializeDriver() {
		excl=new ExcelReader(System.getProperty("user.dir")+"\\src\\main\\java\\resources\\TestData.xlsx");
		if(driver==null) {
		if(browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\rgudi\\Downloads\\109\\chrome\\chromedriver.exe");
			driver=new ChromeDriver(options);
		}else if(browser.equalsIgnoreCase("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		}
	}

}
