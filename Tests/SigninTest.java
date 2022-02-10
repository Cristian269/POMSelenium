package Tests;

import org.testng.annotations.Test;


import Pages.SigninPage;

import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class SigninTest {
	private WebDriver driver;
	SigninPage signinPage;
     
	@BeforeTest
  public void beforeTest() throws Throwable {
		  signinPage = new SigninPage(driver);
		  driver = signinPage.ChromeDriverConnection();
		  signinPage.visit("http://automationpractice.com/index.php");
	  }
	@Test
  public void f() {
		  signinPage.Sigin();
		  assertTrue(signinPage.IsMyAccountDisplayed());
		
  }
 

  @AfterTest
  public void afterTest() {
	      driver.quit();
  }

}
