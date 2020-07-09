package pomJOB;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class PersonalDetails {

	WebDriver driver;
	 public PersonalDetails(WebDriver driver){
	 this.driver=driver;
	 }
	 
	 By name= By.id("fname");
	 By emailID= By.id("email");
	 By password= By.name("password");
	 By number= By.name("number");
	 By weYear= By.xpath("//*[@id=\"basicDetailForm\"]/resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input");
	 By weMonth= By.name("expMonth");
	 By uploadResume= By.name("uploadCV");
	 By registerButton= By.name("basicDetailSubmit");
	  
	 public WebElement Name() {
         return driver.findElement(name);
	 }
     public WebElement EmailID() {
         return driver.findElement(emailID);
	 }
     public WebElement Password() {
         return driver.findElement(password);
     }
     public WebElement Number() {
         return driver.findElement(number);
     }
     public WebElement WEYear() {
    	 return driver.findElement(weYear);
     }
     public WebElement WEMonth() {
    	 return driver.findElement(weMonth);
     }
    
     public WebElement UploadResume() {
 		return driver.findElement(uploadResume);
 	}
     public WebElement RegisterButton() {
         return driver.findElement(registerButton);
    	 }
	
	 
	    
}    
	    
		 
		



















/* @FindBy(how=How.XPATH, using="//input[@type='button'][@name='userType']") WebElement button;
		 @FindBy(how=How.XPATH, using="//input[@type='text'][@name='fname']") WebElement name;
		 @FindBy(how=How.XPATH, using="//input[@type='text'][@name='email']") WebElement emailId;
		 @FindBy(how=How.XPATH, using="//input[@type='password'][@name='password']") WebElement password;
		
		 
		public void ProfessionalButton() {
			button.click();
		}
		
		public void setName(String Name) {
			name.sendKeys(Name);
			}
		
		public void setEmailId(String EmailId) {
			name.sendKeys(EmailId);
			}
		
		public void setPassword(String Password) {
			name.sendKeys(Password);
			}*/
		 
		
		
		
		//public void ClickOnProfessionalButton() {
			//registerButton.click();


