package Pages;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class AchatProduit {
	
	@FindBy(xpath="//*[@id=\"ctlg\"]/div/div[1]/section/div/div/div[1]/article/a/div[1]")
	WebElement produit;
	
	@FindBy(xpath="/html/body/div[1]/main/div[1]/section/div/div[2]/div[3]/div/form")
	WebElement acheter;
	
	@FindBy(xpath="/html/body/div[1]/header/section/div[2]/a")
	WebElement panier;
	
	@FindBy(xpath="//*[@id=\"jm\"]/main/div/div[1]/article/article/a/div[2]/h3")
	WebElement Msg;
	
	public AchatProduit() {
		PageFactory.initElements(Config.driver, this);
	}
	
public void AchatProduitChoisi(String productName) throws InterruptedException {
	Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String script = "window.scrollTo(0, 300);";
	((JavascriptExecutor) Config.driver).executeScript(script);
	
	produit.click();
	acheter.click();
	Thread.sleep(3000);
		
}
public void VerifPAnier() {
	Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	panier.click();
	String actualMsg= Msg.getText();
	String expectedText = "Infinix Hot 30i – 6.56\" – 8GB RAM (up to 16GB) + 128GO ROM – 50MP – Noir";
	Assert.assertEquals(actualMsg, expectedText);
}

}
