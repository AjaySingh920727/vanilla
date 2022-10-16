package amazonTests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class AmazonStepDefinations {
	AmazonStepLibrariy amazonSteps;

	public AmazonStepDefinations() {
		amazonSteps = new AmazonStepLibrariy();
	}
	
	@Given("user launches {string} web application")
    public void launchWebApp(String webApp) throws Throwable {
		amazonSteps.openWebPage(webApp);
    }
	
	@When("user selects {string} section from hamburger menu in {string} section")
    public void navigateToTelevisionSection (String subSection, String section) {
		amazonSteps.clickHamburgerMenu();
		amazonSteps.clickTvAppAndElectronicsLink();
		amazonSteps.clickTelevisionSection();
    }
	
	@And("scroll down and filter the results by Brand {string}")
    public void filterResultAsPerBrand(String brand) {
		amazonSteps.filterBrand(brand);
    }
	
	@And("sort the Samsung results with price {string}")
    public void Sort(String sorting) {
		amazonSteps.sortHighToLow();
    }
	
	@And("selects the second highest priced item from the sorting result")
    public void selectSecondHighestItem() {
		amazonSteps.selectSecondHighestPricedItem();
    }
	
	@Then("user should navigate to second highest priced item page in new window")
    public void verifyNavigationToItem() {
		amazonSteps.switchTheWindow();
    }
	
	@And("user should {string} section with all item details")
    public void verifyAboutItemContent(String section) {
		amazonSteps.checkAboutThisItemSection(section);
    }
	
	@And("user closes the browser")
    public void closeBrowser() {
		amazonSteps.closeAllBrowserWindows();
    }

}
