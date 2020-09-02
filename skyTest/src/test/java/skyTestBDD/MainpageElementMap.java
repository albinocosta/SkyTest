package skyTestBDD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainpageElementMap {
	
	@FindBy (css = ".modal-header:nth-child(2) .sky_icon")
	protected WebElement Fechaentrada;
	
	@FindBy (linkText = "Programação")
	protected WebElement Botaoprogram;
		
}
