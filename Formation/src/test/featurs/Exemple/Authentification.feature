
@tag
Feature: Authentification
  En tant que admin je veux uthentifier

  @tag1
  Scenario: Authentification valide
    Given ouvrir navigateur
    And ouvrir url
    When saisir username
    And saisir mp
    And cliquer sur le bouton login
    Then vérifier le nom du profil

 
