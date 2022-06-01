package Test;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.Homepage;

public class HomePageTest extends BaseClass {
	Homepage hp;
	@Test(priority=1)
	public void verifyHomepageTitle()
	{
	String tit = driver.getTitle();
	Assert.assertEquals(tit,"WebstaurantStore: Restaurant Supplies & Foodservice Equipment");
	}
	@Test(priority=2)
	public void validatehomepage()
	{
		hp=new Homepage(driver);
		
		hp.searchinputboxinhomepage();
		hp.searchbuttoninhomepage();
		 
	}

}
