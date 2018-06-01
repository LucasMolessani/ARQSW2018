package templatemethod;
/**
 * 
 * @author Lucas Vasconcelos Molessani - 201508392
 *
 */
public class ManipuladorInverter extends ManipuladorAbstrato {

	protected String transformarString(String string) {
		StringBuffer buffer = new StringBuffer(string.length());
		for (int i = string.length(); i > 0; i--)
			buffer.append(string.charAt(i - 1));
		return buffer.toString();
	}
}
