package pizzariafactory;/** *  * @author Lucas Vasconcelos Molessani *		   201508392 * */public class PizzaioloPresunto implements Pizzaiolo {	public Pizza criarPizza() {		return new PizzaPresunto();	}	@Override	public Calzone criarCalzone() {		return new CalzonePresunto();	}}