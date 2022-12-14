
package POM_Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic.UtilityMethods;

public class productspage extends UtilityMethods {

	public productspage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

//	HOME ICON CLICK
	@FindBy(xpath = "((//*[local-name()='svg'])[4])")
	WebElement home;

	public void homeicon() {
		clickElement(home);
	}

//	VIDEO CLICK
	@FindBy(xpath = "//img[@alt='products']")
	WebElement video;

	public void videoclick() {
		clickElement(video);
	}

	// VIDEO CANCEL CLICK
	@FindBy(xpath = "//div[@class='absolute top-2 right-2 cursor-pointer z-10 text-white']")
	WebElement video_CANCEL;

	public void video_CANCEL() {
		clickElement(video_CANCEL);
	}

//	VIDEO CLICK2
	@FindBy(xpath = "(//img[@alt='products'])[2]")
	WebElement video2;

	public void videoclick2() {
		clickElement(video2);
		
	}

	// VIDEO2 CANCEL CLICK
	@FindBy(xpath = "(//div[@class=\"absolute top-2 right-2 cursor-pointer z-10 text-white\"])[2]")
	WebElement video2_CANCEL;

	public void video2_CANCEL() {
		clickElement(video2_CANCEL);
	}

//	EXECUTIVE CARD CLICK
	@FindBy(xpath = "//li[text()='Executive Card']")
	WebElement executivecardclick;

	public void Executiveclick() {
		clickElement(executivecardclick);
	}

//	WHITE CARD CLICK
	@FindBy(xpath = "//li[text()='White Label']")
	WebElement whitelabelcardclick;

	public void whiteclick() {
		clickElement(whitelabelcardclick);
	}

//	PREMIMUM CARD CLICK
	@FindBy(xpath = "//li[text()='Premium']")
	WebElement premimumcardclick;

	public void premiumclick() {
		clickElement(premimumcardclick);
	}

// Pops CLICK
	@FindBy(xpath = "//li[text()='Pops']")
	WebElement Pops;

	public void Pops() {
		clickElement(Pops);
	}

	
	// Pops Back
	@FindBy(xpath = "//span[text()='Pops']")
	WebElement PopsBack;

	public void PopsBack() {
		clickElement(PopsBack);
	}

// Pops one**************************************************
	@FindBy(xpath = "//div[@class='lazyload-wrapper ']")
	WebElement Pops1;

	public void Pops1() {
		clickElement(Pops1);
	}

// Pops Two**************************************************
	@FindBy(xpath = "(//div[@class='lazyload-wrapper '])[2]")
	WebElement Pops2;

	public void Pops2() {
		clickElement(Pops2);
	}

// Pops Three**************************************************
	@FindBy(xpath = "(//div[@class='lazyload-wrapper '])[3]")
	WebElement Pops3;

	public void Pops3() {
		clickElement(Pops3);
	}

	// Pops QRcode**************************************************
	@FindBy(xpath = "//input[@type='radio']")
	WebElement PopsQR;

	public void PopsQR() {
		clickElement(PopsQR);
	}

	// Pops IMGcode**************************************************
	@FindBy(xpath = "//input[@type='radio']")
	WebElement PopsIMG;

	public void PopsIMG() {
		clickElement(PopsIMG);
	}
	

	// Pops Add to Cart**************************************************
	@FindBy(xpath = "//button[text()='Add to Cart']")
	WebElement PopsAdd_to_Cart;

	public void PopsAdd_to_Cart() {
		clickElement(PopsAdd_to_Cart);
	}
	
	

//	ALL CLICK
	@FindBy(xpath = "(//li[text()='All'])[1]")
	WebElement allclick;

	public void Allclick() {
		clickElement(allclick);
	}

//	DOCTOR CLICK
	@FindBy(xpath = "//li[text()='Doctor']")
	WebElement doctorclick;

	public void Doctorclick() {
		clickElement(doctorclick);
	}

//	LAWYER CLICK
	@FindBy(xpath = "//li[text()='Lawyer']")
	WebElement lawyerclick;

	public void Lawyerclick() {
		clickElement(lawyerclick);
	}

//	ACCOUNTANT CLICK
	@FindBy(xpath = "//li[text()='Accountant']")
	WebElement accountantclick;

	public void Accountantclick() {
		clickElement(accountantclick);
	}

//	SOCIALMEDIA CLICK
	@FindBy(xpath = "//li[text()='Social Media']")
	WebElement socialclick;

