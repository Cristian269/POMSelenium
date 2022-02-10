package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SigninPage extends Base {
	By siginhomelocator= By.xpath(" //a [@title ='Log in to your customer account' ]");
	By chekingpagecreateaccount =By.xpath("//h1 [@class='page-heading']");
	By email=By.id("email");
	By pass= By.name("passwd");
    By siginbuton=By.id("SubmitLogin");
    By myaccountcheker =By.xpath("//p[@class='info-account']");
	  
	public SigninPage(WebDriver driver) {
		super(driver);
		
	}
	public void Sigin() {
	Click(siginhomelocator);
	Ewait (email);
	if (IsDisplayed( chekingpagecreateaccount))  { 
		   Types ("tit23@yahoo.com.ar",email);   
		   Types ("tisfsffsf",pass);
		   Click(siginbuton);
		
	}else {
		System.out.println("The page was not founded!");
	}
	   

}
	public boolean IsMyAccountDisplayed() {
		  return IsDisplayed(myaccountcheker);
		
	}
	
}	
