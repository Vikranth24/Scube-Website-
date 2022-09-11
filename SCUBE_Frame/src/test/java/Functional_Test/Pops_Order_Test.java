package Functional_Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Repository.Add_To_Cartpage;
import POM_Repository.Compatible_devices_page;
import POM_Repository.Homepage;
import POM_Repository.productspage;
import generic.Base_Class;
import generic.JavaScriptUtil;
import generic.ReadExcel;
import generic.UtilityMethods;

public class Pops_Order_Test extends Base_Class {
	@Test
	public void Home_Functional() throws InterruptedException {
		System.out.println();
		System.out.println("Executive_card_Test =to check filter of  Executive_card is working proper ");
		System.out.println();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

		/*ReadExcel a = new ReadExcel();
		String name = a.readStringDataFromExcel("Sheet8", 0, 0);
		String desc = a.readStringDataFromExcel("Sheet8", 0, 1);
		String phone = a.readStringDataFromExcel("Sheet8", 0, 2);
		String comp = a.readStringDataFromExcel("Sheet8", 0, 3);
*/
		Homepage home = new Homepage(driver);
		productspage pro = new productspage(driver);
		UtilityMethods Util = new UtilityMethods();

		home.product_link();
		Thread.sleep(3000);
		Util.scroll_down(driver);
		Thread.sleep(3000);
		pro.Pops();
		
		Thread.sleep(3000);
		Util.scroll_down(driver);
		Thread.sleep(3000);
		pro.Pops1();
		Thread.sleep(3000);
		pro.PopsQR();
		Thread.sleep(3000);
		Util.scroll_down(driver);
		Thread.sleep(3000);
		pro.PopsAdd_to_Cart();
		Thread.sleep(3000);
		pro.checkout();
		Thread.sleep(3000);

		home.product_link();
		Thread.sleep(3000);
		Util.scroll_down(driver);
		Thread.sleep(3000);

		pro.Pops();
		
		Thread.sleep(3000);
		Util.scroll_down(driver);
		Thread.sleep(3000);
		pro.Pops2();
		Thread.sleep(3000);
		pro.PopsQR();
		Thread.sleep(3000);
		Util.scroll_down(driver);
		Thread.sleep(3000);
		pro.PopsAdd_to_Cart();
		Thread.sleep(3000);
		pro.PopsIMG();
		Thread.sleep(8000);
		pro.PopsAdd_to_Cart();
		Thread.sleep(3000);
		pro.Addcardpops();
		Thread.sleep(3000);

		Util.scroll_down(driver);
		Thread.sleep(3000);
		pro.Pops();
		Thread.sleep(3000);
		Util.scroll_down(driver);
		Thread.sleep(3000);
		pro.Pops3();
		Thread.sleep(3000);
		pro.PopsQR();
		Thread.sleep(3000);
		Thread.sleep(3000);
		Util.scroll_down(driver);
		Thread.sleep(3000);
		pro.PopsAdd_to_Cart();
		Thread.sleep(3000);
		pro.PopsQR();
		Thread.sleep(3000);
		Util.scroll_down(driver);
		Thread.sleep(3000);
		pro.PopsAdd_to_Cart();
		Thread.sleep(3000);
		pro.PopsIMG();
		Thread.sleep(8000);
		
		Util.scroll_down(driver);
		Thread.sleep(3000);
		pro.PopsAdd_to_Cart();
		Thread.sleep(3000);
		pro.checkout();
		Thread.sleep(3000);

		System.out.println("pops order Pass");
		

	}
}
