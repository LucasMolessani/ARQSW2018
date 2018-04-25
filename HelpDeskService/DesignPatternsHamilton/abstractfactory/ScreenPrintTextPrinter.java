package abstractfactory;

/**
 * 
 * @author Lucas Vasconcelos Molessani
 *		   201508392
 *
 */
public class ScreenPrintTextPrinter implements TextPrinter {

	@Override
	public void print() {
		System.out.println("Screen Print");
	}

}
