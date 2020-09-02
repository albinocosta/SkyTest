package skyTestBDD;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgramacaoPage extends ProgramElementMap {
	
	public ProgramacaoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}	
	
	public void acessoaprogramacaoatual() {
		
		WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(Abreprogramatual));
		Abreprogramatual.click();		
		
	}	
	
	public void comparoasinfos() {
		
		WebDriverWait wait = new WebDriverWait(TestRule.getDriver(), 30);
		wait.until(ExpectedConditions.visibilityOf(Titulobanner));
		String Tituloquadroele = Tituloquadro.getText();
		String Titulobannerele = Titulobanner.getText();
		String Horaquadroele = Horaquadro.getText();
		String Horabannerele = Horabanner.getText();
		System.out.println(Tituloquadroele);
		System.out.println(Titulobannerele);
		System.out.println(Horaquadroele);
		System.out.println(Horabannerele);
		assertEquals(Tituloquadroele,Titulobannerele);
		assertEquals(Horaquadroele,Horabannerele);		
				
	}

}
