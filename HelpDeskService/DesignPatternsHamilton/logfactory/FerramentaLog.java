package logfactory;import java.text.DateFormat;import java.text.SimpleDateFormat;/** *  * @author Lucas Vasconcelos Molessani *		   201508392 * */public abstract class FerramentaLog {	protected DateFormat dateFormat = new SimpleDateFormat("[dd.MM.yyyy, HH:mm] ");	public abstract void registrarLog(String mensagem);}