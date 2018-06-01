package templatemethod;
/**
 * 
 * @author Lucas Vasconcelos Molessani - 201508392
 *
 */
public class ManipuladorMaiusculo extends ManipuladorAbstrato {

	protected String transformarString(String string) {
		return string.toUpperCase();
	}
}
