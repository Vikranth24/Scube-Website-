package Functional_Test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import POM_Repository.supportpage;
import generic.Base_Class;

import generic.ReadExcel;


public class support extends Base_Class {
	
	@Test
	public void supports() throws InterruptedException  {
	/*	ReadExcel excel = new ReadExcel();
		String yourname = excel.readStringDataFromExcel("Supportdetails", 0, 0);
		String email = excel.readStringDataFromExcel("Supportdetails", 1, 0);
		String message = excel.readStringDataFromExcel("Supportdetails", 2, 0);
		String number = excel.readStringDataFromExcel("Supportdetails", 3, 0);
		String expectedResult = excel.readStringDataFromExcel("Supportdetails", 4, 0);
		String expectedResult1 = excel.readStringDataFromExcel("Supportdetails", 5, 0);

*/
		
		supportpage support = new supportpage(driver);
	
		
		
		support.supportclick();
		
		Thread.sleep(3000);
		support.supportyourname("viki");
		Thread.sleep(3000);
		support.supportphonenumber("9900234730");
		Thread.sleep(3000);
		
		
		support.supportemailaddress("viki@gmail.com");
		Thread.sleep(3000);
		
		support.supportmessagetextfiled("byyyyyy");
		Thread.sleep(3000);
		
		support.supportsubmitbutton();
		
		
	}

}
