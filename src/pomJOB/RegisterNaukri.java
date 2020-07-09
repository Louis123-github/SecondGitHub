package pomJOB;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterNaukri {
	WebDriver driver;
	 public RegisterNaukri(WebDriver driver){
	 this.driver=driver;
	 }
	 
	By registerButton= By.xpath("//*[@id=\"root\"]/div/div/div/div/div/div/div[1]/div[3]/div/a");
    By professionalButton= By.xpath("/html/body/div/form/div[2]/div/button");
   
   
   public WebElement RegisterButton() {
   	return driver.findElement(registerButton);
   }
   public WebElement ProfessionalButton() {
   	return driver.findElement(professionalButton);
   }
   
   
}
