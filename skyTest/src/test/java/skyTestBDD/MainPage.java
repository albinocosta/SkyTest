package skyTestBDD;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends MainpageElementMap {	
	
	public MainPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	public void acessoapaginasky() {		
						
		//Actions actions = new Actions(TestRule.getDriver());
		//actions.moveToElement(Fechaentrada).click().perform();
		WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(Fechaentrada));
		Fechaentrada.click();
		
				
	}

	public void acessoaprogramacao() {		
		Botaoprogram.click();
		
	}	

}
