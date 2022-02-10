package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage<Typing> extends Base{
	  By siginhomelocator= By.xpath(" //a [@title ='Log in to your customer account' ]");
	  By chekingpagecreateaccount =By.xpath("//h1 [@class='page-heading']");
	  By selectormale=By.id("id_gender1");
	  By emailadresscreateaccount =By.id("email_create");
	  By createaccountbutton=By.name("SubmitCreate");
	  By Firsname=By.id("customer_firstname");
	  By Lastname=By.id("customer_lastname");
	  By Password=By.id("passwd");
	  By Addres=By.id("address1");
	  By State=By.id("id_state");
	  By City =By.id("city");
	  By PostalCode =By.id("postcode");
	  By Country =By.id("id_country");
	  By Cel=By.id("phone_mobile");
	  By authenticationbutton = By.id("submitAccount"); //"authentication"
	  By Aliasaddres=By.id("alias");
	  By Company = By.id("company");
	  By aditional = By.id("other");
	  By phone =By.id("phone");
	  By elementchkiwait=By.cssSelector("h1[class='page-heading']");
	  By elementchkaccpage=By.tagName("p");
	  By myaccountcheker =By.xpath("//p[@class='info-account']");
	public RegisterPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void registeruser() throws InterruptedException{
		
		   Click(siginhomelocator);
		   Ewait (chekingpagecreateaccount);
		   if   (IsDisplayed( chekingpagecreateaccount)) {
			    Types ("ogorriwrumemamacarenever153@gmail.com",emailadresscreateaccount); 
			    Click(createaccountbutton);                         
			    Ewait (Firsname);
				Click(selectormale);                               			                           
				Types ("Andres",Firsname);              
				Types ("Perez",Lastname);                         
				Types ("tisfsffsf",Password);
				Types ("San Martin 2021",Addres);
				Types ("San Carlos",City);
				Types ("05583",PostalCode);
				Types ("2614789876",Cel);
				dropdownlistbyindex (1, Country);
				dropdownlistbyindex (3, State);
				Types ("Taller",Aliasaddres);  
				Types ("comprobame la compra",aditional);
				Types ("Firring",Company);
				Types ("75858748",phone);
				Click(authenticationbutton);
				Ewait(elementchkiwait);
				
		 } else{
				System.out.println("The page was not founded!");
				}
	}	
		   
   
    public boolean IsMyAccountDisplayed() {
		  return IsDisplayed(myaccountcheker);
		
	}	  
		   }
			
	
	


