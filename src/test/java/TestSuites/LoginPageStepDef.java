package TestSuites;

import java.time.Duration;

import org.junit.Assert;

import org.openqa.selenium.edge.EdgeDriver;

import Helper.Config;

import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class LoginPageStepDef {
@Before
public void init() {
	Config.confEdge();
	Config.driver = new EdgeDriver();
	Config.maxWindow();
}

@Given("utilisateur sur la page acceuil")
public void utilisateur_sur_la_page_acceuil() {
   Config.driver.get("https://www.jumia.com.tn/");
}

@When("cliquer sur la liste se connecter")
public void cliquer_sur_la_liste_se_connecter() {
	
	LoginPage page = new LoginPage();
	Config.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	page.goToConx();
	
    
}



@When("Entrer le mail {string} et cliquer sur le bouton Continuer")
public void entrer_le_mail_cliquer_sur_le_bouton_continuer(String mail) {
	LoginPage page = new LoginPage();
	page.entrermail(mail);
}



@When("Entrer le mdp {string} et cliquer sur le bouton se connecter")
public void entrer_le_mdp_et_cliquer_sur_le_bouton_se_connecter(String mdp) {
	LoginPage page = new LoginPage();
	page.entrermdp(mdp);
}


@Then("utilisateur diriger vers la page accueil avec le msg {string}")
public void utilisateur_diriger_vers_la_page_accueil_avec_le_msg(String ExpectedMsg) {
   LoginPage page = new LoginPage();
    String actualMsg = page.verifmsg();
   
    Assert.assertEquals(actualMsg, ExpectedMsg);
}



}
