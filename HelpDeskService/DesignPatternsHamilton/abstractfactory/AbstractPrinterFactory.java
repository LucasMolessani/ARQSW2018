package abstractfactory;

/**
 * 
 * @author Lucas Vasconcelos Molessani
 *		   201508392
 *
 */
public interface AbstractPrinterFactory {
	TextPrinter getPrinterInstance(String printerType);

}
