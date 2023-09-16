package Helper;

import org.openqa.selenium.WebDriver;

public class Config {
	public static WebDriver driver;
	public static void confEdge() {
		System.setProperty("WebDriver.edge.driver", "c:/msedgedriver.exe");
	}
	public static void maxWindow() {
		driver.manage().window().maximize();
	}


}
