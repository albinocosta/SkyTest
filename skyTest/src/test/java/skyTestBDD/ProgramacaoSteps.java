package skyTestBDD;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ProgramacaoSteps {
	
	@Given ("Eu acesso a pagina da Sky na web")
	public void acessoapaginasky() {
		MainPage mainPage = new MainPage();
		mainPage.acessoapaginasky();
		
	}
    @And ("navego para a pagina de programacao")
    public void acessoaprogramacao() {
    	MainPage mainPage = new MainPage();
    	mainPage.acessoaprogramacao();
    	
    }
    @When ("Acesso a programacao do momento")
    public void acessoaprogramacaoatual() {
    	ProgramacaoPage programacaoPage = new ProgramacaoPage();
    	programacaoPage.acessoaprogramacaoatual();
    	
    }
    @Then ("Eu comparo o nome e hora da programacao atual entre o Banner e o Modal")
    public void comparoasinfos() {
    	ProgramacaoPage programacaoPage = new ProgramacaoPage();
    	programacaoPage.comparoasinfos();
    	
    }

}
