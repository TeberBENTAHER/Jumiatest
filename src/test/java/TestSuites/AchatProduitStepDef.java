package TestSuites;

import Pages.AchatProduit;
import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AchatProduitStepDef {
	
	@When("Utilisateur clique sur le menu choisi")
	public void utilisateur_clique_sur_le_menu_choisi() {
	    HomePage page = new HomePage();
	    page.clickOnMenuByName("Téléphone & Tablette" );
	}

	@When("Utilisateur clique sur le produit choisi et clique sur le bouton jachete")
	public void utilisateur_clique_sur_le_produit_choisi_et_clique_sur_le_bouton_jachete() throws InterruptedException {
	    AchatProduit page = new AchatProduit();
	    page.AchatProduitChoisi("Infinix Hot 30i – 6.56\\\" – 8GB RAM (up to 16GB) + 128GO ROM – 50MP – Noir");
	}
	

	@Then("le produit est ajouter au panier")
	public void le_produit_est_ajouter_au_panier() {
		 AchatProduit page = new AchatProduit();
		 page.VerifPAnier();
		 System.out.println("le produit est ajouté avec succée");
	}

}
