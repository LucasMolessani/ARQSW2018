package br.usjt.arqsw.entity;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/** Classe Bean Chamado
 * @author	Lucas Vasconcelos Molessani
 * @version 1.00
 * @since   Release Inicial
 */	
public class Chamado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@NotNull(message="O id chamado n�o pode ser nulo")
	@Min(value=1, message="O id chamado n�o pode ser vazio")
	private int 	id;
	
	@NotNull(message="A descri��o n�o pode ser nula.")
	@Size(min=5, max=45, message="a descri��o do chamado deve estar entre 5 e 45 caracteres.")
	private String 	descricao;
	
	@NotNull(message="O status n�o pode ser nulo.")
	@Size(min=5, max=45, message="O status do chamado deve estar entre 5 e 45 caracteres.")
	private String 	status;
	
	@NotNull(message="A data de abertura n�o pode ser nula")
	@Min(value=1, message="A data de abertura n�o pode vazia")
	private Date	dt_abertura;
	private Date	dt_fechamento;
	
	@NotNull
	@Min(value=1, message="Deve conter um fila para esse chamado")
	private Fila fila;
	
	/** Modificador getId retorna o valor do id de um chamado
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @return 	int
	 */	
	public int getId() {
		return id;
	}
	
	/** SetId altera o valor do id de uma Fila
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Int
	 */	
	public void setId(int id) {
		this.id = id;
	}
	
	/** GetDescricao retorna a descricao de uma Fila
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @return 	String
	 */	
	public String getDescricao() {
		return descricao;
	}
	
	/** SetDescricao altera a propriedade  descricao
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	String
	 */	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	/** GetStatus retorna o Status de chamado
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @return 	String
	 */	
	public String getStatus() {
		return status;
	}
	
	/** SetStatus Altera o status de um chamado
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	String
	 */	
	public void setStatus(String status) {
		this.status = status;
	}
	
	/** GetDt_abertura retorna a data de abertura de um Chamado
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @return 	Date
	 */	
	public Date getDt_abertura() {
		return dt_abertura;
	}
	
	/** SetDt_abertura altera a data de abertura de um Chamado
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Date
	 */	
	public void setDt_abertura(Date dt_abertura) {
		this.dt_abertura = dt_abertura;
	}
	
	/** GetDt_fechamento retorna a data de fechamento de um Chamado
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @return 	Date
	 */	
	public Date getDt_fechamento() {
		return dt_fechamento;
	}
	
	/** SetDt_fechamento Altera a data de fechamento de um Chamado
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Date
	 */	
	public void setDt_fechamento(Date dt_fechamento) {
		this.dt_fechamento = dt_fechamento;
	}
	
	/** Retorna o objeto Fila
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @return 	Fila
	 */	
	public Fila getFila() {
		return fila;
	}
	
	/** Altera o objeto Fila 
	 * @author	Lucas Vasconcelos Molessani
	 * @version 1.00
	 * @since   Release Inicial
	 * @param	Fila
	 */	
	public void setFila(Fila fila) {
		this.fila = fila;
	}
	
	
}