	public void socialmediaclick() {
		clickElement(socialclick);
	}

//	OTHERS CLICK
	@FindBy(xpath = "//li[text()='Others']")
	WebElement othersclick;

	public void Othersclick() {
		clickElement(othersclick);
	}

//	ALLCLICK2
	@FindBy(xpath = "(//li[text()='All'])[2]")
	WebElement allclick2;

	public void Allclick2() {
		clickElement(allclick2);
	}

//	METALLIC CARD CLICK
	@FindBy(xpath = "//li[text()='Metallic Print']")
	WebElement metallicclick;

	public void metalliccardclick() {
		clickElement(metallicclick);
	}

//	EMBORSSED COLOR CLICK
	@FindBy(xpath = "//li[text()='Embossed Color Print']")
	WebElement emborssedclick;

	public void emborssedcardclick() {
		clickElement(emborssedclick);
	}

//	CA CARD 8 CLICK
	@FindBy(xpath = "(//div[@class='flex w-4/12 flex-row justify-end text-center lg:w-2/12'])[7]")
	WebElement cacardclick;

	public void CACARD8click() {
		clickElement(cacardclick);
	}

//	CA CARD 8 PIC1 CLICK
	@FindBy(xpath = "//li[@class='flex cursor-pointer flex-row items-center justify-center rounded-md lg:rounded-2xl  bg-white orange-border  p-4']")
	WebElement cacardpic;

	public void cacard8pic1click() {
		clickElement(cacardpic);
	}

//	CA CARD 8 PIC2 CLICK
	@FindBy(xpath = "//li[@class='flex cursor-pointer flex-row items-center justify-center rounded-md lg:rounded-2xl  white-border light-body-f3 p-4']")
	WebElement cacardpic2;

	public void cacard8picc2click() {
		clickElement(cacardpic2);
	}

//	CA CARD 8 CLICK YOURNAME
	@FindBy(xpath = "//div[@class=\"mb-6\"]/..//input[@id='name']")
	WebElement cacardyourname;

	public void cacard8yourname(String a) {
		enter_value(cacardyourname, a);
	}

//	CA CARD 8 CLICK FLAG ICON
	@FindBy(xpath = "//div[@class=\"mb-6\"]/..//div[@class=\"selected-flag\"]")
	WebElement cacardflagicon;

	public void cacard8flagicon() {
		clickElement(cacardflagicon);
	}

//	CA CARD 8 CLICK PHONE NUMBER
	@FindBy(xpath = "//div[@class=\"mb-6\"]/..//input[@placeholder=\"081234 56789\"]")
	WebElement cacardphonenumber;

	public void cacard8phonenumber(String a) {
		enter_value(cacardphonenumber, a);
	}

//	CA CARD 8 YOUR DESIGNATION
	@FindBy(id = "designation")
	WebElement cacarddesignation;

	public void cacard8yourdesignation(String a) {
		enter_value(cacarddesignation, a);
	}

//	CA CARD 8 YOUR EMAIL
	@FindBy(xpath = "//div[@class=\"mb-6\"]/..//input[@id=\"email\"]")
	WebElement cacardmail;

	public void cacard8youremail(String a) {
		enter_value(cacardmail, a);
	}

//	CA CARD 8 ADD TO CART
	@FindBy(xpath = "//button[text()='Add to Cart']")
	WebElement cacardaddtocart;

	public void cacard8addtocart() {
		clickElement(cacardaddtocart);
	}

//	CA CARD 8 CLICKHERE LINK CLICK
	@FindBy(xpath = "//span[text()='Click here']")
	WebElement cacardclickhere;

	public void cacard8clickhere() {
		clickElement(cacardclickhere);
	}

//	CA CARD 8 INSIDE CLICKHERE LINK YOURNAME
	@FindBy(xpath = "//p[text()='Provide your information and our design team will contact you.']/..//input[@id=\"name\"]")
	WebElement clickhereyourname;

	public void cacard8clickhereyourname(String a) {
		enter_value(clickhereyourname, a);
	}

//	CA CARD 8 INSIDE CLICKHERE LINK YOUREMAIL
	@FindBy(xpath = "//p[text()='Provide your information and our design team will contact you.']/..//input[@id=\"email\"]")
	WebElement clickhereyouremail;

