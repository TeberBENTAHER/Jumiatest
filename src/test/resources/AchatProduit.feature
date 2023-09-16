#Author: teber


Feature: Achat Produit

Background: 
    Given Utilisateur est bien connectee avec Email correct "teber.bentaher@gmail.com" et mdp correct "21346960"
  
  Scenario: Acheter un produit
    When Utilisateur clique sur le menu choisi
    And Utilisateur clique sur le produit choisi et clique sur le bouton jachete
    Then le produit est ajouter au panier
