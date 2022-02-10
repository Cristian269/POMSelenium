package Tests;

import org.testng.annotations.Test;

import Pages.RegisterPage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class RegisterPageTest {
	public WebDriver driver;
	RegisterPage registerPage;
  
  @BeforeTest
  public void beforeTest() throws Throwable {
	  
	  registerPage = new RegisterPage(driver);
	  driver = registerPage.ChromeDriverConnection();
	  registerPage.visit("http://automationpractice.com/index.php");
	
   
  }
  
  @Test
  public void f() throws InterruptedException {
	  registerPage.registeruser();
	  assertTrue(registerPage.IsMyAccountDisplayed());
  }
 

  

@AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