	public void cacard8clickhereyouremail(String a) {
		enter_value(clickhereyouremail, a);
	}

//	CA CARD 8 INSIDE CLICKHERE LINK FLAGICON
	@FindBy(xpath = "//p[text()='Provide your information and our design team will contact you.']/..//div[@class=\"selected-flag\"]")
	WebElement clickhereflagicon;

	public void cacard8clickhereflagicon() {
		clickElement(clickhereflagicon);
	}

//	CA CARD 8 INSIDE CLICKHERE LINK YOURNUMBER
	@FindBy(xpath = "//p[text()='Provide your information and our design team will contact you.']/..//input[@placeholder=\"081234 56789\"]")
	WebElement clickhereyournumber;

	public void cacard8clickhereyournumber(String a) {
		enter_value(clickhereyournumber, a);
	}

//	CA CARD 8 INSIDE CLICKHERE LINK SUBMIT
	@FindBy(xpath = "//p[text()='Provide your information and our design team will contact you.']/..//button[text()='Submit']")
	WebElement clickheresubmit;

	public void cacard8clickheresubmit() {
		clickElement(clickheresubmit);
	}

//	CA CARD 8 INSIDE CLICKHERE LINK INTO ICON
	@FindBy(xpath = "((//*[local-name()='svg'])[7])")
	WebElement clickhereintoicon;

	public void cacard8clickhereintoicon() {
		clickElement(clickhereintoicon);
	}

//	EXECUTIVE C3 CARD CLICK
	@FindBy(xpath = "//h3[text()='Executive_C3']")
	WebElement executivec3click;

	public void Executivec3card() {
		clickElement(executivec3click);
	}

//	DOCTOR CARD 12 CLICK
	@FindBy(xpath = "//h3[text()='Doctor Card 12']")
	WebElement doctorcardclick;

	public void doctorcard12() {
		clickElement(doctorcardclick);
	}

//	WHITE LABEL CARD 6 CLICK
	@FindBy(xpath = "//h3[text()='White Label Card 6']")
	WebElement whitelabel6click;

	public void whitelabelcardclick() {
		clickElement(whitelabel6click);
	}

//	WHITE LABEL CARD 6 PIC1 CLICK
	@FindBy(xpath = "//li[@class=\"relative flex cursor-pointer flex-row items-center justify-center rounded-md lg:rounded-2xl  bg-white orange-border  p-2\"]")
	WebElement whitelablepicclick;

	public void whitelabelcardpic1click() {
		clickElement(whitelablepicclick);
	}

//	WHITE LABEL CARD 6 PIC3 CLICK
	@FindBy(xpath = "//div[@class=\"w-full lg:w-3/5 flex flex-col items-center justify-center\"]/../..//li[@class=\"flex cursor-pointer flex-row items-center justify-center rounded-md lg:rounded-2xl  white-border light-body-f3 p-4\"]")
	WebElement whitelabelclick;

	public void whitelabelcardpic2click() {
		clickElement(whitelabelclick);
	}

//	WHITE LABEL CARD 6 YOUR NAME TEXTFIELD CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//input[@id=\"name\"]")
	WebElement whitelabelnametextfield;

	public void whitelabelyournametextfield(String a) {
		enter_value(whitelabelnametextfield, a);
	}

//	WHITE LABEL CARD 6 YOUR DESIGNATION TEXTFIELDCLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//input[@id=\"designation\"]")
	WebElement whitelabeldesignation;

	public void whitelabeldesignationtextfiled(String a) {
		enter_value(whitelabeldesignation, a);
	}

//	WHITE LABEL CARD 6 FLAG ICON CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/../..//div[@class=\"selected-flag\"]")
	WebElement whitelabelflagicon;

	public void whitelabelcardflagicon() {
		clickElement(whitelabelflagicon);
	}

//	WHITE LABEL CARD 6 PHONENUMBER CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//input[@placeholder=\"081234 56789\"]")
	WebElement whitelabelcardphonenumber;

	public void whitelabelcard6phonenumber(String a) {
		enter_value(whitelabelcardphonenumber, a);
	}

//	WHITE LABEL CARD 6 YOUR COMPANY CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//input[@id=\"company\"]")
	WebElement whitelabelyourcompany;

	public void whitelabelcardyourcompany(String a) {
		enter_value(whitelabelyourcompany, a);
	}

//	WHITE LABEL CARD 6 UPLOAD CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//button[@class=\"border shadow-md w-full p-4 text-gray-400 flex flex-col justify-center items-center\"]")
	WebElement whitelabelupload;

