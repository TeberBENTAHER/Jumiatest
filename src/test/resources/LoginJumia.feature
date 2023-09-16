#Author Teber
Feature: Jumia Login


  Scenario:  connexion valide
  
    Given utilisateur sur la page acceuil
  
    When cliquer sur la liste se connecter
    
    And Entrer le mail "teber.bentaher@gmail.com" et cliquer sur le bouton Continuer
    And Entrer le mdp "21346960" et cliquer sur le bouton se connecter
    
    Then utilisateur diriger vers la page accueil avec le msg "Bonjour, Teber"
