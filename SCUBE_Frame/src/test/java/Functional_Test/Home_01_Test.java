package Functional_Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import POM_Repository.Add_To_Cartpage;
import POM_Repository.Compatible_devices_page;
import POM_Repository.Homepage;
import generic.Base_Class;
import generic.JavaScriptUtil;
import generic.ReadExcel;
import generic.UtilityMethods;

public class Home_01_Test extends Base_Class
{
	
	@Test
	public void Home_Functional() throws InterruptedException
	{
		System.out.println();
		System.out.println("Home_01_Test = Testing all functionality of home page");
		System.out.println();
		
		
		
		/*ReadExcel a=new ReadExcel();
		String corp_name=a.readStringDataFromExcel("Sheet1",0,0);
		String corp_desc=a.readStringDataFromExcel("Sheet1",0,1);
		String corp_comp=a.readStringDataFromExcel("Sheet1",0,2);
		String corp_phone=a.readStringDataFromExcel("Sheet1",0,3);
		String corp_email=a.readStringDataFromExcel("Sheet1",0,4);
		String corp_qua=a.readStringDataFromExcel("Sheet1",0,5);
		
		String Bulk_name=a.readStringDataFromExcel("Sheet2", 0, 0);
		String Bulk_desc=a.readStringDataFromExcel("Sheet2", 0, 1);
		String Bulk_comp=a.readStringDataFromExcel("Sheet2", 0, 2);
		String Bulk_phone=a.readStringDataFromExcel("Sheet2", 0, 3);
		String Bulk_email=a.readStringDataFromExcel("Sheet2", 0, 4);
		String Bulk_qua=a.readStringDataFromExcel("Sheet2", 0, 5);
		
		String Brand_name=a.readStringDataFromExcel("Sheet3", 0, 0);
		String Brand_desc=a.readStringDataFromExcel("Sheet3", 0, 1);
		String Brand_comp=a.readStringDataFromExcel("Sheet3", 0, 2);
		String Brand_phone=a.readStringDataFromExcel("Sheet3", 0, 3);
		String Brand_email=a.readStringDataFromExcel("Sheet3", 0, 4);
		
		String Partner_name=a.readStringDataFromExcel("Sheet4", 0, 0);
		String Partner_desc=a.readStringDataFromExcel("Sheet4", 0, 1);
		String Partner_comp=a.readStringDataFromExcel("Sheet4", 0, 2);
		String Partner_phone=a.readStringDataFromExcel("Sheet4", 0, 3);
		String Partner_email=a.readStringDataFromExcel("Sheet4", 0, 4);
		
	*/
		
		
	Homepage home=new Homepage(driver);
		UtilityMethods Util=new UtilityMethods();
		Add_To_Cartpage add=new Add_To_Cartpage(driver);
		
		Thread.sleep(5000);
		home.product_link();
		Thread.sleep(8000);
		Assert.assertEquals(driver.getTitle(),"Executive Card", "Executive Card page is displated");
		home.homeicon();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"Scube - A Smart Business Card", "Scube - A Smart Business Card page is displated");
		
		
		
		
		home.Compatibledevices_link();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"Supported Phones", "Supported Phones page is displated");
		home.homeicon();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"Scube - A Smart Business Card", "Scube - A Smart Business Card page is displated");
		
		

		
		home.support_link();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"Support", "Support page is displated");
		home.homeicon();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"Scube - A Smart Business Card", "Scube - A Smart Business Card page is displated");
		System.out.println("Haai");
		
		
		
		home.TrackOrder_link();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"Track Order", "Track Order is displated");
		home.homeicon();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"Scube - A Smart Business Card", "Scube - A Smart Business Card page is displated");
		
		
		home.country_DropDown();
		Thread.sleep(5000);
		home.AEDcountry_DropDown();
		Thread.sleep(5000);
		home.AEDcountry_DropDown();
		Thread.sleep(5000);
		home.country_DropDown();
		Thread.sleep(5000);
		
		
		
		home. AddToCart_link();
		Thread.sleep(5000);
		add.EXplore_poduct_Button();
		Thread.sleep(5000);
		Assert.assertEquals(driver.getTitle(),"Executive Card", "Executive Card page is displated");
		home.homeicon();
		Thread.sleep(5000);
		
		
		
		home. BeCreative_Block();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Executive Card", "Executive Card page is displated");
		home.homeicon();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(),"Scube - A Smart Business Card", "Scube - A Smart Business Card page is displated");
		
		
		home. CorporateBulkOrders_Block();
		Thread.sleep(3000);
		home.BulkOrderName_TextField("vikranth");
		Thread.sleep(3000);	
		home.BulkOrderdesignation_TextField("Aaaa");
		Thread.sleep(3000);
		home.BulkOrderCompany_TextField("bbb");
		Thread.sleep(3000);
		home.BulkOrderPhone_TextField("9900990099"); 
		Thread.sleep(3000);
		home.BulkOrderPhoneFlag_DropDown();
		Thread.sleep(3000);
		home.BulkOrderPhoneFlag_DropDown();
		Thread.sleep(3000);
		home.BulkOrderEmail_TextField("v@gmail.com");
		Thread.sleep(3000);
		home.BulkOrderReq_TextField("8");
		Thread.sleep(8000);
		home.BulkOrderEnquire_Button();
	    Thread.sleep(8000);
		home.BulkOrderCancel_Button();
	    Thread.sleep(3000);
		
	    
	    
		home.HomeVideo_video();
        Thread.sleep(30000);                             
		home.HomeVideoCancel_video();
	    Thread.sleep(3000);
		
		
	    
		for(int i=0;i<=1;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.GetYours_Button();
		Assert.assertEquals(driver.getTitle(),"Executive Card", "Executive Card page is displated");
		Thread.sleep(3000);
		home.homeicon();
		Assert.assertEquals(driver.getTitle(),"Scube - A Smart Business Card", "Scube - A Smart Business Card page is displated");
		Thread.sleep(3000);
		
		for(int i=0;i<=2;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.Onepops();
		Thread.sleep(5000);
		home.homeicon();
		Thread.sleep(3000);
			
			
			
		for(int i=0;i<=2;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.Twopops();
		
		Thread.sleep(5000);
		home.homeicon();
		Thread.sleep(3000);
				
				
				
		for(int i=0;i<=2;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.Threepops();
		Thread.sleep(5000);
		home.homeicon();
		Thread.sleep(3000);	
		

		for(int i=0;i<=3;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.ExecutiveGetCard_Button();
		Assert.assertEquals(driver.getTitle(),"Executive Card", "Executive Card page is displated");
		Thread.sleep(5000);
		for(int i=0;i<=1;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.homeicon();
		Assert.assertEquals(driver.getTitle(),"Scube - A Smart Business Card", "Scube - A Smart Business Card page is displated");
		Thread.sleep(3000);
		
		
		
		

		for(int i=0;i<=4;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.WhiteGetCard_Button();
		
		Thread.sleep(5000);
		for(int i=0;i<=1;i++) {
	    Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.homeicon();
		Assert.assertEquals(driver.getTitle(),"Scube - A Smart Business Card", "Scube - A Smart Business Card page is displated");
		Thread.sleep(3000);
		
		
		
		

		for(int i=0;i<=5;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home. PremiumGetCard_Button();
		
		Thread.sleep(5000);
		for(int i=0;i<=1;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.homeicon();
		Assert.assertEquals(driver.getTitle(),"Scube - A Smart Business Card", "Scube - A Smart Business Card page is displated");
		Thread.sleep(3000);
		
		
		

		for(int i=0;i<=11;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.PlusSign_Button();
		Thread.sleep(3000);
		home.PlusSign_Button();
		Thread.sleep(3000);
	
		
		
		
		
		

		for(int i=0;i<=0;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.ContactUs_link();
		Thread.sleep(3000);
		home.BulkOrderName12_TextField("Vikranth");
		Thread.sleep(3000);
		home.BulkOrderdesignation12_TextField("vvv"); 
		Thread.sleep(3000);
		home.BulkOrderCompany12_TextField("ccc");
		Thread.sleep(3000);
		home.BulkOrderPhone12_TextField("9900990099");
		Thread.sleep(3000);
		
		home.BulkOrderEmail12_TextField("v@gmail.com");
		Thread.sleep(3000);
		home.BulkOrderReq12_TextField("12");
		Thread.sleep(9000);
		//home.BulkOrderEnquire12_Button();
	//	Thread.sleep(9000);
		home.BulkOrderCancel12_Button();
		Thread.sleep(3000);
		
		
		

		
		
		home.BrandBuilding_Button();
		Thread.sleep(3000);
		home.BrandBuildingName_TextField("vikranth");
		Thread.sleep(3000);
		home.BrandBuildingDesignation_TextField("nnn");
		Thread.sleep(3000);
		home.BrandBuildingCompany_TextField("rrr");
		Thread.sleep(3000);
		home.BrandBuildingPhone_TextField("9900990099");
		Thread.sleep(5000);
		home.BrandBuildingEmail_TextField("a@gmail.com"); 
		Thread.sleep(3000);
		//home.BrandBuildingEnquire_Button();
	//	Thread.sleep(8000);
		home.BrandBuildingCancel_Button();
		Thread.sleep(3000);
		
		
		
		
		
		
		home.PartnerWithUs_Button();
		Thread.sleep(3000);
		home.PartnerWithUsName_TextField("Vik");
		Thread.sleep(3000);
		home.PartnerWithUsDesignation_TextField("mmm");
		Thread.sleep(3000);
		home.PartnerWithUsCompany_TextField("ppp"); 
		Thread.sleep(3000);
		home.PartnerWithUsPhone_TextField("9900990099");
		Thread.sleep(3000);
		home.PartnerWithUsEmail_TextField("k@gmail.com");
		Thread.sleep(3000);
	//	home.PartnerWithUsEnquire_Button();
	//	Thread.sleep(8000);
		home.PartnerWithUsCancel_Button();
		Thread.sleep(5000);
		
		
		Util.scroll_down(driver);
		Thread.sleep(5000);
		home.Compatibledevices13_Button();
		Thread.sleep(3000);
		home.homeicon();
		Thread.sleep(3000);
		

		
		
		for(int i=0;i<=13;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.AboutUs13_Button();
		Thread.sleep(3000);
		for(int i=0;i<=3;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.product_link();
		Thread.sleep(5000);
		home.homeicon();
		Thread.sleep(3000);
		
		
		
		
		

		for(int i=0;i<=13;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.FAQ13_Button();
		Thread.sleep(3000);
		home.homeicon();
		Thread.sleep(3000);
		
		

		
		
		for(int i=0;i<=13;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.Support13_Button();
		Thread.sleep(3000);
		home.homeicon();
		Thread.sleep(3000);
		

		
		
		
		for(int i=0;i<=13;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.WhiteLable13_Button();
		Thread.sleep(3000);
		for(int i=0;i<=1;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.homeicon();
		Thread.sleep(3000);
		

		
		
		for(int i=0;i<=13;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.Executive13_Button();
		Thread.sleep(3000);
		for(int i=0;i<=1;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.homeicon();
		Thread.sleep(3000);
		

		
		
		for(int i=0;i<=13;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.Premium13_Button();
		Thread.sleep(3000);
		for(int i=0;i<=1;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.homeicon();
		Thread.sleep(3000);
		

		
		
		for(int i=0;i<=13;i++) {
		Util.scroll_down(driver);
		Thread.sleep(5000);}
		home.FaceBook_Button();
		Thread.sleep(8000);
		
		
		
		home.youTube_Button();
		Thread.sleep(8000);
		
		
		
		home.Instagram_Button();
		Thread.sleep(8000);
		
		
		
		home.Twitter_Button();
		Thread.sleep(8000);
		home.LinkedIn_Button();
		System.out.println("Home_Functional  is pass");
		
		
		
		
	}}		
		