	public void whitelabelcarduplad() {
		clickElement(whitelabelupload);
	}

//	WHITE LABEL CARD 6 ADD TO CART CLICK
	@FindBy(xpath = "//button[text()='Add to Cart']")
	WebElement whitelabeladdtocart;

	public void whitelabelcardaddtocart() {
		clickElement(whitelabeladdtocart);
	}

//	PREMIMUM CARD 4 CLICK
	@FindBy(xpath = "//h3[text()='Premium Card 4']")
	WebElement premimumcard;

	public void premimumcard4click() {
		clickElement(premimumcard);
	}

//	PREMIMUM CARD 4 NAME CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//input[@id=\"name\"]")
	WebElement premimumname;

	public void premimumcardnameclick(String a) {
		enter_value(premimumname, a);
	}

//	PREMIMUM CARD 4 FLAGICON CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//div[@class=\"selected-flag\"]")
	WebElement premimumflag;

	public void premimumcardflagicon() {
		clickElement(premimumflag);
	}

//	PREMIMUM CARD 4 PHONENUMBER CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//input[@placeholder=\"081234 56789\"]")
	WebElement premimumnumber;

	public void premimumcardnumber(String a) {
		enter_value(premimumnumber, a);
	}

//	PREMIMUM CARD 4 DESIGNATION CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//input[@id=\"designation\"]")
	WebElement premimumdesignation;

	public void premimumcarddesignation(String a) {
		enter_value(premimumdesignation, a);
	}

//	PREMIMUM CARD 4 COMPANY CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//input[@id=\"company\"]")
	WebElement premimumcompany;

	public void premimumcompany(String a) {
		enter_value(premimumcompany, a);
	}

//	PREMIMUM CARD 4 EMAIL CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//input[@id=\"email\"]")
	WebElement premimumemail;

	public void premimumemailclick(String a) {
		enter_value(premimumemail, a);
	}

//	PREMIMUM CARD 4 UPLOAD CLICK
	@FindBy(xpath = "//h2[text()='Please enter the details to be printed on the card.']/..//button[@class=\"border shadow-md w-full p-4 text-gray-400 flex flex-col justify-center items-center\"]")
	WebElement premimumupload;

	public void premimumcardupload() {
		clickElement(premimumupload);
	}

//	PREMIMUM CARD 4 ADDTOCART CLICK
	@FindBy(xpath = "//button[text()='Add to Cart']")
	WebElement premimumaddtocart;

	public void premimumcardaddtocart() {
		clickElement(premimumaddtocart);
	}

//	load more CLICK
	@FindBy(xpath = "//button[text()='Load more']")
	WebElement loadmore;

	public void loadmore() {
		clickElement(loadmore);
	}

//	Click here CLICK
	@FindBy(xpath = "//span[text()='Click here']")
	WebElement Click_here;

	public void clickhere() {
		clickElement(Click_here);
	}

//	YOUR NAME TEXTFIELD
	@FindBy(id = "name")
	WebElement yourname;

	public void yournametextfield(String a) {
		enter_value(yourname, a);
	}

//	YOUR EMAIL TEXTFIELD
	@FindBy(id = "email")
	WebElement youremail;

	public void youremailtextfield(String a) {
		enter_value(youremail, a);
	}

//	YOUR PHONE NUMBER
	@FindBy(xpath = "//input[@placeholder='081234 56789']")
	WebElement yourphone;

	public void yourphonenumber(String a) {
		enter_value(yourphone, a);
	}

//	SUBMIT
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submit;

	public void submitclick() {
		clickElement(submit);
	}

	// Checkout
	@FindBy(xpath = "//button[@class='base-button w-56']")
	WebElement checkout;

	public void checkout() {
		clickElement(checkout);
	}

	// Add card
	@FindBy(xpath = "//button[@class=\" button-orange my-2 mx-auto block w-10/12 rounded py-3 px-4 font-semibold text-white lg:w-4/5\"]")
	WebElement Addcard;

	public void Addcard() {
		clickElement(Addcard);
	}
	
	
	
	// Add card
		@FindBy(xpath = "//button[text()='Add more']")
		WebElement Addcardpops;

		public void Addcardpops() {
			clickElement(Addcardpops);
		}
		
	
	

}