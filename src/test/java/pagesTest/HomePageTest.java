package pagesTest;

import org.testng.annotations.Test;

import baseUtil.BaseClass;

public class HomePageTest extends BaseClass {
	@Test
	public void clicklogoTest() {
		homePages.clickLogo();
	}

	@Test

	public void clickMainSignInTest() throws InterruptedException {
		homePages.clickMainSignIn();
	}

	@Test

	public void clickUserIdTest() throws InterruptedException {
		homePages.clickUserId();
	}

	@Test
	public void clickSignInTest() throws InterruptedException {
		homePages.clickSignInButton();

	}

}
