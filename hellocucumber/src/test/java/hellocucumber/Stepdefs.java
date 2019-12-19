package hellocucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefs {

	
	@Given("un abonné avec une adresse principale <active> en <pays>")
	public void un_abonné_avec_une_adresse_principale_active_en_pays() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("le conseiller connecté à <canal> modifie l{string}abonné <condition>")
	public void le_conseiller_connecté_à_canal_modifie_l_abonné_condition(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("l{string}abonné modifiée est enregistrée sur l{string}abonné")
	public void l_abonné_modifiée_est_enregistrée_sur_l_abonné(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("un mouvement de modification d'adresse est créé")
	public void un_mouvement_de_modification_d_adresse_est_créé() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
