package Functional_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM_Repository.Track_OrderPage;
import generic.Base_Class;
import generic.ReadExcel;

public class Track_order extends Base_Class{
	
	@Test
	public void trackorder() throws InterruptedException {
	/*	ReadExcel excel = new ReadExcel();
		String orderid = excel.readStringDataFromExcel("Sheet 2", 1, 0);
		String expectedResult = excel.readStringDataFromExcel("Sheet 2", 2, 0);
		String expectedresult1 = excel.readStringDataFromExcel("Sheet 2", 0, 0);
		*/
		Track_OrderPage order = new Track_OrderPage(driver);
		
		
		Thread.sleep(3000);
		order.trackorderclick();
		Thread.sleep(3000);
		
		
		order.orderid("iiii");
		Thread.sleep(3000);
		
		
		order.checknow();
		Thread.sleep(3000);
		System.out.println("Track_order is pass");
		
		
	}

}
