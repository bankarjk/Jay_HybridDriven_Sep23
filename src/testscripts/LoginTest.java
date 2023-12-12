package testscripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.ControlActions;
import pages.LoginPage;

public class LoginTest {

	@BeforeMethod
	public void setUp() {
		ControlActions.launchBrowser();
	}
	
	
	@Test
	public void verifyLogin() {
		LoginPage loginPage = new LoginPage();
		loginPage.login("bankarjaykumar@gmail.com", "Jay@131197");
		
		boolean loginFlag = loginPage.isLoginSuccessfullyDisplayed();
		Assert.assertTrue(loginFlag);
	}
	
	@AfterMethod
	public void tearDown() {
		ControlActions.closeBrowser();
	}
}
