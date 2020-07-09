package pomTestCases;


import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


import pomJOB.PersonalDetails;
import pomJOB.RegisterNaukri;
import pomJOB.TestBase;




public class NaukriTest extends TestBase {
		
	@Test
	 public void Login() throws InterruptedException {
	 RegisterNaukri register = new RegisterNaukri(driver);
	 register.RegisterButton().click();
	 register.ProfessionalButton().click();	
	 
	 PersonalDetails details = new PersonalDetails(driver);
	 details.Name().sendKeys("L K NAIK");
	 details.EmailID().sendKeys("lknnaik@gmail.com");
	 details.Password().sendKeys("louis@149");
	 details.Number().sendKeys("8552655423");
	 details.WEYear().sendKeys("3");
	 Thread.sleep(3000);
	 details.WEMonth().sendKeys("2");
	 Thread.sleep(3000);
	 details.UploadResume().sendKeys("C:\\Users\\Lenovo\\Documents\\Document louis\\Louis CV\\CURRICULUM VITAE 05.06.2018.pdf");
	 details.RegisterButton().click();
	 
	
	 
	 
	
	}

   }

