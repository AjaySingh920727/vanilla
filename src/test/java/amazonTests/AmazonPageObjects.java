package amazonTests;

public final class AmazonPageObjects {
	
	public static String hamburgerMenuSelector = "//*[@id='nav-hamburger-menu']";

	public static String tvAppliancesAndElectronicsLinkSelector = "//a[@class='hmenu-item']/div[contains(text(),'TV, Appliances, Electronics')]";

	public static String televisionSelector = "//a[contains(text(),'Televisions')]";

	public static String sortByButtonSelector = "//*[@aria-label='Sort by:']";

	public static String sortByHighToLowSelector = "//a[contains(text(),'Price: Low to High')]";

	public static String secondHighestPricedItemSelector = "//*[@cel_widget_id='MAIN-SEARCH_RESULTS-2']";

	public static String aboutItemSelector = "//*[@id='feature-bullets']//h1";

	public static String aboutItemContentSelector = "//*[@id='feature-bullets']//following-sibling::ul";
	
	public static String brandCheckboxSelector = "//span[contains(text(),'Samsung')]/preceding-sibling::div";

}
