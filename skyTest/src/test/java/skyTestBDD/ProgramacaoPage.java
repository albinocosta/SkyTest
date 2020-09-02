package skyTestBDD;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

public class ProgramacaoPage extends ProgramElementMap {
	
	public ProgramacaoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}	
	
	public void acessoaprogramacaoatual() {
		Abreprogramatual.click();		
		
	}	
	
	public void comparoasinfos() {
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
