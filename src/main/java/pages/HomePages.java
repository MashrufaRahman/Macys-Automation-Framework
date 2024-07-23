package pages;

import java.util.jar.Attributes.Name;

import javax.swing.tree.TreeCellRenderer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePages {
	WebDriver driver;

	public HomePages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='logo']")
	WebElement logo;

	@FindBy(xpath = "//a[@class='primary button button-small']")
	WebElement mainSignIn;

	@FindBy(name = "user.email_address")
	WebElement userId;

	@FindBy(xpath = "//button[@id = 'sign-in']")
	WebElement signInButton;

	public void clickLogo() {
		logo.click();

	}

	public void clickMainSignIn() throws InterruptedException {
		Thread.sleep(4000);
		mainSignIn.click();
		Thread.sleep(4000);

	}

	public void clickUserId() throws InterruptedException {
		Thread.sleep(4000);
		userId.click();
		Thread.sleep(4000);

	}

	public void clickSignInButton() throws InterruptedException {
		Thread.sleep(4000);
		signInButton.click();
		Thread.sleep(4000);

	}

}
