package skyTestBDD;

import org.openqa.selenium.support.PageFactory;

public class MainPage extends MainpageElementMap {
	
	
	public MainPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessoapaginasky() {		
		Fechaentrada.click();
				
	}

	public void acessoaprogramacao() {		
		Botaoprogram.click();
		
	}
	

}
