package templatemethod;
/**
 * 
 * @author Lucas Vasconcelos Molessani - 201508392
 *
 */
public class ManipuladorDuplicar extends ManipuladorAbstrato {

	protected String transformarString(String string) {
		return string + " " + string;
	}
}
