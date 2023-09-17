package Pages;




import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class HomePage {
	
	@FindBy(xpath="//*[@id=\"jm\"]/main/div[1]/div[1]/div[1]/div/a/span")
	List<WebElement> menus;
	@FindBy(xpath="//*[@id=\"jm\"]/div[3]/button")
	WebElement close;
	
	public HomePage() {
		PageFactory.initElements(Config.driver, this);
	}
	
	public void clickOnMenuByName(String NameMenu) {
		close.click();
		try {
		for(WebElement menu:menus) {
			if(menu.getText().contains(NameMenu)) {
				menu.click();
			}
		}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
