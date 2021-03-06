#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Modification de l'adresse d'un abonné résidant en France sans ou avec date d'effet
				Modifier l'adresse 
				
	Scenario: Modifier Scenario
	    Given un abonné avec une adresse principale <active> en <pays>
	    When le conseiller connecté à <canal> modifie l'adresse de l'abonné <condition>
	    Then l'adresse de l'abonné modifiée est enregistrée sur l'ensemble des contrats de l'abonné
	    And un mouvement de modification d'adresse est créé
 
 Scenario Outline:
	    	    
	Examples: 
			|canal|active|pays|condition|
			|FACE|inactive|France|sans date d’effet|
			|EC|active|Pologne|avec date d’effet|
