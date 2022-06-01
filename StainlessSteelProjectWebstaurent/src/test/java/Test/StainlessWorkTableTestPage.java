package Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import Base.BaseClass;
import pages.Homepage;

public class StainlessWorkTableTestPage extends BaseClass {
	Homepage hp;
	@Test(priority=3)
	public void verifystainessworktablepage()
	{
hp=new Homepage(driver);
		
		hp.searchinputboxinhomepage();
		hp.searchbuttoninhomepage();
		String tit = driver.getTitle();
		Assert.assertEquals(tit,"Stainless Work Table - WebstaurantStore");
	}
	@Test(priority=4)
	public void validatesatainlessworktablepage()
	{
		for(int i=1;i<=9;i++)
		{
			WebElement ele=driver.findElement(By.xpath("//li[contains(@class,'rc-pagination-item-"+i+"')]"));
			ele.click();
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@id='details']"));
		
		System.out.println(list.size());
		int count=0;
		for (int j=0; j<list.size(); j++)
		{
			String s = list.get(j).getText();
			
			
			if(s.contains("Table")) {
				//System.out.println("This product contains text Table: "+s);
			}
			else
			{
				 count++;
				System.out.println("This product doesn't contain text Table: "+s);
				System.out.println(count);
			}
		}
		}
			driver.findElement(By.xpath("//div[@data-item-number='575t4872stem']//div[@class='btn-container']/div[1]/input[@name='addToCartButton']")).click();
			WebElement lastelementdropdown=driver.findElement(By.xpath("//select[@name='accessories']"));
			Select sel=new Select(lastelementdropdown);
			sel.selectByValue("5282096");
			driver.findElement(By.xpath("//button[normalize-space()='Add To Cart']")).click();
			driver.findElement(By.xpath("//a[@class='btn btn-small btn-primary']")).click();
			driver.findElement(By.xpath("//span[@class='hidden xsl:inline']")).click();
			driver.findElement(By.xpath("//button[@title='Decrease Quantity']")).click();
			

	
}	
}
		
		
	


