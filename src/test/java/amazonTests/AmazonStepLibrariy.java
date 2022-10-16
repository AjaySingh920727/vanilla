package amazonTests;
import utility.ActionsUtils;

public class AmazonStepLibrariy{

	AmazonPageObjects amazonPO;
	ActionsUtils actions;
	
	public AmazonStepLibrariy() {
		actions = new ActionsUtils();
	}
	
	//Step - 1 - Open https://www.amazon.in/.
	public void openWebPage(String url) {
		actions.navigateToWebApp(url);
	}
	
	//Step - 2 - Click on the hamburger menu in the top left corner.
	public void clickHamburgerMenu() {
		actions.clickElement(actions.getElement(AmazonPageObjects.hamburgerMenuSelector));
	}
	
	//Step - 3 - Scroll own and then Click on the TV, Appliances and Electronics link under Shop by Department section. 
    public void clickTvAppAndElectronicsLink() {
    	actions.scrollToElement(actions.getElement(AmazonPageObjects.tvAppliancesAndElectronicsLinkSelector));
    	actions.clickElement(actions.getElement(AmazonPageObjects.tvAppliancesAndElectronicsLinkSelector));
    }
    
	//Step - 4 - Then click on Televisions under Tv, Audio & Cameras sub section.
    public void clickTelevisionSection() {
    	actions.clickElement(actions.getElement(AmazonPageObjects.televisionSelector));
    }
    
	//Step - 5 - Scroll down and filter the results by Brand ‘Samsung’.
    public void filterBrand (String brand) {
    	actions.explicitWaitForSeconds(3);
    	actions.scrollToElement(actions.getElement(AmazonPageObjects.brandCheckboxSelector));
    	actions.clickElement(actions.getElement(AmazonPageObjects.brandCheckboxSelector));
    }
    
	//Step - 6 - Sort the Samsung results with price High to Low.
    public void sortHighToLow() {
    	actions.clickElement(actions.getElement(AmazonPageObjects.sortByButtonSelector));
    	actions.clickElement(actions.getElement(AmazonPageObjects.sortByHighToLowSelector));
    }
    
	//Step - 7 - Click on the second highest priced item
    public void selectSecondHighestPricedItem() {
    	actions.explicitWaitForSeconds(3);
    	actions.clickElement(actions.getElement(AmazonPageObjects.secondHighestPricedItemSelector));
    }
    
	//Step - 8 - Switch the Window
    public void switchTheWindow() {
    	actions.explicitWaitForSeconds(3);
    	actions.switchToWindow();
    }
    
	//Step - 9 - Assert that “About this item” section is present and log this section text to console/report.
    public void checkAboutThisItemSection(String section) {
    	actions.verifyElementIsPresent(actions.getElement(AmazonPageObjects.aboutItemSelector));
    	System.out.println(actions.getElement(AmazonPageObjects.aboutItemContentSelector).getText());
    }
    
    //Step -10 close all browser windows and quit the driver
    public void closeAllBrowserWindows() {
    	actions.closeAllOpenWindow();
    	actions.quitDriver();
    }
}
