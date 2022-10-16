package amazonTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class AmazonStepDefinations {
	
	@Given("user launches {string} web application")
    public void launchWebApp(String webApp) throws Throwable {
		
    }
	
	@When("user selects {string} section from hamburger menu in {string} section")
    public void navigateToTelevisionSection (String subSection, String section) {
		
    }
	
	@And("scroll down and filter the results by Brand {string}")
    public void filterResultAsPerBrand(String brand) {
		
    }
	
	@And("sort the Samsung results with price {string}")
    public void Sort(String sorting) {
		
    }
	
	@And("selects the second highest priced item from the sorting result")
    public void selectSecondHighestItem() {
		
    }
	
	@Then("user should navigate to second highest priced item page in new window")
    public void verifyNavigationToItem() {
		
    }
	
	@And("user should {string} section with all item details")
    public void verifyAboutItemContent(String section) {
		
    }
	
	@And("user closes the browser")
    public void closeBrowser() {
		
    }

}
