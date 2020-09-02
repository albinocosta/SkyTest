package skyTestBDD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainpageElementMap {
	
	@FindBy (css = "button[data-gtm='3']")
	protected WebElement Fechaentrada;
	
	@FindBy (linkText = "Programação")
	protected WebElement Botaoprogram;
		
}
