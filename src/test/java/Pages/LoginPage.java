package Pages;




import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;


public class LoginPage {
	
	@FindBy(xpath="//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")
	WebElement SeConnecter;
	
	@FindBy(xpath="//*[@id=\"dpdw-login-box\"]/div/div/a")
	WebElement Connecter;
	
	@FindBy(xpath="//*[@id=\"input_identifierValue\"]")
	WebElement mail;
	
	@FindBy(xpath="/html/body/div/div[4]/form/div/div[3]/div[2]/button")
	WebElement boutonContinuer;
	
	@FindBy(xpath="//*[@id=\"passwordForm\"]/div/div[3]/label/input")
	WebElement mdp;
	
	@FindBy(xpath="//*[@id=\"loginButton\"]")
	WebElement boutonSeConnecter;
	
	@FindBy(xpath="//*[@id=\"jm\"]/header/section/div[2]/div[1]/label")
	WebElement msg;
	
	@FindBy(xpath="//*[@id=\"pop\"]/div/section/button")
	WebElement X;
	
	public LoginPage() {
		PageFactory.initElements(Config.driver,this);
		
	}
	public void goToConx() {
		
     X.click();
    
      SeConnecter.click();
		Connecter.click();
	}
	
	public void entrermail(String Email ) {
		
		mail.sendKeys(Email);
		boutonContinuer.click();
				
	}
	 public void entrermdp(String mdpasse) {
		 mdp.sendKeys(mdpasse);
			boutonSeConnecter.click();
	 }
	public String verifmsg() {
		String actualMsg= msg.getText();
		return actualMsg;
		
	}
		

}
