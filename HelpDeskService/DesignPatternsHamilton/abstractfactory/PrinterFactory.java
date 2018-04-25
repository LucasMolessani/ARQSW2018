package abstractfactory;

/**
 * 
 * @author Lucas Vasconcelos Molessani
 *		   201508392
 *
 */
public class PrinterFactory implements AbstractPrinterFactory {

	@Override
	public TextPrinter getPrinterInstance(String printerType) {
		switch (printerType) {
		case "FILEPRINT": return new FilePrintTextPrinter();
		case "SCREENPRINT": return new ScreenPrintTextPrinter();
		}

		return null;
	}

}
