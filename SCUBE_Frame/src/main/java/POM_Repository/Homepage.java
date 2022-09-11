package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.UtilityMethods;

public class Homepage extends UtilityMethods {
	WebDriver driver;
	public Homepage(WebDriver driver){
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	//HOME ICON
	@FindBy(xpath = "//span[text()='Home']")
	WebElement home;
	
	public void homeicon() {
		clickElement(home);
	}
	
	
	// To Click Product Link on 1 Slide **************************
	@FindBy(xpath="//a[@class='block p-4']")
	public WebElement product;
	public void  product_link() 
	{
		clickElement(product);
	}
	
	//To Click Compatible devices Link on 1 Slide********************
	@FindBy(xpath="(//a[@class='block p-4'])[2]")
    public WebElement Compatibledevices;
	public void  Compatibledevices_link() 
	{
		clickElement(Compatibledevices);
	}
	
	//To Click support link on 1 slide ********************************
	@FindBy(xpath="(//a[@class='block p-4'])[3]")
	public WebElement support;
    public void  support_link() 
    {
         clickElement(support);
    }
    
    // To Click TrackOrder link on 1 slide ****************************
	@FindBy(xpath="(//a[@class='block p-4'])[4]")
	public WebElement TrackOrder;
    public void  TrackOrder_link() 
    {
         clickElement(TrackOrder);
    }
    
    // To click on Country DropDown in 1 Slide *************************
    @FindBy(xpath="//img[@alt='INR']")
	public WebElement country;
    public void  country_DropDown() 
    {
         clickElement(country);
    }
  
    //To Select Any country in Dropdown in 1st slide ********************
    @FindBy(xpath="//img[@alt='AED']")
	public WebElement AEDcountry;
    public void  AEDcountry_DropDown() 
    {
         clickElement(AEDcountry);
    }
    
    // TO Select INR country in Dropdown in 1st slide ***********************
    @FindBy(xpath="//img[@alt='INR']")
   	public WebElement INRcountry;
    public void  INRcountry_DropDown() 
    {
            clickElement(INRcountry);
    }
     
     // TO Select South Africa country in Dropdown in 1st slide *******************
     @FindBy(xpath="//img[@alt='ZAR']")
     public WebElement ZARcountry;
     public void  ZARcountry_DropDown() 
     {
               clickElement(ZARcountry);
     }
          
      //To Click on Add to cart symbol **********************************
      @FindBy(xpath="(//*[local-name()='svg'])[3]")
      public WebElement AddToCart;
      public void  AddToCart_link() 
      {
                 clickElement(AddToCart);
      }
      
      //To Click on Be creative Block in 1 slide **************************
      @FindBy(xpath="//span[@class='text-lg font-semibold leading-7 text-white lg:w-2/3']")
      public WebElement BeCreative;
      public void  BeCreative_Block() 
      {
                 clickElement(BeCreative);
      }
      
      // To click on Corporate Bulk Orders Block in 1 slide *****************
      @FindBy(xpath="(//span[@class='text-lg font-semibold leading-7 text-white lg:w-2/3'])[2]")
      public WebElement CorporateBulkOrders;
      public void CorporateBulkOrders_Block() 
      {
                 clickElement(CorporateBulkOrders);
      }
      
      // To send name in Bulk order form in 1 slide *************************** 
      @FindBy(xpath="(//input[@name='name'])[1]")
      public WebElement BulkOrderName;
      public void BulkOrderName_TextField(String a) 
      {
    	  enter_value(BulkOrderName,a);
      }
     
      // To send designation in Bulk order form in 1 slide *********************
      @FindBy(xpath="(//input[@name='designation'])[1]")
      public WebElement BulkOrderDesignation;
      public void BulkOrderdesignation_TextField(String a) 
      {
    	  enter_value(BulkOrderDesignation,a);
      }
     
      // To send Company name in Bulk order form in 1 slide *********************
      @FindBy(xpath="(//input[@name='company'])[1]")
      public WebElement BulkOrderCompany;
      public void BulkOrderCompany_TextField(String a) 
      {
    	  enter_value(BulkOrderCompany,a);
      }
     
      // To send Phone no in Bulk order form in 1 slide *********************
      @FindBy(xpath="(//input[@type='tel'])[1]")
      public WebElement BulkOrderPhone;
      public void BulkOrderPhone_TextField(String a) 
      {
    	  enter_value(BulkOrderPhone,a);
      }
      
      // To Click on Country Dropdown in Bulk order form in 1 slide *********************
      @FindBy(xpath="(//div[@class='iti-flag in'])[1]")
      public WebElement BulkOrderPhoneFlag;
      public void BulkOrderPhoneFlag_DropDown() 
      {
                 clickElement(BulkOrderPhoneFlag);
      }
      // To Select Any country in Bulk order form in 1 slide ********************************
      @FindBy(xpath="(//span[@class='country-name'])[2]")
      public WebElement BulkOrderPhoneFlagAFG;
      public void BulkOrderPhoneFlagAGF_DropDown() 
      {
                 clickElement(BulkOrderPhoneFlagAFG);
      }
     
      // To send Email in Bulk order form in 1 slide **************************
      @FindBy(xpath="(//input[@id='email'])[1]")
      public WebElement BulkOrderEmail;
      public void BulkOrderEmail_TextField(String a) 
      {
    	  enter_value(BulkOrderEmail,a);
      }
      
      //To send no of quantity in Bulk Order in  1 slide ****************
      @FindBy(xpath="(//input[@name='qty'])[1]")
      public WebElement BulkOrderReq;
      public void BulkOrderReq_TextField(String a) 
      {
    	  enter_value(BulkOrderReq,a);
      }
      
      // To click date Textfield in Bulk Order in  1 slide ****************
      @FindBy(xpath="//input[@class='react-datepicker-ignore-onclickoutside']")
      public WebElement BulkOrderDate;
      public void BulkOrderdate_TextField() 
      {
    	  clickElement(BulkOrderDate);
      }
     
      // To select 30 th date in Bulk Order in  1 slide ****************
      @FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--030 react-datepicker__day--selected react-datepicker__day--weekend']")
      public WebElement BulkOrderDate30;
      public void BulkOrderdate_Widget() 
      
      {
    	  clickElement(BulkOrderDate30);
      }
      
      // To click on Enquire Button in Bulk Order in  1 slide ****************
      @FindBy(xpath="(//button[@class='base-button w-full'])[1]")
      public WebElement BulkOrderEnquire;
      public void BulkOrderEnquire_Button() 
      {
    	  clickElement(BulkOrderEnquire);
      }
      
      // To click cancel Symbol of Bulk Order in  1 slide ****************
      @FindBy(xpath="(//div[@class='absolute top-2 right-2 cursor-pointer z-10 text-black'])[1]")
      public WebElement BulkOrderCancel;
      public void BulkOrderCancel_Button() 
      {
    	  clickElement(BulkOrderCancel);
      }
      
      //To click on video on 1 slide ***************************
      @FindBy(xpath="(//*[local-name()='svg'])[6]")
      public WebElement HomeVideo;
      public void  HomeVideo_video() 
      {
    	  clickElement(HomeVideo);
      }
     
      // To click on cancel button of video on 1 slide ***************************
      @FindBy(xpath="//div[@class='absolute top-2 right-2 cursor-pointer z-10 text-white']")
      public WebElement HomeVideoCancel;
      public void  HomeVideoCancel_video() 
      {
    	  clickElement(HomeVideoCancel);
      }
      
      // To click on Get Yours button in 3 slide ***************************
      @FindBy(xpath="//a[text()='Get yours']")
      public WebElement GetYours;
      public void  GetYours_Button() 
      {
    	  clickElement(GetYours);
      }
      
      
      // To click on Get Card in 4 slide (Pops) **************************
      @FindBy(xpath="//p[text()='One Scube Pop']")
      public WebElement Onepops;
      public void  Onepops() 
      {
    	  clickElement(Onepops);
      }
      
      // To click on Get Card in 4 slide (Pops) **************************
      @FindBy(xpath="//p[text()='Two Scube Pops']")
      public WebElement Twopops;
      public void  Twopops() 
      {
    	  clickElement(Twopops);
      }
      
      
      // To click on Get Card in 4 slide (Pops) **************************
      @FindBy(xpath="//p[text()='Two Scube Pops']")
      public WebElement Threepops;
      public void  Threepops() 
      {
    	  clickElement(Threepops);
      }
      
      
      // To click on Get Card in 4 slide (Pops) **************************
      @FindBy(xpath="//p[text()=' //span[text()='Order In Bulk']']")
      public WebElement Bulkpops;
      public void  Bulkpops() 
      {
    	  clickElement(Bulkpops);
      }
      
      // To send name in Bulk order form in 4 slide *************************** 
      @FindBy(xpath="(//input[@name='name'])[1]")
      public WebElement BulkOrderNamepops;
      public void BulkOrderNamepops_TextField(String a) 
      {
    	  enter_value(BulkOrderNamepops,a);
      }
     
      // To send designation in Bulk order form in 4 slide *********************
      @FindBy(xpath="(//input[@name='designation'])[1]")
      public WebElement BulkOrderDesignationpops;
      public void BulkOrderdesignationpops_TextField(String a) 
      {
    	  enter_value(BulkOrderDesignationpops,a);
      }
     
      // To send Company name in Bulk order form in 4 slide *********************
      @FindBy(xpath="(//input[@name='company'])[1]")
      public WebElement BulkOrderCompanypops;
      public void BulkOrderCompanypops_TextField(String a) 
      {
    	  enter_value(BulkOrderCompanypops,a);
      }
     
      // To send Phone no in Bulk order form in 4 slide *********************
      @FindBy(xpath="(//input[@type='tel'])[1]")
      public WebElement BulkOrderPhonepops;
      public void BulkOrderPhonepops_TextField(String a) 
      {
    	  enter_value(BulkOrderPhonepops,a);
      }
  
      // To send Email in Bulk order form in 4 slide **************************
      @FindBy(xpath="(//input[@id='email'])[1]")
      public WebElement BulkOrderEmailpops;
      public void BulkOrderEmailpops_TextField(String a) 
      {
    	  enter_value(BulkOrderEmailpops,a);
      }
      
      //To send no of quantity in Bulk Order in  4 slide ****************
      @FindBy(xpath="(//input[@name='qty'])[1]")
      public WebElement BulkOrderReqpops;
      public void BulkOrderReqpops_TextField(String a) 
      {
    	  enter_value(BulkOrderReqpops,a);
      }
      
      // To click date Textfield in Bulk Order in  4 slide ****************
      @FindBy(xpath="//input[@class='react-datepicker-ignore-onclickoutside']")
      public WebElement BulkOrderDatepops;
      public void BulkOrderdatepops_TextField() 
      {
    	  clickElement(BulkOrderDatepops);
      }
     
      // To select 30 th date in Bulk Order in  4 slide ****************
      @FindBy(xpath="//div[@class='react-datepicker__day react-datepicker__day--030 react-datepicker__day--selected react-datepicker__day--weekend']")
      public WebElement BulkOrderDate30pops;
      public void BulkOrderdate_Widgetpops() 
      
      {
    	  clickElement(BulkOrderDate30);
      }
      
      // To click on Enquire Button in Bulk Order in  4 slide ****************
      @FindBy(xpath="(//button[@class='base-button w-full'])[1]")
      public WebElement BulkOrderEnquirepops;
      public void BulkOrderEnquire_Buttonpops() 
      {
    	  clickElement(BulkOrderEnquirepops);
      }
      
      // To click cancel Symbol of Bulk Order in  1 slide ****************
      @FindBy(xpath="(//div[@class='absolute top-2 right-2 cursor-pointer z-10 text-black'])[1]")
      public WebElement BulkOrderCancelpops;
      public void BulkOrderCancel_Buttonpops() 
      {
    	  clickElement(BulkOrderCancelpops);
      }
      
      // To click on Get Card in 5 slide (Executive) **************************
      @FindBy(xpath="//a[text()='Select']")
      public WebElement ExecutiveGetCard;
      public void  ExecutiveGetCard_Button() 
      {
    	  clickElement(ExecutiveGetCard);
      }
      
      // To click on Get Card in 6 slide (White) **************************
      @FindBy(xpath="//a[text()='Select']")
      public WebElement WhiteGetCard;
      public void  WhiteGetCard_Button() 
      {
    	  clickElement(WhiteGetCard);
      }
      
      // To click on Get Card in 7 slide (Premium) **************************
      @FindBy(xpath="//a[text()='Select']")
      public WebElement PremiumGetCard;
      public void  PremiumGetCard_Button() 
      {
    	  clickElement(PremiumGetCard);
      }
   
      
      // To click on Play store button 12 slide *********************************
      @FindBy(xpath="//a[text()='Play Store']")
      public WebElement PlayStore;
      public void  PlayStore_Button() 
      {
    	  clickElement(PlayStore);
      }
    
      // To click on App store button 12 slide ****************************
      @FindBy(xpath="//a[text()='App Store']")
      public WebElement AppStore;
      public void  AppStore_Button() 
      {
    	  clickElement(AppStore);
      }
     
      // To click on plus sign on 13 slide ***********************************
      @FindBy(xpath="(//*[local-name()='svg'])[11]")
      public WebElement PlusSign;
      public void  PlusSign_Button() 
      {
    	  clickElement(PlusSign);
      }
      
      // To Click on View All link in 13 slide *******************************
      @FindBy(xpath="//a[@class='underline block text-right mt-6']")
      public WebElement ViewAll;
      public void  ViewAll_link() 
      {
    	  clickElement(ViewAll);
      }
     
      // To click on contact us button in 14 slide ****************************
      @FindBy(xpath="//button[text()='Contact Us']")
      public WebElement ContactUs;
      public void  ContactUs_link() 
      {
    	  clickElement(ContactUs);
      }
      
      // To send name to bulk order form in 14 slide *******************************
      @FindBy(xpath="//input[@placeholder='Your name*']")
      public WebElement BulkOrderName12;
      public void BulkOrderName12_TextField(String a) 
      {
    	  enter_value(BulkOrderName12,a);
      }
     
      // To send designation to bulk order form in 14 slide ******************
      @FindBy(xpath="//input[@placeholder='Designation*']")
      public WebElement BulkOrderDesignation12;
      public void BulkOrderdesignation12_TextField(String a) 
      {
    	  enter_value(BulkOrderDesignation12,a);
      }
      
      // To send company name to bulk order form in 14 slide ******************
      @FindBy(xpath="//input[@placeholder='Company name*']")
      public WebElement BulkOrderCompany12;
      public void BulkOrderCompany12_TextField(String a) 
      {
    	  enter_value(BulkOrderCompany12,a);
      }
     
      // To send Phone no to bulk order form in 14 slide ******************
      @FindBy(xpath="//input[@placeholder='081234 56789']")
      public WebElement BulkOrderPhone12;
      public void BulkOrderPhone12_TextField(String a) 
      {
    	  enter_value(BulkOrderPhone12,a);
      }
      // To click on dropdown of country in bulk order form in 14 slide ******************
      @FindBy(xpath="(//div[@class='iti-flag in'])[4]")
      public WebElement BulkOrderPhoneFlag12;
      public void BulkOrderPhoneFlag12_DropDown() 
      {
                 clickElement(BulkOrderPhoneFlag12);
      }
      
      // To select any country in bulk order form in 14 slide ***************
      @FindBy(xpath="(//span[@class='country-name'])[2]")
      public WebElement BulkOrderPhoneFlagAFG12;
      public void BulkOrderPhoneFlagAGF12_DropDown() 
      {
                 clickElement(BulkOrderPhoneFlagAFG12);
      }
      
      // To send email to in bulk order form in 14 slide *************** 
      @FindBy(xpath="//input[@placeholder='Email Address*']")
      public WebElement BulkOrderEmail12;
      public void BulkOrderEmail12_TextField(String a) 
      {
    	  enter_value(BulkOrderEmail12,a);
      }
      
      // To send no of quantity in bulk order form in 14 slide *************** 
      @FindBy(xpath="//input[@placeholder='Required qty*']")
      public WebElement BulkOrderReq12;
      public void BulkOrderReq12_TextField(String a) 
      {
    	  enter_value(BulkOrderReq12,a);
      }
    
      // To click on date text field in bulk order form in 14 slide *************** 
      @FindBy(xpath="(//input[@placeholder='Click to select a date'])[1]")
      public WebElement BulkOrderDate12;
      public void BulkOrderDate12_TextField() 
      {
    	  clickElement(BulkOrderDate12);
      }
     
      // To select 30th date in bulk order form in 14 slide *************** 
      @FindBy(xpath="class=\"react-datepicker__day react-datepicker__day--026 react-datepicker__day--today\"")
      public WebElement BulkOrderDate30_12;
      public void BulkOrderdate12_Widget() 
      {
    	  clickElement(BulkOrderDate30_12);
      }
      
      // To click on Enquire Button in bulk order form in 14 slide *************** 
      @FindBy(xpath="//button[text()='Enquire now']")
      public WebElement BulkOrderEnquire12;
      public void BulkOrderEnquire12_Button() 
      {
    	  clickElement(BulkOrderEnquire12);
      }
      
   // To click on Enquire Button in bulk order form in 14 slide *************** 
      @FindBy(xpath="//button[@class='swal-button swal-button--confirm']")
      public WebElement BulkOrderOk;
      public void BulkOrderOk12_Button() 
      {
    	  clickElement(BulkOrderEnquire12);
      }
      
    
       
      // To click on cancel symbol of bulk order frame  in 14 slide *************** 
      @FindBy(xpath="(//*[local-name()='svg'])[19]")
      public WebElement BulkOrderCancel12;
      public void BulkOrderCancel12_Button() 
      {
    	  clickElement(BulkOrderCancel12);
      }
      
      // To click on Brand building in 14 slide *******************************  
      @FindBy(xpath="(//div[@class='flex w-full flex-row items-end justify-end'])[1]")
      public WebElement BrandBuilding;
      public void BrandBuilding_Button() 
      {
    	  clickElement(BrandBuilding);
      }
     
      // To send name in Brand building Form in 14 slide *************************
      @FindBy(xpath="//input[@placeholder='Your name*']")
      public WebElement BrandBuildingName;
      public void BrandBuildingName_TextField(String a) 
      {
    	  enter_value(BrandBuildingName,a);
      }
     
      // To send designation in Brand building Form in 14 slide *************************
      @FindBy(xpath="//input[@placeholder='Designation*']")
      public WebElement BrandBuildingDesignation;
      public void BrandBuildingDesignation_TextField(String a) 
      {
    	  enter_value(BrandBuildingDesignation,a);
      }
     
      // To send company name in Brand building Form in 14 slide *************************
      @FindBy(xpath="//input[@placeholder='Company name*']")
      public WebElement BrandBuildingCompany;
      public void BrandBuildingCompany_TextField(String a) 
      {
    	  enter_value(BrandBuildingCompany,a);
      }
      
      // To send phone number in Brand building Form in 14 slide *************************
      @FindBy(xpath="//input[@placeholder='081234 56789']")
      public WebElement BrandBuildingPhone;
      public void BrandBuildingPhone_TextField(String a) 
      {
    	  enter_value(BrandBuildingPhone,a);
      }
    
      // To click on flag   in Brand building Form in 14 slide *************************
      @FindBy(xpath="(//div[@class='iti-flag in'])[10]")
      public WebElement BrandBuildingPhoneFlag;
      public void BrandBuildingPhoneFlag_DropDown() 
      {
                 clickElement(BulkOrderPhoneFlag);
      }
      
      // To select different flag in Brand building Form in 14 slide *************************
      @FindBy(xpath="(//span[@class='country-name'])[2]")
      public WebElement  BrandBuildingPhoneFlagAFG;
      public void  BrandBuildingPhoneFlagAGF_DropDown() 
      {
                 clickElement( BrandBuildingPhoneFlagAFG);
      }
      
      // To send Email  in Brand building Form in 14 slide *****************
      @FindBy(xpath="//input[@placeholder='Email Address*']")
      public WebElement BrandBuildingEmail;
      public void BrandBuildingEmail_TextField(String a) 
      {
    	  enter_value(BrandBuildingEmail,a);
      }
      
      // To click Enquire button  in Brand building Form in 14 slide *****************
      @FindBy(xpath="//button[text()='Enquire now']")
      public WebElement BrandBuildingEnquire;
      public void BrandBuildingEnquire_Button() 
      {
    	  clickElement(BrandBuildingEnquire);
      }
     
      //To cancel  Brand building Form in 14 slide *****************
      @FindBy(xpath="(//*[local-name()='svg'])[19]")
      public WebElement BrandBuildingCancel;
      public void BrandBuildingCancel_Button() 
      {
    	  clickElement(BrandBuildingCancel);
      }
      
      // To click on Partner with us form in 14 slide ******************************* 
      @FindBy(xpath="(//div[@class='flex w-full flex-row items-end justify-end'])[2]")
      public WebElement PartnerWithUs;
      public void PartnerWithUs_Button() 
      {
    	  clickElement(PartnerWithUs);
      }
 
      // To send name in partner with us  Form in 14 slide *************************
      @FindBy(xpath="//input[@placeholder='Your name*']")
      public WebElement PartnerWithUsName;
      public void PartnerWithUsName_TextField(String a) 
      {
    	  enter_value(PartnerWithUsName,a);
      }
     
      // To send Designation in Partner with Form in 14 slide *************************
      @FindBy(xpath="//input[@placeholder='Designation*']")
      public WebElement PartnerWithUsDesignation;
      public void PartnerWithUsDesignation_TextField(String a) 
      {
    	  enter_value(PartnerWithUsDesignation,a);
      }
      
      // To send company name in Partner with Form in 14 slide *******************
      @FindBy(xpath="//input[@placeholder='Company name*']")
      public WebElement PartnerWithUsCompany;
      public void PartnerWithUsCompany_TextField(String a) 
      {
    	  enter_value(PartnerWithUsCompany,a);
      }
     
      // To send Phone no in Partner with Form in 14 slide ******************* 
      @FindBy(xpath="//input[@placeholder='081234 56789']")
      public WebElement PartnerWithUsPhone;
      public void PartnerWithUsPhone_TextField(String a) 
      {
    	  enter_value(PartnerWithUsPhone,a);
      }
     
      // To click on flag in Partner with Form in 14 slide *******************
      @FindBy(xpath="(//div[@class='iti-flag in'])[7]")
      public WebElement PartnerWithUsPhoneFlag;
      public void PartnerWithUsPhoneFlag_DropDown() 
      {
                 clickElement(PartnerWithUsPhoneFlag);
      }
     
      // To Select country in Partner with Form in 14 slide *******************
      @FindBy(xpath="(//span[@class='country-name'])[2]")
      public WebElement  PartnerWithUsPhoneFlagAFG;
      public void  PartnerWithUsPhoneFlagAGF_DropDown() 
      {
                 clickElement( PartnerWithUsPhoneFlagAFG);
      }
      
      // To send email in Partner with Form in 14 slide *******************
      @FindBy(xpath="//input[@placeholder='Email Address*']")
      public WebElement PartnerWithUsEmail;
      public void PartnerWithUsEmail_TextField(String a) 
      {
    	  enter_value(PartnerWithUsEmail,a);
      }
    
      // // To click on enquire button in Partner with Form in 14 slide *******************
      @FindBy(xpath="//button[text()='Enquire now']")
      public WebElement PartnerWithUsEnquire;
      public void PartnerWithUsEnquire_Button() 
      {
    	  clickElement(PartnerWithUsEnquire);
      }
     
   // To  cancel  Partner with Form in 14 slide *******************
      @FindBy(xpath="(//*[local-name()='svg'])[19]")
      public WebElement PartnerWithUsCancel;
      public void PartnerWithUsCancel_Button() 
      {
    	  clickElement(PartnerWithUsCancel);
      }
      
      //Compartable Devices in 15 *******************************************
      @FindBy(xpath="(//li[@class='mr-4'])[2]")
      public WebElement Compatibledevices13;
      public void Compatibledevices13_Button() 
      {
    	  clickElement(Compatibledevices13);
      }
      
      //About us in 15 *********************************************************
      @FindBy(xpath="(//li[@class='mr-4'])[3]")
      public WebElement AboutUs13;
      public void AboutUs13_Button() 
      {
    	  clickElement(AboutUs13);
      }
     
      //FAQ in 15***************************************************************
      @FindBy(xpath="(//li[@class='mr-4'])[4]")
      public WebElement FAQ13;
      public void FAQ13_Button() 
      {
    	  clickElement(FAQ13);
      }
      
      //Support in 15*******************************************************
      @FindBy(xpath="(//li[@class='mr-4'])[5]")
      public WebElement Support13;
      public void Support13_Button() 
      {
    	  clickElement(Support13);
      }
      
      //TrackOrder in 15*****************************************************
      @FindBy(xpath="(//li[@class='mr-4'])[6]")
      public WebElement TrackOrder13;
      public void TrackOrder13_Button() 
      {
    	  clickElement(TrackOrder13);
      }
      
      //WhiteLable in 15 ***************************************************
      @FindBy(xpath="(//li[@class='mr-1 lg:mr-4'])[1]")
      public WebElement WhiteLable13;
      public void WhiteLable13_Button() 
      {
    	  clickElement(WhiteLable13);
      }
      
      //Executive in 15*****************************************************
      @FindBy(xpath="(//li[@class='mr-1 lg:mr-4'])[2]")
      public WebElement Executive13;
      public void Executive13_Button() 
      {
    	  clickElement(Executive13);
      }
      
      //Premium in 15*****************************************************
      @FindBy(xpath="(//li[@class='mr-1 lg:mr-4'])[3]")
      public WebElement Premium13;
      public void Premium13_Button() 
      {
    	  clickElement(Premium13);
      }
      
      //FaceBook in 15*****************************************************
      @FindBy(xpath="(//a[@rel='noreferrer'])[3]")
      public WebElement FaceBook;
      public void FaceBook_Button() 
      {
    	  clickElement(FaceBook);
      }
    
      //Youtube in 15*********************************************************
      @FindBy(xpath="(//a[@rel='noreferrer'])[4]")
      public WebElement youTube;
      public void youTube_Button() 
      {
    	  clickElement(youTube);
      }
  
      //Insta in 15*************************************************************
      @FindBy(xpath="(//a[@rel='noreferrer'])[5]")
      public WebElement Instagram;
      public void Instagram_Button() 
      {
    	  clickElement(Instagram);
      }
    
      //Twitter in 15*******************************************************
      @FindBy(xpath="(//a[@rel='noreferrer'])[6]")
      public WebElement Twitter;
      public void Twitter_Button() 
      {
    	  clickElement(Twitter);
      }
    
      //Linkedin in 15******************************************************
      @FindBy(xpath="(//a[@rel='noreferrer'])[7]")
      public WebElement LinkedIn;
      public void LinkedIn_Button() 
      {
    	  clickElement(LinkedIn);
      }
    
      //Privacy Policy in 15************************************************
      @FindBy(xpath="(//li[@class='mr-1 lg:mr-4 text-center'])[1]")
      public WebElement PrivacyPolicy;
      public void  PrivacyPolicy_Button() 
      {
    	  clickElement( PrivacyPolicy);
      }
    
      //CookiePolicy in 15***************************************************
      @FindBy(xpath="(//li[@class='mr-1 lg:mr-4 text-center'])[2]")
      public WebElement CookiePolicy;
      public void  CookiePolicy_Button() 
      {
    	  clickElement( CookiePolicy);
      }
    
      //Terms button in 15*****************************************************
      @FindBy(xpath="(//li[@class='mr-1 lg:mr-4 text-center'])[3]")
      public WebElement Terms;
      public void  Terms_Button() 
      {
    	  clickElement(Terms);
      }
      
     //Whats app in 15*********************************************************
      @FindBy(xpath="//img[@alt='whatsapp']")
      public WebElement Whatsapp;
      public void Whatsapp_Button() 
      {
    	  clickElement(Whatsapp);
      } 
      
}
