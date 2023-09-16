#Author: teber
Feature: Consultation des menus de home page

  Background: 
    Given Utilisateur est bien connectee avec Email correct "teber.bentaher@gmail.com" et mdp correct "21346960"

  Scenario Outline: Acceder aus page de chaque menu de la page home
    When Utilisateur clique sur le "<menu>"
    Then La page de menu est affichee

    Examples: 
      | menu                     |
      | Téléphone & Tablette     |
     
