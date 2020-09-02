package skyTestBDD;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgramElementMap {
	
	@FindBy (css = ".schedule-live > .program-schedule-content:nth-child(1) > .program-schedule-title")
	protected WebElement Tituloquadro;
	
	@FindBy (css = ".schedule-live > .program-schedule-content:nth-child(1) p")
	protected WebElement Horaquadro;
	
	@FindBy (css = ".schedule-live > .program-schedule-content")
	protected WebElement Abreprogramatual;
	
	@FindBy (css = ".sky-modal-program-title > h2")
	protected WebElement Titulobanner;
	
	@FindBy (css = ".sky-modal-program-date-time > span")
	protected WebElement Horabanner;

}
