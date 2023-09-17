package TestSuites;

import java.time.Duration;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class CommunStepDef {

	@Given("Utilisateur est bien connectee avec Email correct {string} et mdp correct {string}")
	public void utilisateur_est_bien_connectee_avec_email_correct_et_mdp_correct(String email, String mdp ) {
		Config.driver.get("https://www.jumia.com.tn/");
		LoginPage page = new LoginPage();
		Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		page.goToConx();
		page.entrermail(email);
		page.entrermdp(mdp);

	}
}
