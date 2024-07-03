package project_source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registration_page 
{

	WebDriver driver;
 
	  @FindBy(xpath="//a[@id='masterstudy-authorization-sign-up']")
	   WebElement signuplink;
	 
	   public void signup_link()
	   {
		   signuplink.click();
	   	}
	   
	   @FindBy(name="register_user_email")
	   WebElement email_field;
	 
	   public void email ()
	   {
		   email_field.sendKeys("ishanakodambadi@gmail.com");
	   	}
	   @FindBy(name="register_user_login")
	   WebElement usernamefield;
	 
	   public void username()
	   {
		   usernamefield.sendKeys("ishanakm");
	   	}
	   @FindBy(xpath="//input[@name='register_user_password']")
	   WebElement passwordfield;
	 
	   public void password()
	   {
		   passwordfield.sendKeys("Isha@1234");
	   	}
	   @FindBy(name="register_user_password_re")
	   WebElement passwordfield1;
	 
	   public void repeatpassword()
	   {
		   passwordfield1.sendKeys("Isha@1234");
	   	}
	   
	   @FindBy(xpath="(//span[@class='masterstudy-button__title'])[2]")
	   WebElement signup;
	   public void signup()
	   {
		   signup.click();
	   	}
	   
	   public registration_page (WebDriver driver)
	   {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }
}
