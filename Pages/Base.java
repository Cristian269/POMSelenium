package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	protected WebDriver driver;

	public  Base(WebDriver driver) {
		
		this.driver = driver;
		
	}

	public WebDriver ChromeDriverConnection(){
	DesiredCapabilities cap = new  DesiredCapabilities();
	cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
	
	System.setProperty("webdriver.chrome.driver","./src/test/resources/chromedriver/chromedriver.exe");
	return driver;
	}
	/*public  WebElement FindElement (By locator) {
		
		WebElement element = driver.findElement(locator);
		return element;
	}
	public List <WebElement> FindElements (By locator ) {
		return driver.findElements(locator);
		
	}
	public String GetText(WebElement element) {
		
		return element.getText();
	}
	
	public String GetText(By locator) {
		
	 WebElement element = driver.findElement((By) locator);
	return element.getText();	
	}*/
	
	public void Types (String inputText, By locator) {
		
		driver.findElement(locator).sendKeys(inputText);
	}
	
	public void Click (By locator) {
		
		driver.findElement(locator).click();
	}
	public  Boolean IsDisplayed(By locator) {
		try {
		return driver.findElement(locator).isDisplayed();
		} catch (org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	public void  visit (String url) throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
}
	 public void dropdownlistbyindex (int index, By locator) {
		   Select dropdown1 = new Select (driver.findElement(locator));
		   dropdown1.selectByIndex(index);   
		   
	   }
	 public WebDriverWait Ewait (By locator){
			WebDriverWait wait = new WebDriverWait(driver, 7);
			wait.until(ExpectedConditions.presenceOfElementLocated(locator));
			return wait;}
}
	 