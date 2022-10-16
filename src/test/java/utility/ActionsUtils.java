package utility;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsUtils {

	private JavascriptExecutor je;
	private WebDriverWait wait;
	private WebDriver driver;
	private String parentWindow;

	public ActionsUtils() {
		this.driver = Global.getDriver();
		je = (JavascriptExecutor) driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	}

	public WebElement getElement(String locator) {
		WebElement element = driver.findElement(By.xpath(locator));
		this.verifyElementIsPresent(element);
		return element;
	}

	public void navigateToWebApp(String url) {
		driver.get(url);
	}

	public void clickElement(WebElement element) {
		waitForElementToBeClickable(element);
		element.click();
	}

	public void scrollToElement(WebElement element) {
		je.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void waitForElementToBeClickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public void verifyElementIsPresent(WebElement element) {
		waitForElementToBeVisible(element);
		element.isDisplayed();
	}

	public void waitForElementToBeVisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void assertElement(String actual, String expected) {
		WebElement element = driver.findElement(By.xpath(actual));
		assertEquals(element.getText(), expected);
	}

	public void switchToWindow() {
		parentWindow = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
	}

	public void explicitWaitForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void closeAllOpenWindow() {
		//Closes child window
		driver.close();
		
		//Closes parent window
		driver.switchTo().window(parentWindow);
		driver.close();
	}

	public void quitDriver() {
		driver.quit();
	}
}
