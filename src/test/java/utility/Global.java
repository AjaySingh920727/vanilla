package utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import amazon.factories.DriverFactory;
import io.cucumber.java.Before;

public class Global {
 	private static WebDriver driver;
    
    public static WebDriver getDriver () {
    	if(driver == null) {
    		driver  = DriverFactory.getDriver();
    	}
    	return driver;
    }
}
